package com.ftzen.sample.domain;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author <a href="mailto:mike.key@14zen.com">MiKey</a>
 */
@Entity
public class SampleEntity extends AbstractPersistable<Integer>
{
    @Column
    private String sampleName;

    public String getSampleName()
    {
        return sampleName;
    }

    public void setSampleName(String sampleName)
    {
        this.sampleName = sampleName;
    }
}
