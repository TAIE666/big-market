package cn.coudou.domain.strategy.service;

import cn.coudou.domain.strategy.model.entity.RaffleAwardEntity;
import cn.coudou.domain.strategy.model.entity.RaffleFactorEntity;

/**
 * 抽奖策略接口
 */

public interface IRaffleStrategy {

    RaffleAwardEntity performRaffle(RaffleFactorEntity raffleFactorEntity);
}
