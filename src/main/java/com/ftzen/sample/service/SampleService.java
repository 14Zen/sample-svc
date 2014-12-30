package com.ftzen.sample.service;

import com.ftzen.sample.domain.SampleEntity;

import java.util.List;

/**
 * @author <a href="mailto:mike.key@14zen.com">MiKey</a>
 */
public interface SampleService
{
    List<SampleEntity> findBySampleName(String sampleName);
}
