package Hrms;

import java.io.IOException;

import org.testng.Assert;
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
	
// logging in 
    hrmsLoginpage hr=new hrmsLoginpage(driver);
	hr.login();
	// traversing to attendance page
	hrmsAttendence hr1=new hrmsAttendence(driver);
	hr1.Attendence().click();
	hr1.Records().click();
    hr1.fromdateicon().click();
    //From=
    hr1.selecmonth();
    hr1.fromdate();
    // To=
    hr1.todateicon().click();
    hr1.todate();
    //search
    hr1.searchBtn().click();
	Assert.assertEquals(hr1.alertMsg().getText(),"No data available in table");
	
}
}
