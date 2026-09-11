package com.vd14.jc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public BeanA beanA() {
        return new BeanA(beanB());
    }

    @Bean
    public BeanB beanB() {
        BeanB beanB = new BeanB();
        beanB.setBeanC(beanC());
        return beanB;
    }

    @Bean
    public BeanC beanC() {
        BeanC beanC = new BeanC();
        beanC.setMessage("Hello World");
        return beanC;
    }
}
