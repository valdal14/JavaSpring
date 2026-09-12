package com.vd14.propplaceholderconfig;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class BeanA {
    @Value("${user.id}")
    private String id;
    @Value("${user.name}")
    private String name;
    @Value("${user.email}")
    private String email;
}
