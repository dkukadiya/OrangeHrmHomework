package org.example;

import org.openqa.selenium.By;

public class EmployeeListPage extends Utils
{
    LoadProp loadProp=new LoadProp();

    By _Employeename=By.id("empsearch_employee_name_empName");
    By _searchbutton=By.id("searchBtn");
    By _checkbox=By.xpath("//input[@id='ohrmList_chkSelectAll']");
    By _deletebutton=By.id("btnDelete");
    By _okbuttonfromalertwindow=By.id("dialogDeleteBtn");


     public void enterEmployeeName()
     {
         typetext(_Employeename,loadProp.getProperty("employeename"));
     }
     public void clickonSearchButton()
     {
       clickOnElement(_searchbutton);
    }
     public void clickOnCheckBox()
    {
         clickOnElement(_checkbox);
    }
     public void clickOnDeleteButton()
    {
        clickOnElement(_deletebutton);
    }
     public void clickOnOkButtonFromAlertBox(){
         clickOnElement(_okbuttonfromalertwindow);
         waitForVisible(_okbuttonfromalertwindow,20);
    }
}
