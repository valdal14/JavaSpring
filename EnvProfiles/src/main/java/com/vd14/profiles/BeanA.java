package com.vd14.profiles;

import lombok.Data;

@Data
public class BeanA {
    private String env;

    public void getStage() {
        System.out.println("Current env: " + env);
    }
}
