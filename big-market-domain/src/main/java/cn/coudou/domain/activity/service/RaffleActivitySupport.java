package cn.coudou.domain.activity.service;

import cn.coudou.domain.activity.model.entity.ActivityCountEntity;
import cn.coudou.domain.activity.model.entity.ActivityEntity;
import cn.coudou.domain.activity.model.entity.ActivitySkuEntity;
import cn.coudou.domain.activity.repository.IActivityRepository;
import cn.coudou.domain.activity.service.rule.factory.DefaultActivityChainFactory;

/**
 * 抽奖活动的支撑类
 */

public class RaffleActivitySupport {

    protected DefaultActivityChainFactory defaultActivityChainFactory;

    protected IActivityRepository activityRepository;

    public RaffleActivitySupport(IActivityRepository activityRepository, DefaultActivityChainFactory defaultActivityChainFactory) {
        this.activityRepository = activityRepository;
        this.defaultActivityChainFactory = defaultActivityChainFactory;
    }

    public ActivitySkuEntity queryActivitySku(Long sku) {
        return activityRepository.queryActivitySku(sku);
    }

    public ActivityEntity queryRaffleActivityByActivityId(Long activityId) {
        return activityRepository.queryRaffleActivityByActivityId(activityId);
    }

    public ActivityCountEntity queryRaffleActivityCountByActivityCountId(Long activityCountId) {
        return activityRepository.queryRaffleActivityCountByActivityCountId(activityCountId);
    }

}
