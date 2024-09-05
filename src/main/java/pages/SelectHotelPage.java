package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class SelectHotelPage {

	WebDriver driver;

    // Constructor to initialize elements with PageFactory and access the driver from BaseClass
    public SelectHotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Web elements for selecting a hotel
    @FindBy(id = "radiobutton_0")
    private WebElement selectHotelRadioButton;

    @FindBy(id = "continue")
    private WebElement continueButton;

    // Method to select a hotel and proceed
    public void selectHotel() {
        selectHotelRadioButton.click();
        continueButton.click();
    }
}
