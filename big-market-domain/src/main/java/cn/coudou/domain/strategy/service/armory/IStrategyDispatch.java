package cn.coudou.domain.strategy.service.armory;

/**
 * 策略抽奖调度
 */

public interface IStrategyDispatch {
    /**
     * 获取抽奖策略装配的结果
     * @param strategyId
     * @return
     */
    Integer getRandomAwardId(Long strategyId);

    Integer getRandomAwardId(Long strategyId, String ruleWeightValue);
}
