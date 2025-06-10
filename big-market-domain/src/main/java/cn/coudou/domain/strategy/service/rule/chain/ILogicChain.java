package cn.coudou.domain.strategy.service.rule.chain;

/**
 * 责任链接口
 */

public interface ILogicChain extends ILogicChainArmory {

    Integer logic(String userId, Long strategyId);
}
