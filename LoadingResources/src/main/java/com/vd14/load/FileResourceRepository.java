package com.vd14.load;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Repository
public class FileResourceRepository implements ResourceReader {
    private Resource resource;

    @Override
    public void read() {
        String desc = resource.getDescription();
        System.out.println(desc);
        try {
            // Get the inputStream instance from the injected resource
            BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
            // read each line from the reader
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    @Autowired
    public void setResource(Resource resource) {
        this.resource = resource;
    }
}
