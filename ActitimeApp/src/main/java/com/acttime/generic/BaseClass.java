package com.acttime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.acttime.POM.HomePage;
import com.acttime.POM.LoginPage;
public class BaseClass {
	public static WebDriver driver;
	public FileLib f=new FileLib();
	@BeforeTest
	public void openBrowser() throws IOException
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url=f.readDataFromProperty("url");
		driver.get(url);
		Reporter.log("openBrowser", true);
	}
	@BeforeMethod
public void login() throws IOException
	{
	String un=f.readDataFromProperty("un");
	String pwd=f.readDataFromProperty("pwd");
	LoginPage l=new LoginPage(driver);
	l.login(un, pwd);
	Reporter.log("login", true);
	}
	@AfterMethod
public void logout() throws InterruptedException
	{
		Thread.sleep(2000);
		HomePage h=new HomePage(driver);
		h.logout();
		Reporter.log("logout", true);
	}
	@AfterTest
public void closeBrowser()
	{
		driver.quit();
		Reporter.log("closeBrowser",true);
	}
}
