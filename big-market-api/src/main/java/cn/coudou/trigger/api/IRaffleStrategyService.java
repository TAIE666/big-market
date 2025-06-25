package cn.coudou.trigger.api;

import cn.coudou.trigger.api.dto.RaffleAwardListRequestDTO;
import cn.coudou.trigger.api.dto.RaffleAwardListResponseDTO;
import cn.coudou.trigger.api.dto.RaffleStrategyRequestDTO;
import cn.coudou.trigger.api.dto.RaffleStrategyResponseDTO;
import cn.coudou.types.model.Response;

import java.util.List;

/**
 * 抽奖服务接口
 */

public interface IRaffleStrategyService {

    /**
     * 策略装配接口
     * @param strategyId
     * @return
     */
    Response<Boolean> strategyArmory(Long strategyId);

    /**
     * 查询抽奖奖品列表配置
     * @param requestDTO
     * @return
     */
    Response<List<RaffleAwardListResponseDTO>> queryRaffleAwardList(RaffleAwardListRequestDTO requestDTO);

    /**
     * 随机抽奖接口
     * @param requestDTO
     * @return
     */
    Response<RaffleStrategyResponseDTO> randomRaffle(RaffleStrategyRequestDTO requestDTO);
}
