package co.za.pseudos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run the application.
 * 
 * @author Sydney
 *
 */
@SpringBootApplication
public class NetworkMonitorApplication {

    /**
     * Empty constructor
     */
    public NetworkMonitorApplication() {
    }

    /**
     * Run application.
     * @param args Application args
     */
    public static void main(String[] args) {
        SpringApplication.run(NetworkMonitorApplication.class, args);
    }
}
