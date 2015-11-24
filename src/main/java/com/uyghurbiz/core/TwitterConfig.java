package com.uyghurbiz.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * This class is configuration for the twitter service
 * Created by Yari_Dev on 10/11/15.
 */
@Configuration("twitterConfig")
public class TwitterConfig {

    /**
     * Remember dont push this credential keep it in your local
     *
     * @return configurationBuilder For the twitter
     */
    private ConfigurationBuilder configBuilder() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("kkp6290aUpPrr5jQX6DpsZAvU")
                .setOAuthConsumerSecret("bsGDNtpdsDGPXxLoA3LOHNrv1TVmdP54iDPTTguNcjCnIkINXm")
                .setOAuthAccessToken("3363534549-VxxzBJ36E2O181GAEQDbfk1FEczDr4wISBbxkJH")
                .setOAuthAccessTokenSecret("CNH6dNC3P7fySLzfLNodm0sRCZXEAdu7YEoWmf2gTiIei")
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
