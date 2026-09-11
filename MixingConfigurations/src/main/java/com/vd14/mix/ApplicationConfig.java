package com.vd14.mix;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com.vd14.mix")
@ImportResource("applicationContext.xml")
public class ApplicationConfig { }
