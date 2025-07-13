package cn.coudou.domain.activity.service.quota.policy;

import cn.coudou.domain.activity.model.aggregate.CreateQuotaOrderAggregate;

/**
 * 交易策略接口
 */

public interface ITradePolicy {

    void trade(CreateQuotaOrderAggregate createQuotaOrderAggregate);

}
