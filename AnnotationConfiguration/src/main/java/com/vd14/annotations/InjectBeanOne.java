package com.vd14.annotations;

public class InjectBeanOne implements Benable{
    private BeanC beanC;

    @Override
    public void execute() {
        System.out.println("InjectBeanOne execute");
    }

    public BeanC getBeanC() {
        return beanC;
    }

    public void setBeanC(BeanC beanC) {
        System.out.println("setBeanC called");
        this.beanC = beanC;
    }
}
