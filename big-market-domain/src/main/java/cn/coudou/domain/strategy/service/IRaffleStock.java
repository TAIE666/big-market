package cn.coudou.domain.strategy.service;

import cn.coudou.domain.strategy.model.valobj.StrategyAwardStockKeyVO;

/**
 * 奖品库存接口
 */

public interface IRaffleStock {

    /**
     * 获取奖品库存消耗队列
     */
    StrategyAwardStockKeyVO takeQueueValue() throws InterruptedException;

    /**
     * 更新奖品库存消耗记录
     */
    void updateStrategyAwardStock(Long strategyId, Integer awardId);

}
