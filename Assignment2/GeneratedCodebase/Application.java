import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Write documentation for this class
// This class is the main class for the application, it is used to start the Spring Boot application
// The annotation @SpringBootApplication is used to define the class as a Spring Boot Application
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

//Write unit test case for this class using mockito