package com.vd14.splitconfigs;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class BeanB {
    @Value("${beanB.message}")
    private String message;
}
