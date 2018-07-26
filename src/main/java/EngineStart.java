import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Yari_Dev on 10/13/15.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.uyghurbiz.core")
public class EngineStart {
    public static void main(String[] args) {
        SpringApplication.run(EngineStart.class, args);

    }
}
