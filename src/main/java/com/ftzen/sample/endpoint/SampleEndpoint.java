package com.ftzen.sample.endpoint;

import com.ftzen.sample.domain.SampleEntity;
import com.ftzen.sample.event.GetSampleEntityEvent;
import com.ftzen.sample.service.SampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author <a href="mailto:mike.key@14zen.com">MiKey</a>
 */
@RestController
@RequestMapping("/service/sample")
public class SampleEndpoint
{
    private static final Logger logger = LoggerFactory.getLogger(SampleEndpoint.class);

    @Autowired
    private SampleService sampleService;

    @RequestMapping(
            method = RequestMethod.GET
            ,consumes = MediaType.APPLICATION_JSON_VALUE
            ,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<SampleEntity> getSampleByName(GetSampleEntityEvent getSampleEntityEvent)
    {
        logger.debug("REQUEST: GetSampleEntityEvent={}", getSampleEntityEvent);
        return sampleService.findBySampleName(getSampleEntityEvent.getSampleName());
    }
}
