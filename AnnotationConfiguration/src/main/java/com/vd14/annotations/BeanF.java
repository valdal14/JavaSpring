package com.vd14.annotations;

import lombok.Getter;

@Getter
public class BeanF {
    private String id;

    public void setId(String id) {
        System.out.println("BeanD setId " + id);
        this.id = id;
    }
}
