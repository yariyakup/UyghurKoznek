import com.uyghurbiz.controller.SampleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Yari_Dev on 10/13/15.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class EngineStart extends SpringBootServletInitializer {
    private static Class<SampleController> applicationClass = SampleController.class;

    public static void main(String[] args) {
        SpringApplication.run(SampleController.class, args);

    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

}
