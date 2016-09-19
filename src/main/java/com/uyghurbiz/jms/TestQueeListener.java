package com.uyghurbiz.jms;

import com.google.gson.Gson;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.Status;
import twitter4j.User;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

/**
 * Created by yyakup on 9/16/16.
 */
@Service("testQueeListener")
public class TestQueeListener implements MessageListener {

    @Autowired
    Gson gson;

    public static Logger LOGGER = LogManager.getLogger(TestQueeListener.class);

    @Override
    public void onMessage(Message message) {
        ObjectMessage message1 = (ObjectMessage)message;
        try {
            gson.toJson("Yari");
            LOGGER.info(gson.toJson(message1.getObject().toString()));
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
