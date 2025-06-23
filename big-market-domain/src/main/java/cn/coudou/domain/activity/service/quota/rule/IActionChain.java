package cn.coudou.domain.activity.service.quota.rule;

import cn.coudou.domain.activity.model.entity.ActivityCountEntity;
import cn.coudou.domain.activity.model.entity.ActivityEntity;
import cn.coudou.domain.activity.model.entity.ActivitySkuEntity;

public interface IActionChain extends IActionChainArmory {

    boolean action(ActivitySkuEntity activitySkuEntity, ActivityEntity activityEntity, ActivityCountEntity activityCountEntity);
}
