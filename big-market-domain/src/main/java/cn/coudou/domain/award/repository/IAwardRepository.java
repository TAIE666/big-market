package cn.coudou.domain.award.repository;

import cn.coudou.domain.award.model.aggregate.UserAwardRecordAggregate;

/**
 * 奖品仓储接口
 */

public interface IAwardRepository {

    void saveUserAwardRecord(UserAwardRecordAggregate userAwardRecordAggregate);
}
