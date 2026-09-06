package com.vd14.ioc;

public class Main {

    public static void main(String[] args) {
        PayloadType type = PayloadType.JSON;
        String payload = "{obj: \"class\"}";
        PayloadDTO payloadDTO = new PayloadDTO(type, payload);
        IntegrationEngine ie = new IntegrationEngine(new JsonPayloadProcess());

        if(ie.isValid(type)) {
            ie.processPayload(payloadDTO);
            System.out.println("JSON payload processed successfully");
        }
        else {
            System.out.println("Invalid payload");
        }
    }
}
