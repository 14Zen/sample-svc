package com.ftzen.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author <a href="mailto:mike.key@14zen.com">MiKey</a>
 */
@Configuration
@ComponentScan
@EnableJpaRepositories(basePackages = {"com.ftzen.sample"})
@EnableTransactionManagement
@Profile("unittest")
public class SampleTestConfiguration
{
    @Bean
    public SampleTestFixture testFixture()
    {
        return new SampleTestFixture();
    }
}
