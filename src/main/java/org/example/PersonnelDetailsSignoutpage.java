package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PersonnelDetailsSignoutpage extends Utils
{
    By _welcomeclick=By.id("welcome");

    public void addEmployeeSignOut()
    {   //click on welcome button
        clickOnElement(_welcomeclick);
        // click on signout button
        Actions actions = new Actions(driver);
        WebElement selectlogout = driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a"));
       // actions.moveToElement(selectlogout).perform();
        selectlogout.click();
    }

}
