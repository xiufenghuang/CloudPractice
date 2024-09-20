package com.bhui.cloud.api.facade;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.bhui.cloud.api.pojo.query.LoginQuery;
import com.bhui.cloud.common.pojo.ResponseData;

/**
 * @author mqxu
 * @date 2024/9/19
 * @description 用户登录服务接口
 **/
public interface LoginFacade {

    @PostMapping("/login")
    ResponseData<String> login(@RequestBody LoginQuery loginQuery);

}