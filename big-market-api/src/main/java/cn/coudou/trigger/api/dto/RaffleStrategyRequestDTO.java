package cn.coudou.trigger.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 抽奖请求参数
 */
@Data
public class RaffleStrategyRequestDTO implements Serializable {

    // 抽奖策略ID
    private Long strategyId;

}

