package com.vd14.mix;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class BeanB {
    @Autowired
    private BeanC beanC;
}
