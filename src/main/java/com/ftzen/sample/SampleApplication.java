package com.ftzen.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author <a href="mailto:mike.key@14zen.com">MiKey</a>
 */
@SpringBootApplication
@EnableJpaRepositories
@EnableConfigurationProperties
public class SampleApplication extends SpringBootServletInitializer
{
    public static void main(final String[] args)
    {
        ConfigurableApplicationContext ctx = SpringApplication.run(SampleApplication.class, args);
        // Configure the application context, load seed data, etc. from here.
    }

    @Override
    protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application)
    {
        return application.sources(SampleApplication.class);
    }
}
