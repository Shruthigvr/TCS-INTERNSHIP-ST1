package com.tcs.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tcs.base.BaseSupplier;
import com.tcs.constants.AutomationConstants;
import com.tcs.pages.AdminDashboardPage;
import com.tcs.pages.AdminLoginPage;
import com.tcs.pages.SupplierDashboardPage;
import com.tcs.pages.SupplierLoginPage;
import com.tcs.utilities.excelUtility;

public class PHPTravelsTestCases_Supplier extends BaseSupplier{
	

	SupplierLoginPage obj_supplierlogin;
	SupplierDashboardPage obj_supplierdashboard;
	
	@Test(priority = 1)
	public void verifyLoginPageLaunch() throws IOException, InterruptedException {
	
		obj_supplierlogin= new SupplierLoginPage(driver);
		//obj_supplierlogin.languageSelect();
		String expectedURL = AutomationConstants.PHPTRAVELS_SUPPLIERLOGINPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	@Test(priority = 2)
	public void verifyLoginWithInvalidEmailAndInvalidPassword() throws IOException, InterruptedException {
	
		obj_supplierlogin= new SupplierLoginPage(driver);
		//obj_supplierlogin.languageSelect();
		String email = excelUtility.getCellData(22, 0);
		String password = excelUtility.getCellData(22, 1);
		obj_supplierlogin.setEmail(email);
		obj_supplierlogin.setPassword(password);
		obj_supplierlogin.clickSigninButton();
		String expectedURL = AutomationConstants.PHPTRAVELS_SUPPLIERLOGINPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	

	@Test(priority = 3)
	public void verifyLoginBlankEmail() throws IOException, InterruptedException {
	
		obj_supplierlogin= new SupplierLoginPage(driver);
		//obj_supplierlogin.languageSelect();
		String password = excelUtility.getCellData(23, 1);
		obj_supplierlogin.setPassword(password);
		obj_supplierlogin.clickSigninButton();
		Thread.sleep(3000);
		String expectedURL = AutomationConstants.PHPTRAVELS_SUPPLIERLOGINPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	@Test(priority = 4)
	public void verifyBlankEmailandPassword() throws IOException, InterruptedException {
	
		obj_supplierlogin= new SupplierLoginPage(driver);
		//obj_supplierlogin.languageSelect();
		obj_supplierlogin.clickSigninButton();
		String expectedURL = AutomationConstants.PHPTRAVELS_SUPPLIERLOGINPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	@Test(priority = 5)
	public void verifyLoginBlankPassword() throws IOException, InterruptedException {
	
		obj_supplierlogin= new SupplierLoginPage(driver);
		//obj_supplierlogin.languageSelect();
		String email = excelUtility.getCellData(24, 0);
		obj_supplierlogin.setPassword(email);
		obj_supplierlogin.clickSigninButton();
		String expectedURL = AutomationConstants.PHPTRAVELS_SUPPLIERLOGINPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	
	
	@Test(priority = 6)
	public void verifyLoginWithValidEmailAndInValidPassword() throws IOException, InterruptedException {
	
		obj_supplierlogin= new SupplierLoginPage(driver);
		//obj_supplierlogin.languageSelect();
		String email = excelUtility.getCellData(25, 0);
		String password = excelUtility.getCellData(25, 1);
		obj_supplierlogin.setEmail(email);
		obj_supplierlogin.setPassword(password);
		obj_supplierlogin.clickSigninButton();
		String expectedURL = AutomationConstants.PHPTRAVELS_SUPPLIERLOGINPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	
	@Test(priority = 7)
	public void verifyLoginWithInValidEmailAndValidPassword() throws IOException, InterruptedException {
	
		obj_supplierlogin= new SupplierLoginPage(driver);
		//obj_supplierlogin.languageSelect();
		String email = excelUtility.getCellData(26, 0);
		String password = excelUtility.getCellData(26, 1);
		obj_supplierlogin.setEmail(email);
		obj_supplierlogin.setPassword(password);
		obj_supplierlogin.clickSigninButton();
		String expectedURL = AutomationConstants.PHPTRAVELS_SUPPLIERLOGINPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	
	
	@Test(priority = 8)
	public void verifyRememberMeCheckbox() throws IOException, InterruptedException {
	
		obj_supplierlogin= new SupplierLoginPage(driver);
		Thread.sleep(3000);
		obj_supplierlogin.clickRememberMeCheckbox();
		String expectedURL = AutomationConstants.PHPTRAVELS_SUPPLIERLOGINPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
				
	}
	
	@Test(priority = 9)
	public void verifyLoginWithValidEmailAndValidPassword() throws IOException, InterruptedException {
	
		obj_supplierlogin= new SupplierLoginPage(driver);
		String email = excelUtility.getCellData(21, 0);
		String password = excelUtility.getCellData(21, 1);
		obj_supplierlogin.setEmail(email);
		obj_supplierlogin.setPassword(password);
		obj_supplierlogin.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_SUPPLIER_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);		
		
	}
	
	@Test(priority = 10)
	public void verifySalesOverviewandSummary() throws IOException, InterruptedException {
	
		obj_supplierlogin= new SupplierLoginPage(driver);
		String email = excelUtility.getCellData(21, 0);
		String password = excelUtility.getCellData(21, 1);
		obj_supplierlogin.setEmail(email);
		obj_supplierlogin.setPassword(password);
		obj_supplierlogin.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_SUPPLIER_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
		
		obj_supplierdashboard=new SupplierDashboardPage(driver);
		Thread.sleep(3000);
		obj_supplierdashboard.checkSalesoverview();
		
		
	}
	
	@Test(priority = 11)
	public void verifyRevenueBreakdown() throws IOException, InterruptedException {
	
		obj_supplierlogin= new SupplierLoginPage(driver);
		String email = excelUtility.getCellData(21, 0);
		String password = excelUtility.getCellData(21, 1);
		obj_supplierlogin.setEmail(email);
		obj_supplierlogin.setPassword(password);
		obj_supplierlogin.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_SUPPLIER_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
		
		obj_supplierdashboard=new SupplierDashboardPage(driver);
		Thread.sleep(3000);
		obj_supplierdashboard.checkRevenueBreakdown();
		
		
	}
	
	@Test(priority = 12)
	public void verifyBookingDisplay() throws IOException, InterruptedException {
	
		obj_supplierlogin= new SupplierLoginPage(driver);
		String email = excelUtility.getCellData(21, 0);
		String password = excelUtility.getCellData(21, 1);
		obj_supplierlogin.setEmail(email);
		obj_supplierlogin.setPassword(password);
		obj_supplierlogin.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_SUPPLIER_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
		
		obj_supplierdashboard=new SupplierDashboardPage(driver);
		Thread.sleep(3000);
		obj_supplierdashboard.clickBookingLink();
		
		
	}

}
