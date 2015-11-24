package com.uyghurbiz.core;

import com.uyghurbiz.service.TwitterUserServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Yari_Dev on 10/12/15.
 */
@Configuration("twitterServiceConfig")
@Import(TwitterConfig.class)
public class TwitterServiceConfig {

    /**
     * Test tiwtter user services
     *
     * @return
     */
    @Bean
    public TwitterUserServices twitterTestUserService() {
        return new TwitterUserServices();


    }
}
