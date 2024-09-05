package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static WebDriverWait wait;

	// Method to initialize the WebDriver
	public static void initializeDriver(String browser) {
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			throw new IllegalArgumentException("Browser type not supported");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Explicit wait
	}
	// Method to navigate to the base URL
	public static void openApplication(String url) {
		driver.get(url);
	}

	// Method to quit the browser
	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
		}
	
	}
}