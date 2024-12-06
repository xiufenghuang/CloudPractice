package com.bhui.cloud.common.handler;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/10/11 15:55
 */
@Slf4j
public class SentinelRequestOriginParser implements com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser {
    @Override
    public String parseOrigin(HttpServletRequest httpServletRequest) {
        return httpServletRequest.getParameter("serviceName");
    }


}