package cn.coudou.domain.strategy.repository;

import cn.coudou.domain.strategy.model.entity.StrategyAwardEntity;
import cn.coudou.domain.strategy.model.entity.StrategyEntity;
import cn.coudou.domain.strategy.model.entity.StrategyRuleEntity;
import cn.coudou.domain.strategy.model.valobj.RuleTreeVO;
import cn.coudou.domain.strategy.model.valobj.StrategyAwardRuleModelVO;
import cn.coudou.domain.strategy.model.valobj.StrategyAwardStockKeyVO;

import java.util.List;
import java.util.Map;

/**
 * 策略仓储接口
 */
public interface IStrategyRepository {


    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(String key, int rateRange, Map<Integer, Integer> strategyAwardSearchRateTable);

    Integer getStrategyAwardAssemble(String key, int rateKey);

    int getRateRange(Long strategyId);

    int getRateRange(String key);

    StrategyEntity queryStrategyByStrategyId(Long strategyId);

    StrategyRuleEntity queryStrategyRule(Long strategyId, String ruleModel);

    String queryStrategyRuleValue(Long strategyId, Integer awardId, String ruleModel);

    String queryStrategyRuleValue(Long strategyId, String ruleModel);

    StrategyEntity queryStrategyEntityByStrategyId(Long strategyId);

    StrategyAwardRuleModelVO queryStrategyAwardRuleModelVO(Long strategyId, Integer awardId);

    RuleTreeVO queryRuleTreeVOByTreeId(String treeId);

    void cacheStrategyAwardCount(String cacheKey, Integer awardCount);

    Boolean subtractionAwardStock(String cacheKey);

    void awardStockConsumeSendQueue(StrategyAwardStockKeyVO strategyAwardStockKeyVO);

    StrategyAwardStockKeyVO takeQueueValue();

    void updateStrategyAwardStock(Long strategyId, Integer awardId);
}
