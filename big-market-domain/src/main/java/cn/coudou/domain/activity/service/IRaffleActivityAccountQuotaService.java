package cn.coudou.domain.activity.service;

import cn.coudou.domain.activity.model.entity.ActivityAccountEntity;
import cn.coudou.domain.activity.model.entity.SkuRechargeEntity;

/**
 * 抽奖活动订单接口
 */

public interface IRaffleActivityAccountQuotaService {

    /**
     * 创建sku充值订单
     * @param skuRechargeEntity
     * @return
     */
    String createOrder(SkuRechargeEntity skuRechargeEntity);

    /**
     * 查询活动账户 - 日，参与次数
     *
     * @param activityId 活动ID
     * @param userId     用户ID
     * @return 参与次数
     */
    Integer queryRaffleActivityAccountDayPartakeCount(Long activityId, String userId);

    /**
     * 查询活动账户额度「总、月、日」
     *
     * @param activityId 活动ID
     * @param userId     用户ID
     * @return 账户实体
     */
    ActivityAccountEntity queryActivityAccountEntity(Long activityId, String userId);
}
