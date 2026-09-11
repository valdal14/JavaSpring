package com.vd14.jc;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class BeanC {
    private String message;

    @Autowired
    public void setMessage(@Value("Autowiring in Java") String message) {
        this.message = message;
    }
}
