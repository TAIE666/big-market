package cn.coudou.domain.activity.service;

import cn.coudou.domain.activity.model.entity.ActivityOrderEntity;
import cn.coudou.domain.activity.model.entity.ActivityShopCartEntity;

/**
 * 抽奖活动订单接口
 */

public interface IRaffleOrder {

    /**
     * 创建活动订单方法
     * @param activityShopCartEntity
     * @return
     */

    ActivityOrderEntity createRaffleActivityOrder(ActivityShopCartEntity activityShopCartEntity);
}
