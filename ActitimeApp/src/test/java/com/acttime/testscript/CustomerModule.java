package com.acttime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;import com.acttime.POM.HomePage;
import com.acttime.POM.TaskListPage;
import com.acttime.generic.BaseClass;
@Listeners(com.acttime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void createCustomeranddeleteCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String customerName=f.readDataFromExcel("CreateCustomer", 1, 2);
		String description=f.readDataFromExcel("CreateCustomer", 1, 3);
		Thread.sleep(2000);
		HomePage h=new HomePage(driver);
		h.gettaskTab().click();;
		TaskListPage t=new TaskListPage(driver);
		t.getAddnewBtn().click();
		t.getNewCustomerBtn().click();
		t.getCustomerNameTbx().sendKeys(customerName);
		t.getCustomerDescriptionTbx().sendKeys(description);
		t.getGetDropDownBtn().click();;
		t.getGetOurCompanyOpt().click();
		t.getCreateCustomerBtn().click();
		String actualtext=t.getCreatedCustomerHeader().getText();
	SoftAssert s=new SoftAssert();
	s.assertEquals(actualtext,customerName);
	s.assertAll();
	t.getSearchCustbtn().sendKeys(customerName);
	driver.findElement(By.xpath("//span[text()='"+customerName+"']/../..//div[@class='editButton available']")).click();
	Thread.sleep(3000);
	t.getActionsBtn().click();
	Thread.sleep(3000);
	t.getDeleteBtn().click();
	t.getDeletepernamentBtn().click();
	}
}