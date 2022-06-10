package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class hrmsAttendence {
	WebDriver driver;
	public  hrmsAttendence(WebDriver driver)
	{
    this.driver=driver;
	}
	By attd=By.xpath("//a[@id='menu_attendance_viewMyAttendanceRecord']");
	By myRec=By.linkText("My Records");
	By fromicon=By.cssSelector(":nth-child(1) > .ui-datepicker-trigger");
	By toicon=By.cssSelector(":nth-child(2) > .ui-datepicker-trigger");
	By mon=By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"); 
	By search=By.cssSelector("#searchBtn");
	By message=By.xpath("//td[contains(text(),'No data available in table')]");
	
	public WebElement Attendence()
	{
		return driver.findElement(attd);
	}
	public WebElement Records()
	{
		return driver.findElement(myRec);
	}
	// for from;
	public WebElement fromdateicon()
	{
		return driver.findElement(fromicon);
	}
	public void selecmonth()
	{
		Select year=new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")));
	    year.selectByVisibleText("May");
	}
	public void  fromdate()
	{
	    List<WebElement> dates=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//td"));
	    int total_node=dates.size();
	    for(int i=0;i<total_node;i++)
	    {
	    	String dates1=dates.get(i).getText();
	    	if(dates1.equals("1"))
	    	{
	    		dates.get(i).click();
	    		break;
	    	}}}
	
	// for To;
	public WebElement todateicon()
	{
		return driver.findElement(toicon);
	}
	public void  todate()
	{
	    List<WebElement> dates=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//td"));
	    int total_node=dates.size();
	    for(int i=0;i<total_node;i++)
	    {
	    	String dates1=dates.get(i).getText();
	    	if(dates1.equals("10"))
	    	{
	    		dates.get(i).click();
	    		break;
	    	}}}
	//click On search button
	public WebElement searchBtn() {
		return driver.findElement(search);
	}
	public WebElement alertMsg()
	{
		return driver.findElement(message);
	}
	}