package de.origindd.extractor.service;

import de.origindd.ExtractorApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.core.annotation.AliasFor;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@ActiveProfiles
@SpringApplicationConfiguration
@WebIntegrationTest(randomPort = true)
@TestPropertySource
public @interface IntegrationTest {


    @AliasFor(annotation = SpringApplicationConfiguration.class, attribute = "classes")
    Class<?>[] classes() default {ExtractorApplication.class};

    @AliasFor(annotation = ActiveProfiles.class, attribute = "profiles")
    String[] profiles() default {"development", "test"};

    @AliasFor(annotation = TestPropertySource.class, attribute = "properties")
    String[] properties() default {"server.port=0", "management.port=0"};
}
