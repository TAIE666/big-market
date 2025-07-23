package cn.coudou.domain.activity.service.product;

import cn.coudou.domain.activity.model.entity.SkuProductEntity;
import cn.coudou.domain.activity.repository.IActivityRepository;
import cn.coudou.domain.activity.service.IRaffleActivitySkuProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * sku商品服务
 */

@Service
public class RaffleActivitySkuProductService implements IRaffleActivitySkuProductService {

    @Resource
    private IActivityRepository repository;

    @Override
    public List<SkuProductEntity> querySkuProductEntityListByActivityId(Long activityId) {
        return repository.querySkuProductEntityListByActivityId(activityId);
    }
}
