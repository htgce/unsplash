package com.bynder.unsplash.sdk.client.config;

import feign.RequestInterceptor;
import feign.codec.Decoder;
import feign.jackson.JacksonDecoder;
import org.springframework.context.annotation.Bean;

public class FeignConfig {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            //requestTemplate.header("Client-ID", "cldjojM-4rJ5c8mvCvHv-PAQq_fltmJPJxYoAf2s-zk");
        };
    }
    @Bean
    public Decoder feignDecoder() {
        return new JacksonDecoder();
    }

}
