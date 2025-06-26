package cn.coudou.domain.rebate.service;

import cn.coudou.domain.rebate.model.entity.BehaviorEntity;

import java.util.List;

public interface IBehaviorRebateService {

    List<String> createOrder(BehaviorEntity behaviorEntity);
}
