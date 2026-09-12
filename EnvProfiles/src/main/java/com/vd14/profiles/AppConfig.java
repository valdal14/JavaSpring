package com.vd14.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

    @Profile("PROD")
    @Bean("beanA")
    public BeanA getBeanA() {
        BeanA beanA = new BeanA();
        beanA.setEnv(System.getenv("PROD"));
        return beanA;
    }

    @Profile("TEST")
    @Bean("beanA")
    public BeanA getTestBeanA() {
        BeanA beanA = new BeanA();
        beanA.setEnv(System.getenv("TEST"));
        return beanA;
    }

    @Profile("DEV")
    @Bean("beanA")
    public BeanA getDeveBeanA() {
        BeanA beanA = new BeanA();
        beanA.setEnv(System.getenv("DEVE"));
        return beanA;
    }
}
