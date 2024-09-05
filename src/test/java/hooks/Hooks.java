package hooks;

import org.openqa.selenium.WebDriver;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;

	@Before
    public void setUp() {
        // Initialize the driver using BaseClass method
        Base.initializeDriver("chrome"); // Specify browser type as needed
        Base.openApplication("http://adactinhotelapp.com"); // Replace with the actual URL
    }
	
	@After
    public void tearDown() {
		
        // Close the driver using BaseClass method
		Base.closeDriver();
    }
}
