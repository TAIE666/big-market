package cn.coudou.domain.strategy.repository;

import cn.coudou.domain.strategy.model.entity.StrategyAwardEntity;
import cn.coudou.domain.strategy.model.entity.StrategyEntity;
import cn.coudou.domain.strategy.model.entity.StrategyRuleEntity;
import cn.coudou.domain.strategy.model.valobj.StrategyAwardRuleModelVO;

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

    StrategyEntity queryStrategyEntityByStrategyId(Long strategyId);

    StrategyAwardRuleModelVO queryStrategyAwardRuleModelVO(Long strategyId, Integer awardId);
}
