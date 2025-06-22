package cn.coudou.infrastructure.persistent.dao;

import cn.coudou.infrastructure.persistent.po.RaffleActivityAccount;
import org.apache.ibatis.annotations.Mapper;

/**
 * 抽奖活动账户表
 */
@Mapper
public interface IRaffleActivityAccountDao {
    void insert(RaffleActivityAccount raffleActivityAccount);

    int updateAccountQuota(RaffleActivityAccount raffleActivityAccount);

}
