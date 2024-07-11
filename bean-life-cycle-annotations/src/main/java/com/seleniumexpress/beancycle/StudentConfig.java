package com.seleniumexpress.beancycle;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.seleniumexpress.beancycle")
@PropertySource(value = "classpath:mysql-configuration-credentials.properties")
public class StudentConfig {

}
