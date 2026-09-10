package com.vd14.annotations;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Data
public class BeanB {
    private Benable benableFirst;
    private Benable benableSecond;

    @Autowired
    public BeanB(@Qualifier("first") Benable benableFirst, @Qualifier("second") Benable benableSecond) {
        System.out.println("BeanB constructor");
        this.benableFirst = benableFirst;
        this.benableSecond = benableSecond;
    }

    public void execBeanFirst() {
        benableFirst.execute();
    }

    public void execBeanSecond() {
        benableSecond.execute();
    }
}
