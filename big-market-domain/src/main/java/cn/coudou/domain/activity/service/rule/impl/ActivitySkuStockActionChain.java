package cn.coudou.domain.activity.service.rule.impl;

import cn.coudou.domain.activity.model.entity.ActivityCountEntity;
import cn.coudou.domain.activity.model.entity.ActivityEntity;
import cn.coudou.domain.activity.model.entity.ActivitySkuEntity;
import cn.coudou.domain.activity.service.rule.AbstractActionChain;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 抽奖活动单 持久化对象
 */

@Slf4j
@Component("activity_sku_stock_action")
public class ActivitySkuStockActionChain extends AbstractActionChain {

    @Override
    public boolean action(ActivitySkuEntity activitySkuEntity, ActivityEntity activityEntity, ActivityCountEntity activityCountEntity) {
        log.info("活动责任链-商品库存处理【校验&扣减】开始。");

        return true;
    }
}

