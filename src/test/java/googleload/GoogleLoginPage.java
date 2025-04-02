package googleload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLoginPage {
	
	WebDriver driver;
	 public void openGoogle() {
	        // Set up ChromeDriver using WebDriverManager
	        WebDriverManager.chromedriver().setup();

	        // Initialize the WebDriver
	        driver = new ChromeDriver();

	        // Open Google
	        driver.get("https://www.google.com");

	        // Print title to verify
	        System.out.println("Page Title: " + driver.getTitle());

	        // Close browser (optional)
	        driver.quit();
	    }
	

}
