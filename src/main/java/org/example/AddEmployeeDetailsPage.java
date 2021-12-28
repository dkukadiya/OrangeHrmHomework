package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddEmployeeDetailsPage  extends Utils
{
    LoadProp loadProp=new LoadProp();
    By _firstnamefield=By.id("firstName");
    By _lastnamefield=By.id("lastName");
    By _username=By.id("user_name");
    By _password=By.id("user_password");
    By _confirmpassword=By.id("re_password");
    By _savebutton=By.id("btnSave");


    public void enterNewEmployeeDetail() {
        //enter the firstname
        typetext(_firstnamefield , currentTimestamp() +loadProp.getProperty("firstname"));
        //enter the lastname
        typetext(_lastnamefield, loadProp.getProperty("lastname"));
        // Selecting CheckBox
        WebElement option1 = driver.findElement(By.id("chkLogin"));
        // This will Toggle the Check box
        option1.click();
        //enter the username
        typetext(_username, loadProp.getProperty("username"));
        //enter the password
        typetext(_password, loadProp.getProperty("password"));
        //enter the confirm password
        typetext(_confirmpassword, loadProp.getProperty("confirfmpassword"));
        //click on save button
        clickOnElement(_savebutton);

    }
}
