package com.orangeHRMopenSource.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	@FindBy(id="welcome") private WebElement user_name;
	
	@FindBy(xpath="//ul//a[text()='Logout']") private WebElement logout;
public LogoutPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
public void clickLogout() throws InterruptedException {
	user_name.click();
	Thread.sleep(2000);
	logout.click();
}

}
