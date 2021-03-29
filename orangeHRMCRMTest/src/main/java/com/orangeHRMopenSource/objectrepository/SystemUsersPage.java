package com.orangeHRMopenSource.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemUsersPage {
	@FindBy(id="btnAdd") private WebElement add_user;
	
public SystemUsersPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

public void clickAddUser() {
	
	add_user.click();
}

}
