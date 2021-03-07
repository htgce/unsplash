package com.bynder.unsplash.sdk.client.config;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;

public class FeignConfig {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.header("Content-Type", "application/json");
            requestTemplate.header("Accept", "application/json");
            requestTemplate.header("client_id", "cldjojM-4rJ5c8mvCvHv-PAQq_fltmJPJxYoAf2s-zk");
        };
    }
}
