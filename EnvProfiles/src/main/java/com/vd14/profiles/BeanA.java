package com.vd14.profiles;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component("beanA")
public class BeanA {
    @Value("${spring.profiles.active:UNKNOWN}")
    private String env;

    public void getStage() {
        System.out.println("Current env: " + env);
    }
}
