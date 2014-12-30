package com.ftzen.sample;

import com.ftzen.sample.domain.SampleEntity;
import com.ftzen.sample.repository.SampleEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author <a href="mailto:mike.key@14zen.com">MiKey</a>
 */
public class SampleTestFixture
{
    @Autowired
    SampleEntityRepository sampleEntityRepository;

    public SampleEntity loadFixtures()
    {
        SampleEntity sampleEntity = new SampleEntity();
        sampleEntity.setSampleName("testName");
        return sampleEntityRepository.save(sampleEntity);
    }
}
