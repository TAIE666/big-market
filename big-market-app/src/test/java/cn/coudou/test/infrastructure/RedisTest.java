package cn.coudou.test.infrastructure;

import cn.coudou.infrastructure.persistent.dao.IAwardDao;
import cn.coudou.infrastructure.persistent.dao.IStrategyAwardDao;
import cn.coudou.infrastructure.persistent.dao.IStrategyDao;
import cn.coudou.infrastructure.persistent.dao.IStrategyRuleDao;
import cn.coudou.infrastructure.persistent.po.Award;
import cn.coudou.infrastructure.persistent.po.Strategy;
import cn.coudou.infrastructure.persistent.po.StrategyAward;
import cn.coudou.infrastructure.persistent.po.StrategyRule;
import cn.coudou.infrastructure.persistent.redis.IRedisService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RMap;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Resource
    private IRedisService redisService;

    @Test
    public void test_redis() {
        RMap<Object, Object> map = redisService.getMap("strategy_id_100001");
        map.put(1, 101);
        map.put(2, 101);
        map.put(3, 101);
        map.put(4, 102);
        map.put(5, 103);
        map.put(6, 104);
        log.info("测试结果:{}", redisService.getFromMap("strategy_id_100001", 1).toString());
    }

}
