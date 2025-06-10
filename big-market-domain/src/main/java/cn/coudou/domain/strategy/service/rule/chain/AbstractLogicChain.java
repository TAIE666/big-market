package cn.coudou.domain.strategy.service.rule.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * 责任链抽象类
 */

@Slf4j
public abstract class AbstractLogicChain implements ILogicChain {

    private ILogicChain next;

    @Override
    public ILogicChain next() {
        return next;
    }

    @Override
    public ILogicChain appendNext(ILogicChain next) {
        this.next = next;
        return next;
    }

    protected abstract String ruleModel();

}

