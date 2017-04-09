package com.uyghurbiz.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;
import twitter4j.Status;
import twitter4j.User;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jws.soap.SOAPBinding;

/**
 * Created by yyakup on 9/16/16.
 */
@Service
@Deprecated
public class MessageSender {

    @Autowired
    JmsTemplate jmsTemplate;


    public void send(String message) {
       jmsTemplate.convertAndSend(message);
    }
    public void sendObject(Object status) {
        jmsTemplate.convertAndSend(status);
    }
}
