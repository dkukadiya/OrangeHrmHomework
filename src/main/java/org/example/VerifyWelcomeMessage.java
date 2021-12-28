package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.testng.Assert.*;

public class VerifyWelcomeMessage extends AddEmployeeDetailsPage
{
    LoadProp loadProp=new LoadProp();
    By _firstnamefield=By.id("firstName");

    public void verifyUserShouldbeabletoRegisterSuccesfully()
    {
      String actualwelcomemessage = getTextFromElement(By.xpath("//*[@id=\"welcome\"]"));
      // String expectedLoginSuccessmessge = "";
      // Assert.assertTrue(String.format("actualwelcomemessage%s%s",loadProp.getProperty("_firstnamefield")));
      //  Assert.assertEquals(driver.findElement(_username) + currentTimestamp() +" actualwelcomemessage"));

    }


}

