package cn.coudou.domain.strategy.service;

import cn.coudou.domain.strategy.model.entity.StrategyAwardEntity;

import java.util.List;

/**
 * 策略奖品接口
 */
public interface IRaffleAward {

    /**
     * 根据策略ID查询抽奖奖品列表配置
     *
     * @param strategyId
     * @return
     */
    List<StrategyAwardEntity> queryRaffleStrategyAwardList(Long strategyId);

}

