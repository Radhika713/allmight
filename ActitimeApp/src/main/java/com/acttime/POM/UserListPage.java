package com.acttime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement adduserBtn;
	@FindBy(id="userDataLightBox_firstNameField")
	private WebElement firstnametbx;
	@FindBy(id="userDataLightBox_lastNameField")
	private WebElement lastnametbx;
	@FindBy(id="userDataLightBox_emailField")
	private WebElement emailtbx;
	@FindBy(id="userDataLightBox_usernameField")
	private WebElement usernametbx;
	@FindBy(id="userDataLightBox_passwordField")
	private WebElement pwdtbx;
	@FindBy(id="userDataLightBox_passwordCopyField")
	private WebElement retypepwdtbx;
	@FindBy(id="userDataLightBox_timeZoneGroupValueCell")
	private WebElement timezonedropdone;
	@FindBy(xpath="//a[@class='x-menu-item']/div[text()='London Office']")
	private WebElement timezone;
	@FindBy(id="userDataLightBox_hireDatePlaceholder")
	private WebElement clickonhiredate;
	@FindBy(xpath="//span[text()='15']")
	private WebElement selectDate;
	@FindBy(id="userDataLightBox_commitBtn")
	private WebElement createuserbtn;
	@FindBy(id="userDataLightBox_deleteBtn")
	private WebElement deleteuserbtn;
	public UserListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getadduserBtn()
	{
		return adduserBtn;
	}
	public WebElement getfirstnametbx()
	{
		return firstnametbx;
	}
	public WebElement getlastnametbx()
	{
		return lastnametbx;
	}
	public WebElement getemailtbx()
	{
		return emailtbx;
	}
	public WebElement getusernametbx()
	{
		return usernametbx;
	}
	public WebElement getpwdtbx()
	{
		return pwdtbx;
	}
	public WebElement getretypepwdtbx()
	{
		return retypepwdtbx;
	}
	public WebElement gettimezonedropdone()
	{
		return timezonedropdone;
	}
	public WebElement gettimezone()
	{
		return timezone;
	}
	public WebElement getclickonhiredate()
	{
		return clickonhiredate;
	}
	public WebElement getselectDate()
	{
		return selectDate;
	}
	public WebElement getcreateuserbtn()
	{
		return createuserbtn;
	}
	public WebElement getdeleteuserbtn()
	{
		return deleteuserbtn;
	}
}
