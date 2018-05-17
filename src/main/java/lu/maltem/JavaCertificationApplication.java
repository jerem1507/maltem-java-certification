package lu.maltem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "lu.maltem")
public class JavaCertificationApplication extends SpringBootServletInitializer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JavaCertificationApplication.class);
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder(JavaCertificationApplication.class)
                .web(WebApplicationType.NONE) // .REACTIVE, .SERVLET
                .run(args);

        LOGGER.info("This is the application");
    }
}
