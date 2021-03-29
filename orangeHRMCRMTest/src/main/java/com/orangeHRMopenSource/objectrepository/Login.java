package com.orangeHRMopenSource.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	static {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		LoginPage lp=new LoginPage(d);
		lp.setUsername("admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		Thread.sleep(2000);
		
		AdminPage ap= new AdminPage(d);
		ap.clickUser(d);
		Thread.sleep(2000);
		
		SystemUsersPage sup = new SystemUsersPage(d);
		sup.clickAddUser();
		Thread.sleep(2000);
		
		AddUserPage aup= new AddUserPage(d);
		aup.setUserRole(1);
		aup.setEmployeeName("Alice Duval");
		aup.setEmployeeID("alice_123");
		aup.setStatus(0);
		aup.setPassword("alice123", "alice123");
		aup.clickSave();
		Thread.sleep(4000);
		
		LogoutPage lop=new LogoutPage(d);
		lop.clickLogout();
		Thread.sleep(3000);
		
		d.close();
		
	}

}
