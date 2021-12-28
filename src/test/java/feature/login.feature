Feature: Admin Log in and admin can add new employee and that employee should log in again with that valid credentials

  @Test1
  Scenario:
  As a admin user I want to login on https://opensource-demo.orangehrmlive.com/
  and i should be able to add new employee then  again that new employee should be able to log in successfully.

    Given I am on login page
    When  I enter valid username and password field
    And   Click on log in button
    And   I should be able to login successfully
    And   I click on Pim main Category
    And   I can enter employee details in a list
    And   I click on welcome and click on Log out button
    And   Recent employee can add  sign in with Valid Credentials
    Then  Recent employee should be able to log in successfully




