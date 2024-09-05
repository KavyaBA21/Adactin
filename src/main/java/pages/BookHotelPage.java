package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class BookHotelPage {

	WebDriver driver;

    // Constructor to initialize elements with PageFactory and access the driver from BaseClass
    public BookHotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Web elements for booking a hotel
    @FindBy(id = "first_name")
    private WebElement firstNameField;

    @FindBy(id = "last_name")
    private WebElement lastNameField;

    @FindBy(id = "address")
    private WebElement addressField;

    @FindBy(id = "cc_num")
    private WebElement creditCardNumberField;

    @FindBy(id = "book_now")
    private WebElement bookNowButton;

    // Method to book a hotel room
    public void bookHotel(String firstName, String lastName, String address, String creditCardNumber) {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        addressField.sendKeys(address);
        creditCardNumberField.sendKeys(creditCardNumber);
        bookNowButton.click();
    }
}
