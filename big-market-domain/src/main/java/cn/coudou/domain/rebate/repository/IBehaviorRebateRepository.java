package cn.coudou.domain.rebate.repository;

import cn.coudou.domain.rebate.model.aggregate.BehaviorRebateAggregate;
import cn.coudou.domain.rebate.model.valobj.BehaviorTypeVO;
import cn.coudou.domain.rebate.model.valobj.DailyBehaviorRebateVO;

import java.util.List;

/**
 * 行为返利仓储接口
 */

public interface IBehaviorRebateRepository {
    List<DailyBehaviorRebateVO> queryDailyBehaviorRebateConfig(BehaviorTypeVO behaviorTypeVO);

    void saveUserRebateRecord(String userId, List<BehaviorRebateAggregate> behaviorRebateAggregates);
}
