package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver_Class {

	public static WebDriver driver;

	public static void launchBrowser(String browser) {

		switch (browser.toLowerCase()) {
		case "chrome": 
			driver = new ChromeDriver();
			break;
		case "firefox": 
			driver = new FirefoxDriver();
			break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + browser);
		}
//		if (browser.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver();
//		}
//		else if (browser.equalsIgnoreCase("firefox")) {
//			driver = new FirefoxDriver();
//		}
//		else {
//			System.out.println("Browser Not Found");
//		}
	}

	public static void launchUrl() {
		driver.get("");
	}

	public static void main(String[] args) {
		launchBrowser("ChroMe");
	}
}
