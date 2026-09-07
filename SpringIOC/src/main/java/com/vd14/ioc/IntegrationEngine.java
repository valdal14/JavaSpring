package com.vd14.ioc;

public class IntegrationEngine {
    private final PayloadValidator payloadValidator;

    public IntegrationEngine(PayloadValidator payloadValidator) {
        this.payloadValidator = payloadValidator;
    }

    boolean isValid(PayloadType payloadType) {
        return payloadValidator.isValid(payloadType);
    }

    void processPayload(PayloadDTO  payloadDTO) {
        payloadValidator.processPayload(payloadDTO);
    }
}
