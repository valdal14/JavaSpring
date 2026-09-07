package com.vd14.ioc;

public interface PayloadValidator {
    boolean isValid(PayloadType payloadType);
    void processPayload(PayloadDTO payloadDTO);
}
