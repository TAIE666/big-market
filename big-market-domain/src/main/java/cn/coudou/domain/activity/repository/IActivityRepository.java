package cn.coudou.domain.activity.repository;

import cn.coudou.domain.activity.model.aggregate.CreateOrderAggregate;
import cn.coudou.domain.activity.model.entity.ActivityCountEntity;
import cn.coudou.domain.activity.model.entity.ActivityEntity;
import cn.coudou.domain.activity.model.entity.ActivitySkuEntity;

/**
 * 活动仓储接口
 */

public interface IActivityRepository {

    ActivitySkuEntity queryActivitySku(Long sku);

    ActivityEntity queryRaffleActivityByActivityId(Long activityId);

    ActivityCountEntity queryRaffleActivityCountByActivityCountId(Long activityCountId);

    void doSaveOrder(CreateOrderAggregate createOrderAggregate);
}
