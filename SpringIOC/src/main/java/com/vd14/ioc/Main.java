package com.vd14.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        PayloadType json = PayloadType.JSON;
        PayloadType xml = PayloadType.XML;

        String jsonPayload = "{obj: \"class\"}";
        String xmlPayload = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";

        PayloadDTO jsonPayloadDTO = new PayloadDTO(json, jsonPayload);
        PayloadDTO xmlPayloadDTO = new PayloadDTO(xml, xmlPayload);

        // Load the context from the XML config
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        // Use the context to create the IntegrationEngine's instance
        IntegrationEngine ie = context.getBean("integrationEngine", IntegrationEngine.class);
        IntegrationEngine ie2 = context.getBean("integrationEngine2", IntegrationEngine.class);

        if(ie.isValid(json) && ie2.isValid(xml)) {
            ie.processPayload(jsonPayloadDTO);
            ie2.processPayload(xmlPayloadDTO);

            System.out.println("JSON & XML payload processed successfully");
        }
        else {
            System.out.println("Invalid payload");
        }
    }
}
