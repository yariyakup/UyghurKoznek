package com.uyghurbiz.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * This class is configuration for the twitter service
 * Created by Yari_Dev on 10/11/15.
 */
@Configuration("twitterConfig")
public class TwitterConfig {

    @Value("${twiter.consumerKey}")
    private String oAuthConsumerKey;
    @Value("${twiter.authconsumersecret}")
    private String oAuthConsumerSecret;
    @Value("${twiter.oauthaccesstoken}")
    private String oAuthAccessToken;
    @Value("${twiter.oauthaccesstokensecret}")
    private String oAuthAccessTokenSecret;
    /**
     * Remember dont push this credential keep it in your local
     *
     * @return configurationBuilder For the twitter
     */
    private ConfigurationBuilder configBuilder() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(oAuthConsumerKey)
                .setOAuthConsumerSecret(oAuthConsumerSecret)
                .setOAuthAccessToken(oAuthAccessToken)
                .setOAuthAccessTokenSecret(oAuthAccessTokenSecret)
                .setJSONStoreEnabled(true);

        return cb;
    }

    /**
     * Bean that wrap around the twitterApi
     *
     * @return twitterApi
     */
    @Bean
    public Twitter twitter() {
        return new TwitterFactory(configBuilder().build()).getInstance();

    }
}
