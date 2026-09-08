package com.vd14.springbean;

public abstract class SingletonWithMethodInjection {

    private Prototype prototype;

    public abstract Prototype createPrototype();

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }
}
