package cn.coudou.domain.activity.service;

import cn.coudou.domain.activity.model.entity.PartakeRaffleActivityEntity;
import cn.coudou.domain.activity.model.entity.UserRaffleOrderEntity;

/**
 * 抽奖活动参与服务
 */

public interface IRaffleActivityPartakeService {

    UserRaffleOrderEntity createOrder(PartakeRaffleActivityEntity partakeRaffleActivityEntity);

    UserRaffleOrderEntity createOrder(String userId, Long activityId);
}
