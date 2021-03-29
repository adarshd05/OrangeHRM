package com.orangeHRMopenSource.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangeHRMopenSource.objectrepository.AddUserPage;
import com.orangeHRMopenSource.objectrepository.AdminPage;
import com.orangeHRMopenSource.objectrepository.SystemUsersPage;

import comm.orangeHRMopenSourse.generics.BaseClass;

@Listeners(comm.orangeHRMopenSourse.generics.ListnerImplementation.class)
public class AddUser extends BaseClass {
	@Test
	public void addUser() throws InterruptedException, IOException {
		Assert.fail();
		AdminPage ap= new AdminPage(driver);
		ap.clickUser(driver);  
		
		w.waitForElementGui(driver);
		
		SystemUsersPage sup = new SystemUsersPage(driver);
		sup.clickAddUser();
		w.waitForElementGui(driver);

		
		AddUserPage aup= new AddUserPage(driver);
		aup.setUserRole(1);
		aup.setEmployeeName(f.getPropertyValue("empname"));
		aup.setEmployeeID(f.getPropertyValue("empID"));
		aup.setStatus(0);
		aup.setPassword(f.getPropertyValue("emp_pwd"), f.getPropertyValue("con_emp_pwd"));
		aup.clickSave();
		w.waitForElementGui(driver);
	
		
	}

}
