Feature: Admin user should be able to add and delete employee from Employee list pages from the Website
  https://opensource-demo.orangehrmlive.com/.
@Test2
  Scenario: As a admin user i can add and delete employee successfully from employee list page.

  Given I am on login page
  When  I enter valid username and password field
  And   Click on log in button
  And   I should be able to login successfully
  And   I click on Pim main Category
  And   I click on sub category Add Employee List
  And   I can enter Employee Name on that employee Name field
  And   I can click on search button
  And   select valid employee detail checkbox
  And   I should be able to click on delete button
  And   I can handle the prompt window for verification
  Then  I should be able to delete employee successfully from the Employee list








