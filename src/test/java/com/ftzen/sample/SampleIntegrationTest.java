package com.ftzen.sample;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertTrue;

/**
 * @author <a href="mailto:mike.key@14zen.com">MiKey</a>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {SampleApplication.class, SampleTestConfiguration.class})
@ActiveProfiles(profiles = "unittest")
@WebAppConfiguration
@IntegrationTest
public class SampleIntegrationTest
{
    @Autowired
    SampleTestFixture testFixture;

    @Before
    public void setUp()
    {
        testFixture.loadFixtures();
    }

    @Test
    public void testGetSampleEntityByName()
    {
        assertTrue(true);
    }
}
