package com.acttime.testscript;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.acttime.POM.HomePage;
import com.acttime.POM.TaskListPage;
import com.acttime.generic.BaseClass;
@Listeners(com.acttime.generic.ListenerImplementation.class)
public class ProjectModule extends BaseClass{
	@Test
	public void createProjectandDeleteProject() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String ProjectName=f.readDataFromExcel("CreateProject", 0, 0);
		String ProjectDesc=f.readDataFromExcel("CreateProject", 0, 1);
		String Tasks=f.readDataFromExcel("CreateProject", 0, 2);
		HomePage h= new HomePage(driver);
		Thread.sleep(2000);
		h.gettaskTab().click();
		TaskListPage t =new TaskListPage(driver);
		t.getAddnewBtn().click();
		t.getnewProjectBtn().click();
		t.getprojectNameTbx().sendKeys(ProjectName);
		Thread.sleep(3000);
		t.getprojectDropdownBtn().click();
		t.getGetOurCompanyOpt().click();
		t.getprojectDescriptionTbx().sendKeys(ProjectDesc);
		t.getaddTasks().click();
		t.getenterTaskTbx().sendKeys(Tasks);
		t.getcreateProjectBtn().click();
		t.getSearchCustbtn().sendKeys(ProjectName);
	    driver.findElement(By.xpath("//span[text()='"+ProjectName+"']/../..//div[@class='editButton available']")).click();
		Thread.sleep(8000);
		t.getprojectactionsBtn().click();
	    Thread.sleep(4000);
	    t.getprojectdeleteBtn().click();
	     Thread.sleep(2000);
	    t.getprojectdeletepernamentBtn().click();
		
	}
}
