package com.ftzen.sample.repository;

import com.ftzen.sample.domain.SampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author <a href="mailto:mike.key@14zen.com">MiKey</a>
 */
public interface SampleEntityRepository extends JpaRepository<SampleEntity, Integer>
{
    List<SampleEntity> findBySampleName(String sampleName);
}
