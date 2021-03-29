package com.orangeHRMopenSource.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	@FindBy(id="menu_admin_viewAdminModule") private WebElement admin_module;
	
	@FindBy(id="menu_admin_UserManagement") private WebElement user_manage;
	
	@FindBy(id="menu_admin_viewSystemUsers") private WebElement users;
	
	public AdminPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickUser(WebDriver driver) {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(admin_module).perform();
		actions.moveToElement(user_manage).perform();
		actions.moveToElement(users).click().perform();
	}

}
