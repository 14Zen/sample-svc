package com.ftzen.sample.event;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author <a href="mailto:mike.key@14zen.com">MiKey</a>
 */
public class GetSampleEntityEvent
{
    private Integer eventId;
    private String sampleName;

    public Integer getEventId()
    {
        return eventId;
    }

    public void setEventId(Integer eventId)
    {
        this.eventId = eventId;
    }

    public String getSampleName()
    {
        return sampleName;
    }

    public void setSampleName(String sampleName)
    {
        this.sampleName = sampleName;
    }

    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
