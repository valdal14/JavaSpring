package com.vd14.annotations;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

@Getter
public class BeanContext {
    @Autowired
    private ApplicationContext applicationContext;

    public void checkContext() {
        System.out.println("APP NAME: " + applicationContext.getDisplayName());
    }
}
