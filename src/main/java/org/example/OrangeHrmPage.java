package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class OrangeHrmPage extends LoginPage
{
    public  void verifyUserOnHomepage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));

    }
    public void clickOnPimcategory()
    {
        clickOnElement(By.id("menu_pim_viewPimModule"));

    }
    public void clickonEmployeelist()
    {
        clickOnElement(By.id("menu_pim_viewEmployeeList"));
    }
    public  void clickOnAddemployee()
    {
        clickOnElement(By.id("menu_pim_addEmployee"));
    }
}
