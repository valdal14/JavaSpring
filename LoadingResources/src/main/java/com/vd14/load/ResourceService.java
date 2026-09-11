package com.vd14.load;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "resourceService")
public class ResourceService {
    private final ResourceReader resourceReader;

    @Autowired
    public ResourceService(ResourceReader resourceReader) {
        this.resourceReader = resourceReader;
    }

    public void read() {
        resourceReader.read();
    }
}
