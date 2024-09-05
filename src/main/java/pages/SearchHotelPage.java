package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class SearchHotelPage {

	WebDriver driver;

    // Constructor to initialize elements with PageFactory and access the driver from BaseClass
    public SearchHotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Web elements for the search hotel page
    @FindBy(id = "location")
    private WebElement locationDropdown;

    @FindBy(id = "hotels")
    private WebElement hotelsDropdown;

    @FindBy(id = "room_type")
    private WebElement roomTypeDropdown;

    @FindBy(id = "Submit")
    private WebElement searchButton;

    // Method to search for a hotel
    public void searchHotel(String location, String hotel, String roomType) {
        locationDropdown.sendKeys(location);
        hotelsDropdown.sendKeys(hotel);
        roomTypeDropdown.sendKeys(roomType);
        searchButton.click();
    }
}
