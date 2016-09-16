package com.uyghurbiz.core;

import com.uyghurbiz.jms.TestQueeListener;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

/**
 * Created by yyakup on 9/16/16.
 */
@Configuration("jmsConfig")
@ComponentScan("com.uyghurbiz.jms")
public class JmsConfig {

    @Bean
    public ActiveMQConnectionFactory activeMQConnectionFactory() {
        return new ActiveMQConnectionFactory("tcp://localhost:61616");

    }
    @Bean
    public CachingConnectionFactory connectionFactory() {

     return new CachingConnectionFactory(activeMQConnectionFactory());
    }
    @Bean
    public ActiveMQQueue testDesitination() {

        return new ActiveMQQueue("TestRequest");
    }
    @Bean
    public JmsTemplate jmsTemplate() {
        JmsTemplate jmsTemplate = new JmsTemplate();
        jmsTemplate.setConnectionFactory(connectionFactory());
        jmsTemplate.setDefaultDestination(testDesitination());
        return jmsTemplate;
    }
    @Bean
    public DefaultMessageListenerContainer defaultMessageListenerContainer() {
        DefaultMessageListenerContainer defaultMessageListenerContainer =  new DefaultMessageListenerContainer();
        defaultMessageListenerContainer.setDestination(testDesitination());
        defaultMessageListenerContainer.setConnectionFactory(connectionFactory());
        defaultMessageListenerContainer.setMessageListener(new TestQueeListener());
        defaultMessageListenerContainer.setSubscriptionName("Yari's test message listener");
        return defaultMessageListenerContainer;
    }
}
