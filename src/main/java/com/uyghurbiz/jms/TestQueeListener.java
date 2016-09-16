package com.uyghurbiz.jms;

import org.springframework.stereotype.Service;

import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * Created by yyakup on 9/16/16.
 */
@Service
public class TestQueeListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
      System.out.print(message.toString());
    }
}
