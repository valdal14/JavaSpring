package com.vd14.jc;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class BeanB {
    private BeanC beanC;

    @Autowired
    public void setBeanC(BeanC beanC) {
        this.beanC = beanC;
    }
}
