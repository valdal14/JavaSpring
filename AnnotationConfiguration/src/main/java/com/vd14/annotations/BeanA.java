package com.vd14.annotations;

import org.springframework.beans.factory.annotation.Value;

public class BeanA {
    private String apiEndpoint;

    public String getApiEndpoint() {
        return apiEndpoint;
    }

    // Spring will resolve the placeholder and inject the string
    @Value("${api.endpoint.url}")
    public void setApiEndpoint(String apiEndpoint) {
        System.out.println("Injected URL: " + apiEndpoint);
        this.apiEndpoint = apiEndpoint;
    }
}
