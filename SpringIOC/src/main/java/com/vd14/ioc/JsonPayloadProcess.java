package com.vd14.ioc;

import lombok.Getter;
import java.util.Objects;

@Getter
public class JsonPayloadProcess implements PayloadValidator {
    private boolean wasProcessed = false;

    @Override
    public boolean isValid(PayloadType payloadType) {
        return Objects.requireNonNull(payloadType) == PayloadType.JSON;
    }

    @Override
    public void processPayload(PayloadDTO payloadDTO) {
        wasProcessed = true;
    }
}
