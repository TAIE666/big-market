package cn.coudou.domain.activity.service.quota.policy.impl;

import cn.coudou.domain.activity.model.aggregate.CreateQuotaOrderAggregate;
import cn.coudou.domain.activity.model.valobj.OrderStateVO;
import cn.coudou.domain.activity.repository.IActivityRepository;
import cn.coudou.domain.activity.service.quota.policy.ITradePolicy;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * 返利无支付交易订单，直接充值到账
 */

@Service("rebate_no_pay_trade")
public class RebateNoPayTradePolicy implements ITradePolicy {

    private final IActivityRepository activityRepository;

    public RebateNoPayTradePolicy(IActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @Override
    public void trade(CreateQuotaOrderAggregate createQuotaOrderAggregate) {
        createQuotaOrderAggregate.setOrderState(OrderStateVO.completed);
        createQuotaOrderAggregate.getActivityOrderEntity().setPayAmount(BigDecimal.ZERO);
        activityRepository.doSaveNoPayOrder(createQuotaOrderAggregate);
    }
}
