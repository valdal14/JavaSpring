package com.vd14.annotations;

public class InjectBeanTwo implements Benable{
    private BeanD beanD;

    @Override
    public void execute() {
        System.out.println("InjectBeanTwo execute");
    }

    public BeanD getBeanD() {
        return beanD;
    }

    public void setBeanD(BeanD beanD) {
        System.out.println("setBeanD called");
        this.beanD = beanD;
    }

}
