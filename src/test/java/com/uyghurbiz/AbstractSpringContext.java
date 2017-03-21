package com.uyghurbiz;

import com.google.gson.Gson;
import com.uyghurbiz.core.CoreEngineConfig;
import com.uyghurbiz.jms.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * This class will wrap the spring config
 * Yes i updated from aws
 * <p/>
 * Created by Yari_Dev on 10/15/15.
 */
@ContextConfiguration(classes = CoreEngineConfig.class)
public abstract class AbstractSpringContext {


    @Autowired
    public Gson gson;
    @Autowired
    public MessageSender messageSender;
}
