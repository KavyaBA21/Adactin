Feature: Adactin Hotel Booking

  Scenario: Book a Hotel Room
    Given The user is on the login page
    When The user logs in with username "Naveenkr" and password "9750559657"
    Then The user is on the Search Hotel page
    When The user searches for a hotel with location "Sydney", hotel "Hotel Creek", and room type "Standard"
    Then The user selects a hotel and continues
    When The user books a hotel with first name "Kavya", last name "Baskaran", address "123 Street", and credit card number "1234567812345678"
    Then The booking is confirmed