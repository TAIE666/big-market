package cn.coudou.domain.strategy.service.armory;

/**
 * 策略装配库，负责初始化策略计算
 */

public interface IStrategyArmory {
    /**
     * 装配策略
     * @param strategyId
     * @return
     */
    boolean assembleLotteryStrategy(Long strategyId);

}
