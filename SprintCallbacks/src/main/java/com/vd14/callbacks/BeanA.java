package com.vd14.callbacks;

import lombok.Data;

@Data
public class BeanA {
    private BeanB beanB;

    public void init() {
        System.out.println(beanB.getMessage());
    }

    public void destroy() {
        System.out.println("Destroy BeanA");
    }
}
