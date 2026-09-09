package com.vd14.annotations;

public class BeanD {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        System.out.println("BeanD setId " + id);
        this.id = id;
    }
}
