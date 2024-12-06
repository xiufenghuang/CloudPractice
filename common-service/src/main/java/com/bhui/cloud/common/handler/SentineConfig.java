package com.bhui.cloud.common.handler;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import org.springframework.context.annotation.Bean;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/10/11 15:57
 */
public class SentineConfig {
    @Bean
    public BlockExceptionHandler blockExceptionHandler(){
        return new SentinelExceptionHandler();
    }
    @Bean
    public RequestOriginParser requestOriginParser(){
        return  new SentinelRequestOriginParser();
    }
}