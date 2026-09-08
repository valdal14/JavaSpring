package com.vd14.springbean;

public class CallablePojo implements CallableBean {
    @Override
    public void call() {
        System.out.println("CallablePojo is executing the call() method...");
    }
}
