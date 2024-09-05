package stepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BookHotelPage;
import pages.LoginPage;
import pages.SearchHotelPage;
import pages.SelectHotelPage;

public class Adactin_Step {

	WebDriver driver = Base.driver; // Access driver from BaseClass
	LoginPage loginPage;
	SearchHotelPage hotelPage;
	SelectHotelPage selectHotelPage;
	BookHotelPage bookHotelPage;
	
	@Given("The user is on the login page")
	public void theUserIsOnTheLoginPage() {
	   loginPage = new LoginPage(driver);
	}
	@When("The user logs in with username {string} and password {string}")
	public void theUserLogsInWithUsernameAndPassword(String userName, String password) {
	    loginPage.login(userName, password);
	   
	}
	@Then("The user is on the Search Hotel page")
	public void theUserIsOnTheSearchHotelPage() {
		hotelPage= new SearchHotelPage(driver);
	}
	@When("The user searches for a hotel with location {string}, hotel {string}, and room type {string}")
	public void theUserSearchesForAHotelWithLocationHotelAndRoomType(String location, String hotel, String roomType) {
	    hotelPage.searchHotel(location, hotel, roomType);
	   
	}
	@Then("The user selects a hotel and continues")
	public void theUserSelectsAHotelAndContinues() {
	    selectHotelPage = new SelectHotelPage(driver);
	    selectHotelPage.selectHotel();
	   
	}
	@When("The user books a hotel with first name {string}, last name {string}, address {string}, and credit card number {string}")
	public void theUserBooksAHotelWithFirstNameLastNameAddressAndCreditCardNumber(String firstName, String lName, String address, String cardNo) {
	    bookHotelPage = new BookHotelPage(driver);
	    bookHotelPage.bookHotel(firstName, firstName, address, cardNo);
	   
	}
	@Then("The booking is confirmed")
	public void theBookingIsConfirmed() {
//	    Assert
	   
	}
	
}
