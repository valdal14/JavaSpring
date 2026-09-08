package com.vd14.springbean;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
public class CollectionBean {
    private List<String> list;
    private Map<String, String> map;
    private Set<String> set;
    private Properties properties;
    // New List of CustomPojo
    private List<CustomPojo> pojos;
}
