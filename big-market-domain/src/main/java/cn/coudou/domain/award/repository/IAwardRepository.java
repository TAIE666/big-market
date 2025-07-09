package cn.coudou.domain.award.repository;

import cn.coudou.domain.award.model.aggregate.GiveOutPrizesAggregate;
import cn.coudou.domain.award.model.aggregate.UserAwardRecordAggregate;

/**
 * 奖品仓储接口
 */

public interface IAwardRepository {

    void saveUserAwardRecord(UserAwardRecordAggregate userAwardRecordAggregate);

    String queryAwardConfig(Integer awardId);

    void saveGiveOutPrizesAggregate(GiveOutPrizesAggregate giveOutPrizesAggregate);

    String queryAwardKey(Integer awardId);
}
