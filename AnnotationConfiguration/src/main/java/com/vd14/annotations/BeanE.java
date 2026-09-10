package com.vd14.annotations;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

@Data
public class BeanE {
    @Autowired
    private BeanF[] beanFS;
    @Autowired
    private List<BeanF> beanFList;
    @Autowired
    private Map<String, BeanF> beanFMap;
}
