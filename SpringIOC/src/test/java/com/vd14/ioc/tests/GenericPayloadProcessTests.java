package com.vd14.ioc.tests;

import com.vd14.ioc.*;
import org.junit.Assert;
import org.junit.Test;

public class GenericPayloadProcessTests {

    @Test
    public void testProcessXmlPayloadIsValidPayload() {
        PayloadType type = PayloadType.XML;
        XmlPayloadProcess sut = (XmlPayloadProcess) makeSUT(PayloadType.XML);
        boolean isValid = sut.isValid(type);
        Assert.assertTrue(isValid);
    }

    @Test
    public void testProcessXmlPayload() {
        PayloadType type = PayloadType.XML;
        String payload = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
        PayloadDTO dto = new PayloadDTO(type, payload);
        XmlPayloadProcess sut = (XmlPayloadProcess) makeSUT(PayloadType.XML);
        sut.processPayload(dto);
        Assert.assertTrue(sut.isWasProcessed());
    }

    @Test
    public void testProcessJsonPayloadIsValidPayload() {
        PayloadType type = PayloadType.JSON;
        JsonPayloadProcess sut = (JsonPayloadProcess) makeSUT(PayloadType.JSON);
        boolean isValid = sut.isValid(type);
        Assert.assertTrue(isValid);
    }

    @Test
    public void testProcessJsonPayload() {
        PayloadType type = PayloadType.JSON;
        String payload = "{\"foo\":\"bar\"}";
        PayloadDTO dto = new PayloadDTO(type, payload);
        JsonPayloadProcess sut = (JsonPayloadProcess) makeSUT(PayloadType.JSON);
        sut.processPayload(dto);
        Assert.assertTrue(sut.isWasProcessed());
    }

    public PayloadValidator makeSUT(PayloadType payloadType) {
        return switch (payloadType) {
            case XML -> new XmlPayloadProcess();
            case JSON -> new JsonPayloadProcess();
        };
    }
}
