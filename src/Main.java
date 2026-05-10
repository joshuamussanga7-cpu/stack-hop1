import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Open the privacy policy/game file in the default browser
            File htmlFile = new File("index.html");
            if (htmlFile.exists()) {
                Desktop.getDesktop().browse(htmlFile.toURI());
                System.out.println("Launching Stack Hop Privacy Policy...");
            } else {
                System.out.println("Error: index.html not found in project root.");
            }
        } catch (IOException e) {
            System.err.println("Error launching browser: " + e.getMessage());
        }
    }
}
