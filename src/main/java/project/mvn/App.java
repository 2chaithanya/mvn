import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Display server time
 */
public class App {
    public static void main(String[] args) {
        // Get current server time
        LocalDateTime now = LocalDateTime.now();

        // Format the time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Print the formatted server time
        System.out.println("Server Time: " + now.format(formatter));
    }
}
