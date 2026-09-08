package com.vd14.springbean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Singleton implements ApplicationContextAware {

    private Prototype prototype;
    private ApplicationContext context;

    public Prototype createPrototype() {
        return context.getBean("prototype", Prototype.class);
    }

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
