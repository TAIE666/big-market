package cn.coudou.domain.strategy.service.raffle;

import cn.coudou.domain.strategy.model.entity.StrategyAwardEntity;
import cn.coudou.domain.strategy.model.valobj.RuleTreeVO;
import cn.coudou.domain.strategy.model.valobj.StrategyAwardRuleModelVO;
import cn.coudou.domain.strategy.model.valobj.StrategyAwardStockKeyVO;
import cn.coudou.domain.strategy.repository.IStrategyRepository;
import cn.coudou.domain.strategy.service.AbstractRaffleStrategy;
import cn.coudou.domain.strategy.service.IRaffleAward;
import cn.coudou.domain.strategy.service.IRaffleStock;
import cn.coudou.domain.strategy.service.armory.IStrategyDispatch;
import cn.coudou.domain.strategy.service.rule.chain.ILogicChain;
import cn.coudou.domain.strategy.service.rule.chain.factory.DefaultChainFactory;
import cn.coudou.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;
import cn.coudou.domain.strategy.service.rule.tree.factory.engine.IDecisionTreeEngine;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DefaultRaffleStrategy extends AbstractRaffleStrategy implements IRaffleAward, IRaffleStock {

    public DefaultRaffleStrategy(IStrategyRepository repository, IStrategyDispatch strategyDispatch, DefaultChainFactory defaultChainFactory, DefaultTreeFactory defaultTreeFactory) {
        super(repository, strategyDispatch, defaultChainFactory, defaultTreeFactory);
    }

    @Override
    public DefaultChainFactory.StrategyAwardVO raffleLogicChain(String userId, Long strategyId) {
        ILogicChain logicChain = defaultChainFactory.openLogicChain(strategyId);
        return logicChain.logic(userId, strategyId);
    }

    @Override
    public DefaultTreeFactory.StrategyAwardVO raffleLogicTree(String userId, Long strategyId, Integer awardId) {
        // 判断奖品id能否拿到
        StrategyAwardRuleModelVO strategyAwardRuleModelVO = repository.queryStrategyAwardRuleModelVO(strategyId, awardId);
        if (strategyAwardRuleModelVO == null) {
            return DefaultTreeFactory.StrategyAwardVO.builder().awardId(awardId).build();
        }

        RuleTreeVO ruleTreeVO = repository.queryRuleTreeVOByTreeId(strategyAwardRuleModelVO.getRuleModels());
        if (ruleTreeVO == null) {
            throw new RuntimeException("存在抽奖策略配置的规则模型 Key，未在库表 rule_tree、rule_tree_node、rule_tree_line 配置对应的规则树信息 " + strategyAwardRuleModelVO.getRuleModels());
        }

        IDecisionTreeEngine treeEngine = defaultTreeFactory.openLogicTree(ruleTreeVO);
        return treeEngine.process(userId, strategyId, awardId);
    }

    @Override
    public StrategyAwardStockKeyVO takeQueueValue() throws InterruptedException {
        return repository.takeQueueValue();
    }

    @Override
    public void updateStrategyAwardStock(Long strategyId, Integer awardId) {
        repository.updateStrategyAwardStock(strategyId, awardId);
    }

    @Override
    public List<StrategyAwardEntity> queryRaffleStrategyAwardList(Long strategyId) {
        return repository.queryStrategyAwardList(strategyId);
    }
}
