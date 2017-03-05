package de.origindd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@EnableAutoConfiguration
@SpringBootApplication
public class ExtractorApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ExtractorApplication.class, args);
    }
}
