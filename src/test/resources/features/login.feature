Feature: Register
  i user services i need login me
  Scenario: Login Successful
    Given he user is on the web page
    When he user enter the data for the register
    And he user enter the credentials
    Then he could see login
