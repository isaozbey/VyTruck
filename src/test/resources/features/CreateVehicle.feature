@vehicle
Feature: Create Vehicle
  As a user , I want to be able create vehicles

  Scenario: Create a vehicle

    Given User is on the landing page
    When user is logs in with "storemanager85" and "UserUser123" credentials
    Then user navigate to "Fleet" and "Vehicles"
    Then user click on create car button
    Then user enter vehicles information
      | License Plate | Driver | Locatoion | Model Year |
      | test_plates   | SDEt   |Washington DC|2020      |
