package com.uyghurbiz.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Created by yyakup on 9/16/16.
 */
@Service
public class MessageSender {

    @Autowired
    JmsTemplate jmsTemplate;


    public void send(String message) {
       jmsTemplate.convertAndSend(message);
    }
}
