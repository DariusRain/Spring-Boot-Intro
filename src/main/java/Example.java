// See getting started
// https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html#getting-started-first-application-pom
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

/**
* <h1>Example</h1>
* <p>
*     This is a small example provided by the guide from the
 *     <a href='https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html#getting-started-first-application-annotations'>
 *         spring boot website
 *      </a>
* </p>
* @author  Darius Rain
* @version 1.0
* @since   20-12-05
*/
// See about annotations
// https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html#getting-started-first-application-annotations
@RestController
@EnableAutoConfiguration
public class Example {

    /**
    * An initial test route for HTTP requests
    * should return a string as a response to either a requesting browser/GUI
    * or console based application.  Notice the "@RequestMapping" annotation is how to
    * tell spring-boot what URI is related to what method that could return many objects as
     * a response.
    * @return String
    */
    @RequestMapping("/")
    String test() {
        return "test";
    }

    /**
    * Another route to test if behavior is the same.
    * @return String
    */
    @RequestMapping("/users")
    String users() { return "Users"; }

    /**
    * SpringApplication.run takes the cl
    */
    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}