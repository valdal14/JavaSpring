package com.vd14.load;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.AbstractResource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Component
public class TextResource extends AbstractResource {
    private final File file;
    private final String description;

    @Autowired
    public TextResource(@Value("${my.custom.filepath:text.txt}") String filePath) {
        this.file = new File(filePath);
        this.description = "Project root file resource named: " + this.file.getName();
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(this.file);
    }
}
