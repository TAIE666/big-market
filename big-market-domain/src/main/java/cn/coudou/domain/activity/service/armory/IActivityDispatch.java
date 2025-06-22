package cn.coudou.domain.activity.service.armory;

import java.util.Date;

/**
 * 活动调度【扣减库存】
 */

public interface IActivityDispatch {

    boolean subtractionActivitySkuStock(Long sku, Date endDateTime);
}
