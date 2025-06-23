package cn.coudou.domain.activity.service;

import cn.coudou.domain.activity.model.entity.SkuRechargeEntity;

/**
 * 抽奖活动订单接口
 */

public interface IRaffleActivityAccountQuotaService {

    /**
     * 创建sku充值订单
     * @param skuRechargeEntity
     * @return
     */
    String createOrder(SkuRechargeEntity skuRechargeEntity);
}
