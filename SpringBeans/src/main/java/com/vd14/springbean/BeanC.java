package com.vd14.springbean;

public class BeanC {

    private int lifetime;
    private BeanB beanB;

    public void setLifetime(int lifetime) {
        System.out.println("set lifetime " + lifetime);
        this.lifetime = lifetime;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setBeanB(BeanB beanB) {
        System.out.println("set beanB " + beanB);
        this.beanB = beanB;
    }

    public BeanB getBeanB() {
        System.out.println("get beanB " + beanB);
        return beanB;
    }
}
