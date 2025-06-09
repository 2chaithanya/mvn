package project.mvn;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Get current server time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Server time: " + now.format(formatter));
    }
}

