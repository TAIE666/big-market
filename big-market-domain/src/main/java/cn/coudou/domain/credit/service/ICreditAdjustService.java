package cn.coudou.domain.credit.service;

import cn.coudou.domain.credit.model.entity.TradeEntity;

/**
 * 积分调额接口
 */

public interface ICreditAdjustService {

    String createOrder(TradeEntity tradeEntity);
}
