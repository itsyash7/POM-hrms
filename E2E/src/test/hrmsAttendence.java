package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hrmsAttendence {
	WebDriver driver;
	public  hrmsAttendence(WebDriver driver)
	{
    this.driver=driver;
	}
	By attd=By.xpath("//a[@id='menu_attendance_viewMyAttendanceRecord']");
	By button=By.linkText("My Records");
	By from=By.xpath("//input[@id='attendance_fromDate']");
	By select=By.xpath("//a[contains(text(),'20')]"); 
	
	
	public WebElement Attendence()
	{
		return driver.findElement(attd);
	}
	public WebElement efromdate()
	{
		return driver.findElement(from);
	}
	public WebElement choosedates()
	{
		return driver.findElement(select);
	}
	public WebElement Records()
	{
		return driver.findElement(button);
	}
	}