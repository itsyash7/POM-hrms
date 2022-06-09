package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hrmsDirectory {
	WebDriver driver;
	public  hrmsDirectory(WebDriver driver)
	{
    this.driver=driver;
	}
	By dir=By.xpath("//a[@id='menu_pim_viewDirectory']");
	By ename=By.xpath("//input[@id='empDir_employee_name']");
	By eid=By.xpath("//input[@id='empDir_id']"); 
	By button=By.xpath("//input[@id='searchBtn']");
	
	public WebElement directory()
	{
		return driver.findElement(dir);
	}
	public WebElement empname()
	{
		return driver.findElement(ename);
	}
	public WebElement empid()
	{
		return driver.findElement(eid);
	}
	public WebElement search()
	{
		return driver.findElement(button);
	}
	}