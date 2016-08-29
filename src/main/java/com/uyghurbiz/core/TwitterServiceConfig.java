package com.uyghurbiz.core;

import com.uyghurbiz.service.TwitterFavoriteServicesImpl;
import com.uyghurbiz.service.TwitterTimelinesResourcesServicesImpl;
import com.uyghurbiz.service.TwitterUserServicesImpl;
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
    public TwitterUserServicesImpl twitterTestUserService() {
        return new TwitterUserServicesImpl();
    }

    @Bean
    public TwitterFavoriteServicesImpl twitterFavoriteServices(){
        return new TwitterFavoriteServicesImpl();
    }


    @Bean
    public TwitterTimelinesResourcesServicesImpl twitterTimelinesResourcesServices(){
        return new TwitterTimelinesResourcesServicesImpl();
    }
}
