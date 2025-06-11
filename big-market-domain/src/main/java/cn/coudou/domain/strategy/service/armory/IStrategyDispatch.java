package cn.coudou.domain.strategy.service.armory;

/**
 * 策略抽奖调度
 */

public interface IStrategyDispatch {
    /**
     * 获取抽奖策略装配的随机结果
     */
    Integer getRandomAwardId(Long strategyId);

    /**
     * 获取抽奖策略装配的随机结果
     */
    Integer getRandomAwardId(Long strategyId, String ruleWeightValue);

    /**
     * 获取抽奖策略装配的随机结果
     */
    Integer getRandomAwardId(String key);

    /**
     * 根据策略ID和奖品ID，扣减奖品缓存库存
     */
    Boolean subtractionAwardStock(Long strategyId, Integer awardId);

}
