package com.uyghurbiz.service;

import com.uyghurbiz.AbstractSpringContext;
import com.uyghurbiz.jms.MessageSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yyakup on 9/16/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class JmsServiceTest extends AbstractSpringContext {

    @Autowired
    MessageSender messsageSender;
    @Test
    public void testSendMessage() {
     messsageSender.send("Hello this is from yari v2");

    }
}
