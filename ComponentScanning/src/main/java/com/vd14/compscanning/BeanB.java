package com.vd14.compscanning;

import lombok.Getter;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;

@Service("BeanBService")
@BeanQualifier
@Getter
public class BeanB implements BeanNameAware {
    private String beanName;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }
}
