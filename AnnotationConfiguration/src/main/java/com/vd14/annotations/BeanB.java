package com.vd14.annotations;

import lombok.Data;

@Data
public class BeanB {
    private Benable benableFirst;
    private Benable benableSecond;

    public BeanB(Benable benableFirst, Benable benableSecond) {
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
