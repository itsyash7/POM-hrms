package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hrmsLoginpage {
	WebDriver driver;
	public hrmsLoginpage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	By username=By.name("txtUsername");
	By password=By.xpath("//input[@id='txtPassword']");
	By button=By.xpath("//a[@id='btn-login']");
	By title=By.xpath("//a[@id='welcome']");
	
	public WebElement Emailid()
	{
		return driver.findElement(username);
	}
	public WebElement Passwords()
	{
		return driver.findElement(password);
	}
	public WebElement submit()
	{
		return driver.findElement(button);
	}
	public WebElement welcome()
	{
		return driver.findElement(title);
	}
	
	public void login() {
		Emailid().sendKeys("yash.shaha");
		Passwords().sendKeys("Yshah5293@");
		submit().click();
		}}
