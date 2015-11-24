package com.uyghurbiz;

import com.uyghurbiz.core.CoreEngineConfig;
import org.springframework.test.context.ContextConfiguration;

/**
 * This class will wrap the spring config
 * <p/>
 * Created by Yari_Dev on 10/15/15.
 */
@ContextConfiguration(classes = CoreEngineConfig.class)
public abstract class AbstractSpringContext {
}
