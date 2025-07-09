package cn.coudou.domain.award.service.distribute;

import cn.coudou.domain.award.model.entity.DistributeAwardEntity;

/**
 * 分发奖品接口
 */

public interface IDistributeAward {

    void giveOutPrizes(DistributeAwardEntity distributeAwardEntity);

}
