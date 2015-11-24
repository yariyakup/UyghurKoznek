package com.uyghurbiz.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Core Engine Configuration for the entire application
 * <p/>
 * Created by Yari_Dev on 10/11/15.
 */
@Configuration("coreConfig")
@Import({RepositoryConfig.class, TwitterServiceConfig.class})
public class CoreEngineConfig {
}
