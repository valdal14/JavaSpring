package com.vd14.callbacks;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class BeanB {
    @Value("${beanB.message}")
    private String message;
}
