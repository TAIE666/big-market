package cn.coudou.trigger.api;

import cn.coudou.trigger.api.dto.*;
import cn.coudou.types.model.Response;

import java.util.List;

/**
 * 抽奖活动接口
 */

public interface IRaffleActivityService {

    /**
     * 活动装配，数据预热缓存
     */
    Response<Boolean> armory(Long activityId);

    /**
     * 活动抽奖接口
     */
    Response<ActivityDrawResponseDTO> draw(ActivityDrawRequestDTO request);

    /**
     * 日历签到返利接口
     *
     * @param userId 用户ID
     * @return 签到结果
     */
    Response<Boolean> calendarSignRebate(String userId);

    /**
     * 判断是否完成日历签到返利接口
     *
     * @param userId 用户ID
     * @return 签到结果 true 已签到，false 未签到
     */
    Response<Boolean> isCalendarSignRebate(String userId);

    /**
     * 查询用户活动账户
     *
     * @param request 请求对象「活动ID、用户ID」
     * @return 返回结果「总额度、月额度、日额度」
     */
    Response<UserActivityAccountResponseDTO> queryUserActivityAccount(UserActivityAccountRequestDTO request);
}
