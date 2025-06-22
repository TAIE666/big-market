package cn.coudou.domain.activity.service.rule;

public interface IActionChainArmory {

    IActionChain next();

    IActionChain appendNext(IActionChain next);

}
