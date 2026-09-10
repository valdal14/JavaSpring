package com.vd14.qualifiers;

import lombok.Getter;

@Getter
public class BeanB {
    private String myProperty;

    public void setMyProperty(String myProperty) {
        System.out.println("setMyProperty: " + myProperty);
        this.myProperty = myProperty;
    }
}
