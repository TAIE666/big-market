package cn.coudou.domain.award.service;

import cn.coudou.domain.award.model.entity.UserAwardRecordEntity;

/**
 * 奖品服务接口
 */

public interface IAwardService {

    void saveUserAwardRecord(UserAwardRecordEntity userAwardRecordEntity);
}
