package com.orangeHRMopenSource.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddUserPage {

	@FindBy(id="systemUser_userType") private WebElement user_role_dropdown;
	@FindBy(id="systemUser_employeeName_empName") private WebElement emp_name;
	@FindBy(id="systemUser_userName") private WebElement emp_username;
	@FindBy(id="systemUser_status") private WebElement emp_status;
	@FindBy(id="systemUser_password") private WebElement user_password;
	@FindBy(id="systemUser_confirmPassword") private WebElement confirm_user_password;
	@FindBy(id="btnSave") private WebElement save_button;
	
public AddUserPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
public void setUserRole(int index) {
	
	Select sel= new Select(user_role_dropdown);
	sel.selectByIndex(index);
}
public void setEmployeeName(String name) {
	emp_name.sendKeys(name);
}
public void setEmployeeID(String username) {
	
	emp_username.sendKeys(username);
}
public void setStatus(int index) {
	Select sel=new Select(emp_status);
	sel.selectByIndex(index);
}
public void setPassword(String pwd,String confirm_pwd) {
	
	user_password.sendKeys(pwd);
	confirm_user_password.sendKeys(confirm_pwd);
}
public void clickSave() {
	
	save_button.click();
}
}
