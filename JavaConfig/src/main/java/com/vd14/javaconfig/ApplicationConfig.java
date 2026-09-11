package com.vd14.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean(name = {"beanA", "beanC"})
    public BeanA beanA() {
        return new BeanA();
    }
}
