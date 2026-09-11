package com.vd14.load;

import org.springframework.core.io.Resource;

public interface ResourceReader {
    void read();
    void setResource(Resource resource);
}
