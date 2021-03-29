package com.orangeHRMopenSource.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="txtUsername") private WebElement username;
	
	@FindBy(id="txtPassword") private WebElement password;
	
	@FindBy(id="btnLogin")private WebElement login_button;
	
	public LoginPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	public void setUsername(String un) {
		username.sendKeys(un);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickLogin() {
		login_button.click();
	}

}
