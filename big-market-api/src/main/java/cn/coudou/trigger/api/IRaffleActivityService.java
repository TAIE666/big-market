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

}
