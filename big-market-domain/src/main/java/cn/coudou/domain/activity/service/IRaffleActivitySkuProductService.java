package cn.coudou.domain.activity.service;

import cn.coudou.domain.activity.model.entity.SkuProductEntity;

import java.util.List;

/**
 * sku商品服务接口
 */
public interface IRaffleActivitySkuProductService {

    /**
     * 查询当前活动ID下，创建的 sku 商品。「sku可以兑换活动抽奖次数」
     */
    List<SkuProductEntity> querySkuProductEntityListByActivityId(Long activityId);

}

