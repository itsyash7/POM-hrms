package Hrms;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Resources.base;
import pageObjects.hrmsAttendence;
import pageObjects.hrmsLoginpage;

public class Attendencetest extends base {
@Test

public void employeeSearch() throws IOException
{
	driver=InitializeDriver();
	driver.get("https://hrms.synerzip.in/");
	

    hrmsLoginpage hr=new hrmsLoginpage(driver);
	hr.login();
	hrmsAttendence hr1=new hrmsAttendence(driver);
	hr1.Attendence().click();
	hr1.Records().click();
    //hr1.efromdate().click();//
    driver.findElement(By.cssSelector(":nth-child(1) > .ui-datepicker-trigger")).click();
    List<WebElement>al=driver.findElements(By.cssSelector(":nth-child(1) > .ui-datepicker-trigger"));
  
    for(int i=0;i<al.size();i++)
    {
    	String value=al.get(i).(":nth-child(1) > :nth-child(3) > .ui-state-default");
    	if(value.equalsIgnoreCase("10"))
    	{
    		al.get(i).click();
    		break;
    	}
    }
    hr1.choosedates().click();
	
	driver.quit();
	
}
}
