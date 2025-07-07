package cn.coudou.domain.rebate.service;

import cn.coudou.domain.rebate.model.entity.BehaviorEntity;
import cn.coudou.domain.rebate.model.entity.BehaviorRebateOrderEntity;

import java.util.List;

public interface IBehaviorRebateService {

    List<String> createOrder(BehaviorEntity behaviorEntity);

    List<BehaviorRebateOrderEntity> queryOrderByOutBusinessNo(String userId, String outBusinessNo);
}
