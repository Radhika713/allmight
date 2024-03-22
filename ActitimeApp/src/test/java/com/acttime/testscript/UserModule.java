package com.acttime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.acttime.POM.HomePage;
import com.acttime.POM.UserListPage;
import com.acttime.generic.BaseClass;
@Listeners(com.acttime.generic.ListenerImplementation.class)
public class UserModule extends BaseClass {
	@Test
	public void addUserAndDeleteUser() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String firstname = f.readDataFromExcel("createuser", 0, 0);
		String lastname = f.readDataFromExcel("createuser", 0, 1);
		String email = f.readDataFromExcel("createuser", 0, 2);
		String username=f.readDataFromExcel("createuser", 0, 3);
		String pwd=f.readDataFromExcel("createuser", 0, 4);
		HomePage h=new HomePage(driver);
		Thread.sleep(2000);
		h.getuserTab().click();
		UserListPage u=new UserListPage(driver);
		u.getadduserBtn().click();
		u.getfirstnametbx().sendKeys(firstname);
		u.getlastnametbx().sendKeys(lastname);
		u.getemailtbx().sendKeys(email);
		u.getusernametbx().sendKeys(username);
		u.getpwdtbx().sendKeys(pwd);
		u.getretypepwdtbx().sendKeys(pwd);
		u.gettimezonedropdone().click();
		u.gettimezone().click();
		u.getclickonhiredate().click();
		u.getselectDate().click();
		u.getcreateuserbtn().click();
		driver.findElement(By.xpath("//span[contains(text(),'"+firstname+"')]")).click();
		u.getdeleteuserbtn().click();
		driver.switchTo().alert().accept();
	}
}
