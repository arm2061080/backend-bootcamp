// Step 1: Logger Interface
public interface Logger {
    void log(String message);
    void error(String message);
}

// Step 3a: AsteriskLogger Class
public class AsteriskLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

    @Override
    public void error(String message) {
        String errorMessage = "***Error: " + message + "***";
        String border = "*".repeat(errorMessage.length());

        System.out.println(border);
        System.out.println(errorMessage);
        System.out.println(border);
    }
}

// Step 3b: SpacedLogger Class
public class SpacedLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println(addSpaces(message));
    }

    @Override
    public void error(String message) {
        System.out.println("ERROR: " + addSpaces(message));
    }

    private String addSpaces(String message) {
        return message.replace("", " ").trim();  // Add space between each character
    }
}

// Step 6: App Class to test both Loggers
public class App {

    public static void main(String[] args) {
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        // Test AsteriskLogger
        System.out.println("Testing AsteriskLogger:");
        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");

        // Test SpacedLogger
        System.out.println("\nTesting SpacedLogger:");
        spacedLogger.log("Hello");
        spacedLogger.error("Hello");
    }
}