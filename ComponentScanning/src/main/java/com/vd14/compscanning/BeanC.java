package com.vd14.compscanning;

import lombok.Getter;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Repository;

@Repository("BeanC")
@Getter
public class BeanC implements BeanNameAware {
    private String beanName;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }
}
