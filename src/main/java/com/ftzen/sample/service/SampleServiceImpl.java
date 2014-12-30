package com.ftzen.sample.service;

import com.ftzen.sample.domain.SampleEntity;
import com.ftzen.sample.repository.SampleEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author <a href="mailto:mike.key@14zen.com">MiKey</a>
 */
@Service
public class SampleServiceImpl implements SampleService
{
    @Autowired
    private SampleEntityRepository sampleEntityRepository;

    @Override
    public List<SampleEntity> findBySampleName(String sampleName)
    {
        return sampleEntityRepository.findBySampleName(sampleName);
    }
}
