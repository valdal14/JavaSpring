package com.vd14.callbacks;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class BeanA {
    @Autowired
    private BeanB beanB;

    public BeanA() {
        System.out.println(beanB.getMessage());
    }
}
