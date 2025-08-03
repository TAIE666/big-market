package cn.coudou.trigger.api;

import cn.coudou.types.model.Response;

/**
 * DCC动态配置中心
 */
public interface IDCCService {

    Response<Boolean> updateConfig(String key, String value);

}

