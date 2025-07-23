package cn.coudou.domain.credit.repository;


import cn.coudou.domain.credit.model.aggregate.TradeAggregate;
import cn.coudou.domain.credit.model.entity.CreditAccountEntity;

/**
 * 用户积分仓储
 */
public interface ICreditRepository {

    void saveUserCreditTradeOrder(TradeAggregate tradeAggregate);

    CreditAccountEntity queryUserCreditAccount(String userId);
}

