package cn.coudou.domain.activity.service;

import cn.coudou.domain.activity.model.entity.ActivityOrderEntity;
import cn.coudou.domain.activity.model.entity.ActivityShopCartEntity;
import cn.coudou.domain.activity.model.entity.SkuRechargeEntity;

/**
 * 抽奖活动订单接口
 */

public interface IRaffleOrder {

    /**
     * 创建sku充值订单
     * @param skuRechargeEntity
     * @return
     */
    String createSkuRechargeOrder(SkuRechargeEntity skuRechargeEntity);
}
