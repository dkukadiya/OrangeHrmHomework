package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils
{
   //Click on Login button
    By _username=By.id("txtUsername");
    By _password=By.id("txtPassword");
    By _login=By.name("Submit");

    public void userEnterLoginDeatails()
{
     //enter the username
    typetext(_username,loadProp.getProperty("Username"));
    //enter the password
    typetext(_password,loadProp.getProperty("Password"));

}

public void clickOnloginbutton()
{
    //click on the login button
    clickOnElement(_login);
}
public void enterRecentEmployeeDetailForSignIn()
{
    typetext(_username,loadProp.getProperty("username"));
    typetext(_password,loadProp.getProperty("password"));
}
}
