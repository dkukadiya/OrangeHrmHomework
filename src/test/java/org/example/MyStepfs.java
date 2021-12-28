package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepfs {
    LoginPage loginPage = new LoginPage();
    OrangeHrmPage orangeHrmPage = new OrangeHrmPage();
    //PimEmployee pimEmployee=new PimEmployee();
    AddEmployeeDetailsPage addEmployeeDetailsPage = new AddEmployeeDetailsPage();
    AddEmployeeDetailsPage add = new AddEmployeeDetailsPage();
    PersonnelDetailsSignoutpage personnelDetailsSignoutpage = new PersonnelDetailsSignoutpage();
    EmployeeListPage employeeListPage=new EmployeeListPage();

    @Given("I am on login page")
    public void i_am_on_login_page() {
    }

    @When("I enter valid username and password field")
    public void i_enter_valid_username_and_password_field() {
        loginPage.userEnterLoginDeatails();
    }

    @When("Click on log in button")
    public void click_on_log_in_button() {
        loginPage.clickOnloginbutton();
    }

    @Then("I should be able to login succesfully")
    public void i_should_be_able_to_login_succesfully() {
        orangeHrmPage.verifyUserOnHomepage();
        //pimEmployee.pimAddEmployeeList();
    }

    @And("I should be able to login successfully")
    public void i_should_be_able_to_login_successfully() {
        orangeHrmPage.clickOnPimcategory();
        orangeHrmPage.clickOnAddemployee();
    }

    @And("I click on Pim main Category")
    public void i_click_on_pim_category() {

    }



    @And("I can enter employee details in a list")
    public void i_can_enter_employee_detail_in_a_list() {

        addEmployeeDetailsPage.enterNewEmployeeDetail();
    }

    @When("I click on welcome and click on Log out button")
    public void i_click_on_welcome_and_click_on_log_out_button() {

        personnelDetailsSignoutpage.addEmployeeSignOut();
    }
    @When("Recent employee can add  sign in with Valid Credentials")
    public void recent_employee_can_add_sign_in_with_valid_credentials() {

    }
    @Then("Recent employee should be able to log in successfully")
    public void recent_employee_should_be_able_to_log_in_successfully() {
      loginPage.enterRecentEmployeeDetailForSignIn();
      loginPage.clickOnloginbutton();

    }
    @When("I click on sub category Add Employee List")
    public void i_click_on_sub_category_add_employee_list() {
        orangeHrmPage.clickonEmployeelist();

    }
    @When("I can enter Employee Name on that employee Name field")
    public void i_can_enter_employee_name_on_that_employee_name_field() {
        employeeListPage.enterEmployeeName();
    }
    @When("I can click on search button")
    public void i_can_click_on_search_button() {
        employeeListPage.clickonSearchButton();
    }
    @When("select valid employee detail checkbox")
    public void select_valid_employee_detail_checkbox() {

        employeeListPage.clickOnCheckBox();
    }
    @When("I should be able to click on delete button")
    public void i_should_be_able_to_click_on_delete_button()
    {
        employeeListPage.clickOnDeleteButton();
    }
    @When("I can handle the prompt window for verification")
    public void i_can_handle_the_prompt_window_for_verification() {
     employeeListPage.clickOnOkButtonFromAlertBox();

    }
    @Then("I should be able to delete employee successfully from the Employee list")
    public void i_should_be_able_to_delete_employee_successfully_from_the_employee_list() {
    }
}



