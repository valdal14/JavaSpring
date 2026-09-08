package com.vd14.springbean;

public class BeanE {
    private final CallableBean callableBean;

    public BeanE(CallableBean callableBean) {
        this.callableBean = callableBean;
    }

    public void execute() {
        System.out.println("Executing BeanE Method from CallableBean");
        callableBean.call();
    }
}
