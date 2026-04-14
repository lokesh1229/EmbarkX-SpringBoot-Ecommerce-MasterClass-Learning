package com.componentScanByAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages =
        "com.componentScanByAnnotation")
public class AppConfig {

}
