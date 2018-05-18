// This is the package declaration where this class is located
package lu.maltem;

/*
This is the list of imports useful to make the code more readable.
An import declaration is :
    - the keyword "import"
    - the package of the Class or group of Classes we want to import
    - a Class name or a * for all Classes of package.
 */
import lu.maltem.chapter1.Chapter1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
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

    // This is a private member field, which is static and final => Constant (we'll see later in Chapter2)
    private static final int EXIT_CODE_OK = 0;

    /**
     * This is a main() method. Each Class (Java Object) can have a main method.
     * It contains :
     * <ul>
     *     <li>a scope keyword (public, protected, Ø (package-protected), private</li>
     *     <li>a static keyword. Please check into Chapter4 for more information. But keep in mind that this keyword allows the JVM to detect the method</li>
     *     <li>a return type : void. Meaning it doesn't return anything. At the end, it is possible to handle a System.exit</li>
     * </ul>
     * @param args The program Arguments
     */
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder(JavaCertificationApplication.class)
                .web(WebApplicationType.NONE) // .REACTIVE, .SERVLET
                .run(args);

        LOGGER.info("This is the Java Certification Application. It will help us to understand the chapters learned.");

        /*
        We want to call the class Chapter1 and use it. To do that we need to :
            - Import it above in this java class (see first lines)
            - "final" is not important to understand by now, we'll have it explained later in Chapters.
            - The Class name (Chapter1), note that a Class always starts with an UpperCase and then camelCase
         */
        final Chapter1 chapter1 = new Chapter1();
        chapter1.process();

        SpringApplication.exit(context);
        System.exit(JavaCertificationApplication.EXIT_CODE_OK);

    }
}
