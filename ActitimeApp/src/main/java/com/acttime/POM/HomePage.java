package com.acttime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="logoutLink")
	private WebElement logoutbtn;
	@FindBy (linkText="TASKS")
	private WebElement taskTab;
	@FindBy(linkText="USERS")
	private WebElement userTab;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void logout()
	{
		logoutbtn.click();
	}
	public WebElement gettaskTab()
	{
		return taskTab;
	}
	public WebElement getuserTab()
	{
		return userTab;
	}
	
}
