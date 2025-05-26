package cn.coudou.test.infrastructure;

import cn.coudou.infrastructure.persistent.dao.IAwardDao;
import cn.coudou.infrastructure.persistent.dao.IStrategyAwardDao;
import cn.coudou.infrastructure.persistent.dao.IStrategyDao;
import cn.coudou.infrastructure.persistent.dao.IStrategyRuleDao;
import cn.coudou.infrastructure.persistent.po.Award;
import cn.coudou.infrastructure.persistent.po.Strategy;
import cn.coudou.infrastructure.persistent.po.StrategyAward;
import cn.coudou.infrastructure.persistent.po.StrategyRule;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DaoTest {

    @Resource
    private IAwardDao awardDao;
    @Resource
    private IStrategyDao strategyDao;
    @Resource
    private IStrategyRuleDao strategyRuleDao;
    @Resource
    private IStrategyAwardDao strategyAwardDao;

    @Test
    public void test_queryAwardList() {
        List<Award> awards = awardDao.queryAwardList();
        log.info("测试结果: {}", JSON.toJSONString(awards));
    }
    @Test
    public void test_queryStrategyAwardList() {
        List<StrategyAward> strategyAwards = strategyAwardDao.queryStrategyAwardList();
        log.info("测试结果: {}", JSON.toJSONString(strategyAwards));
    }
    @Test
    public void queryStrategyList() {
        List<Strategy> strategies = strategyDao.queryStrategyList();
        log.info("测试结果: {}", JSON.toJSONString(strategies));
    }
    @Test
    public void queryStrategyRuleList() {
        List<StrategyRule> strategyRules = strategyRuleDao.queryStrategyRuleList();
        log.info("测试结果: {}", JSON.toJSONString(strategyRules));
    }
}
