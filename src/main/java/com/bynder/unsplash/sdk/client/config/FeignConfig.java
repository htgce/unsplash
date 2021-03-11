package com.bynder.unsplash.sdk.client.config;

import feign.RequestInterceptor;
import feign.codec.Decoder;
import feign.jackson.JacksonDecoder;
import org.springframework.context.annotation.Bean;

public class FeignConfig {
    private static final String AUTHORIZATION_HEADER = "Authorization";
    private static final String TOKEN_TYPE = "Bearer";
    private static final String TOKEN_VALUE = "5bgfBzj1jCfjcIcw6wi2eIaZ0-hsehxfrSGCdvWANs0";

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.header(AUTHORIZATION_HEADER, String.format("%s %s", TOKEN_TYPE, TOKEN_VALUE));
        };
    }

    @Bean
    public Decoder feignDecoder() {
        return new JacksonDecoder();
    }

}
