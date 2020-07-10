package com.wedevol.springbootjmx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Entry Point class
 *
 * @author Charz++
 */

@SpringBootApplication
public class EntryPoint extends SpringBootServletInitializer {

    private static final Logger LOG = LoggerFactory.getLogger(EntryPoint.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EntryPoint.class);
    }

    public static void main(String[] args) {
        LOG.info("Initializing Spring Boot!");
        SpringApplication.run(EntryPoint.class, args);
    }

}
