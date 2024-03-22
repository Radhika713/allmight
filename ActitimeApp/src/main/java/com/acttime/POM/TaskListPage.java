package com.acttime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewBtn;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerBtn;
	@FindBy(id="customerLightBox_nameField")
	private WebElement customerNameTbx;
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement customerDescriptionTbx;
	@FindBy(className = "x-btn-text")
	private WebElement getDropDownBtn;
	@FindBy(linkText = "Our Company")
	private WebElement getOurCompanyOpt;
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createCustomerBtn;
	@FindBy(xpath="//div[@class='tasksTable hasSelectedCustomer']/div[1]/div[@class='title ellipsis']")
	private WebElement createdCustomerHeader;
	@FindBy(xpath="//input[@placeholder='Start typing name ...']")
	private WebElement searchCustbtn;
	@FindBy(xpath="//div[text()='ACTIONS']")
	private WebElement actionsBtn;
	@FindBy(xpath="//div[text()='Delete']")
	private WebElement deleteBtn;
	@FindBy(id="customerPanel_deleteConfirm_submitTitle")
	private WebElement deletepernamentBtn;
	
	//project module
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProjectBtn;
	@FindBy(id="projectPopup_projectNameField")
	private WebElement projectNameTbx;
	@FindBy(xpath="//table[contains(@class,'ancestorEventsListener')]")
	private WebElement projectDropdownBtn;
	@FindBy(id="projectPopup_projectDescriptionField")
	private WebElement projectDescriptionTbx;
	@FindBy(xpath="//span[text()='Add Tasks to this Project']")
	private WebElement addTasks;
	@FindBy(xpath="//input[@placeholder='Enter task name']")
	private WebElement enterTaskTbx;
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement createProjectBtn;
	@FindBy(xpath="//div[@class='editProjectPanelHeader']//div[text()='ACTIONS']")
	private WebElement projectactionsBtn;
	@FindBy(xpath="(//div[text()='Delete'])[3]")
	private WebElement projectdeleteBtn;
	@FindBy(id="projectPanel_deleteConfirm_submitTitle")
	private WebElement projectdeletepernamentBtn;
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewBtn() {
		return addnewBtn;
	}
	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}
	public WebElement getCustomerNameTbx() {
		return customerNameTbx;
	}
	public WebElement getCustomerDescriptionTbx() {
		return customerDescriptionTbx;
	}
	public WebElement getGetDropDownBtn() {
		return getDropDownBtn;
	}
	public WebElement getGetOurCompanyOpt() {
		return getOurCompanyOpt;
	}
	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}
	public WebElement getCreatedCustomerHeader() {
		return createdCustomerHeader;
	}
	public WebElement getSearchCustbtn() {
		return searchCustbtn;
	}
	public WebElement getActionsBtn() {
		return actionsBtn;
	}
	public WebElement getDeleteBtn() {
		return deleteBtn;
	}
	public WebElement getDeletepernamentBtn() {
		return deletepernamentBtn;
	}
	//project module
	public WebElement getnewProjectBtn()
	{
		return newProjectBtn;
	}
	public WebElement getprojectNameTbx()
	{
		return projectNameTbx;
	}
	public WebElement getprojectDropdownBtn()
	{
		return projectDropdownBtn;
	}
	public WebElement getprojectDescriptionTbx()
	{
		return projectDescriptionTbx;
	}
	public WebElement getaddTasks()
	{
		return addTasks;
	}
	public WebElement getenterTaskTbx()
	{
		return enterTaskTbx;
	}
	public WebElement getcreateProjectBtn()
	{
		return createProjectBtn;
	}
	public WebElement getprojectactionsBtn()
	{
		return projectactionsBtn;
	}
	public WebElement getprojectdeleteBtn()
	{
		return projectdeleteBtn;
	}
	public WebElement getprojectdeletepernamentBtn()
	{
		return projectdeletepernamentBtn;
	}
}
