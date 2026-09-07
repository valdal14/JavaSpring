package com.vd14.ioc;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PayloadDTO {
    PayloadType payloadType;
    String payload;

    public PayloadDTO(PayloadType payloadType, String payload) {
        this.payloadType = payloadType;
        this.payload = payload;
    }
}
