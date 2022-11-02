package com.tcs.tests;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tcs.alert.BrowserAlertHandler;
import com.tcs.base.BaseSetup;
import com.tcs.constants.AutomationConstants;
import com.tcs.pages.CustomerDashboardPage;
import com.tcs.pages.CustomerLoginPage;
import com.tcs.utilities.excelUtility;

public class PHPTravelsTestCases_User extends BaseSetup{
	CustomerLoginPage obj_customer;
	CustomerDashboardPage obj_customerDashboard;
	BrowserAlertHandler obj_alert;
	
	@Test(priority = 1)
	public void verifyLoginPageLaunch() throws IOException, InterruptedException {
	
		obj_customer= new CustomerLoginPage(driver);
		//obj_customer.languageSelect();
		String expectedURL = AutomationConstants.PHPTRAVELS_LOGINPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	@Test(priority = 1)
	public void verifyLoginWithInvalidEmailAndInvalidPassword() throws IOException, InterruptedException {
	
		obj_customer= new CustomerLoginPage(driver);
		//obj_customer.languageSelect();
		String email = excelUtility.getCellData(1, 0);
		String password = excelUtility.getCellData(1, 1);
		obj_customer.setEmail(email);
		obj_customer.setPassword(password);
		obj_customer.clickSigninButton();
		String expectedURL = AutomationConstants.PHPTRAVELS_LOGINPAGE_FAIL_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	

	@Test(priority = 1)
	public void verifyLoginBlankEmail() throws IOException, InterruptedException {
	
		obj_customer= new CustomerLoginPage(driver);
		//obj_customer.languageSelect();
		String password = excelUtility.getCellData(2, 1);
		obj_customer.setPassword(password);
		obj_customer.clickSigninButton();
		String expectedURL = AutomationConstants.PHPTRAVELS_LOGINPAGE_FAIL_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	@Test(priority = 1)
	public void verifyBlankEmailandPassword() throws IOException, InterruptedException {
	
		obj_customer= new CustomerLoginPage(driver);
		//obj_customer.languageSelect();
		obj_customer.clickSigninButton();
		String expectedURL = AutomationConstants.PHPTRAVELS_LOGINPAGE_FAIL_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	@Test(priority = 1)
	public void verifyLoginBlankPassword() throws IOException, InterruptedException {
	
		obj_customer= new CustomerLoginPage(driver);
		//obj_customer.languageSelect();
		String email = excelUtility.getCellData(3, 0);
		obj_customer.setPassword(email);
		obj_customer.clickSigninButton();
		String expectedURL = AutomationConstants.PHPTRAVELS_LOGINPAGE_FAIL_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	
	
	@Test(priority = 1)
	public void verifyLoginWithValidEmailAndInValidPassword() throws IOException, InterruptedException {
	
		obj_customer= new CustomerLoginPage(driver);
		//obj_customer.languageSelect();
		String email = excelUtility.getCellData(4, 0);
		String password = excelUtility.getCellData(4, 1);
		obj_customer.setEmail(email);
		obj_customer.setPassword(password);
		obj_customer.clickSigninButton();
		String expectedURL = AutomationConstants.PHPTRAVELS_LOGINPAGE_FAIL_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	
	@Test(priority = 1)
	public void verifyLoginWithInValidEmailAndValidPassword() throws IOException, InterruptedException {
	
		obj_customer= new CustomerLoginPage(driver);
		//obj_customer.languageSelect();
		String email = excelUtility.getCellData(5, 0);
		String password = excelUtility.getCellData(5, 1);
		obj_customer.setEmail(email);
		obj_customer.setPassword(password);
		obj_customer.clickSigninButton();
		String expectedURL = AutomationConstants.PHPTRAVELS_LOGINPAGE_FAIL_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	
	@Test(priority = 1)
	public void verifySignupButton() throws IOException, InterruptedException {
	
		obj_customer= new CustomerLoginPage(driver);
		obj_customer.clickSignupbutton();
		String expectedURL = AutomationConstants.PHPTRAVELS_SIGNUPPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	
	@Test(priority = 1)
	public void verifyRememberMeCheckbox() throws IOException, InterruptedException {
	
		obj_customer= new CustomerLoginPage(driver);
		obj_customer.clickRememberMeCheckbox();
		String expectedURL = AutomationConstants.PHPTRAVELS_LOGINPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
				
	}
	
	@Test(priority = 1)
	public void verifyLoginWithValidEmailAndValidPassword() throws IOException, InterruptedException {
	
		obj_customer= new CustomerLoginPage(driver);
		//obj_customer.languageSelect();
		//obj_customer.selectLoginPage();
		String email = excelUtility.getCellData(0, 0);
		String password = excelUtility.getCellData(0, 1);
		System.out.println(email);
		obj_customer.setEmail(email);
		obj_customer.setPassword(password);
		obj_customer.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_CUSTOMER_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);		
		
	}

	@Test(priority = 1)
	public void verifyMyBookings() throws IOException, InterruptedException {
	
		obj_customer= new CustomerLoginPage(driver);
		//obj_customer.languageSelect();
		//obj_customer.selectLoginPage();
		String email = excelUtility.getCellData(0, 0);
		String password = excelUtility.getCellData(0, 1);
		System.out.println(email);
		obj_customer.setEmail(email);
		obj_customer.setPassword(password);
		obj_customer.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_CUSTOMER_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
		
		obj_customerDashboard=new CustomerDashboardPage(driver);
		obj_customerDashboard.clickMybooking();
		if(obj_alert.isDialogPresent(driver)) {
			obj_alert.acceptBrowserAlert(driver);
		}
		String expectedBookingURL = AutomationConstants.PHPTRAVELS_CUSTOMER_DASHBOARD_MYBOOKINGS_URL;
		String actualBookingURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedBookingURL, actualBookingURL);
		
	}
	
	@Test(priority = 1)
	public void verifyAddFunds() throws IOException, InterruptedException {
	
		obj_customer= new CustomerLoginPage(driver);
		//obj_customer.languageSelect();
		//obj_customer.selectLoginPage();
		String email = excelUtility.getCellData(0, 0);
		String password = excelUtility.getCellData(0, 1);
		System.out.println(email);
		obj_customer.setEmail(email);
		obj_customer.setPassword(password);
		obj_customer.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_CUSTOMER_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
//		
		obj_customerDashboard=new CustomerDashboardPage(driver);
		obj_customerDashboard.clickAddFunds();
		if(obj_alert.isDialogPresent(driver)) {
			obj_alert.acceptBrowserAlert(driver);
		}
		String expectedAddfundURL = AutomationConstants.PHPTRAVELS_CUSTOMER_DASHBOARD_ADDFUNDS_URL;
		String actualAddfundURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedAddfundURL, actualAddfundURL);
		
	}
	
	@Test(priority = 1)
	public void verifyMyProfile() throws IOException, InterruptedException {
	
		obj_customer= new CustomerLoginPage(driver);
		//obj_customer.languageSelect();
		//obj_customer.selectLoginPage();
		String email = excelUtility.getCellData(0, 0);
		String password = excelUtility.getCellData(0, 1);
		System.out.println(email);
		obj_customer.setEmail(email);
		obj_customer.setPassword(password);
		obj_customer.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_CUSTOMER_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
		
		obj_customerDashboard=new CustomerDashboardPage(driver);
		obj_customerDashboard.clickMyProfile();
		if(obj_alert.isDialogPresent(driver)) {
			obj_alert.acceptBrowserAlert(driver);
		}
		String expectedProfileURL = AutomationConstants.PHPTRAVELS_CUSTOMER_DASHBOARD_MYPROFILE_URL;
		String actualProfileURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedProfileURL, actualProfileURL);
	
	}
	
	@Test(priority = 1)
	public void verifyLogout() throws IOException, InterruptedException {
	
		obj_customer= new CustomerLoginPage(driver);
		//obj_customer.languageSelect();
		//obj_customer.selectLoginPage();
		String email = excelUtility.getCellData(0, 0);
		String password = excelUtility.getCellData(0, 1);
		System.out.println(email);
		obj_customer.setEmail(email);
		obj_customer.setPassword(password);
		obj_customer.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_CUSTOMER_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
		
		obj_customerDashboard=new CustomerDashboardPage(driver);
		obj_customerDashboard.clickLogout();
		if(obj_alert.isDialogPresent(driver)) {
			obj_alert.acceptBrowserAlert(driver);
		}
		String expectedloginURL = AutomationConstants.PHPTRAVELS_CUSTOMER_DASHBOARD_LOGOUT_URL;
		String actualloginURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedloginURL, actualloginURL);
		
	}
	@Test(priority = 1)
	public void verifyPayPalPayment() throws IOException, InterruptedException{
		obj_customer= new CustomerLoginPage(driver);
		//obj_customer.languageSelect();
		//obj_customer.selectLoginPage();
		String email = excelUtility.getCellData(0, 0);
		String password = excelUtility.getCellData(0, 1);
		System.out.println(email);
		obj_customer.setEmail(email);
		obj_customer.setPassword(password);
		obj_customer.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_CUSTOMER_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().accept();
		if(obj_alert.isDialogPresent(driver)) {
			obj_alert.acceptBrowserAlert(driver);
		}
		obj_customerDashboard=new CustomerDashboardPage(driver);
		obj_customerDashboard.clickAddFunds();
		if(obj_alert.isDialogPresent(driver)) {
			obj_alert.acceptBrowserAlert(driver);
		}
		Thread.sleep(3000);
		obj_customerDashboard.paypal();
		Thread.sleep(3000);
		String expectedPaypalURL = AutomationConstants.PHPTRAVELS_PAYPAL_URL;
		String actualPaypalURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedPaypalURL, actualPaypalURL);
		
				
	}
	@Test(priority = 1)
	public void verifyVoucher() throws IOException, InterruptedException {
		obj_customer= new CustomerLoginPage(driver);
		//obj_customer.languageSelect();
		//obj_customer.selectLoginPage();
		String email = excelUtility.getCellData(0, 0);
		String password = excelUtility.getCellData(0, 1);
		System.out.println(email);
		obj_customer.setEmail(email);
		obj_customer.setPassword(password);
		obj_customer.clickSigninButton();	
		
		String expectedURL = AutomationConstants.PHPTRAVELS_CUSTOMER_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
//		
		obj_customerDashboard=new CustomerDashboardPage(driver);
		
		obj_customerDashboard.clickMybooking();
		if(obj_alert.isDialogPresent(driver)) {
			obj_alert.acceptBrowserAlert(driver);
		}
		obj_customerDashboard.viewVoucher();
								
	}
	
	@Test(priority = 8)
	public void verifyAddressUpdate() throws IOException, InterruptedException {
		obj_customer= new CustomerLoginPage(driver);
		//obj_customer.languageSelect();
		//obj_customer.selectLoginPage();
		String email = excelUtility.getCellData(0, 0);
		String password = excelUtility.getCellData(0, 1);
		System.out.println(email);
		obj_customer.setEmail(email);
		obj_customer.setPassword(password);
		obj_customer.clickSigninButton();	
		
		String expectedURL = AutomationConstants.PHPTRAVELS_CUSTOMER_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
		
		obj_customerDashboard=new CustomerDashboardPage(driver);
		if(obj_alert.isDialogPresent(driver)) {
			obj_alert.acceptBrowserAlert(driver);
		}
		
		obj_customerDashboard.clickMyProfile();
		if(obj_alert.isDialogPresent(driver)) {
			obj_alert.acceptBrowserAlert(driver);
		}
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("window.scroll(0,1000)");
		String address1 = excelUtility.getCellData1(0, 0);
		String address2 = excelUtility.getCellData1(0, 1);
		obj_customerDashboard.updateAddress1(address1);
		obj_customerDashboard.updateAddress2(address2);
		obj_customerDashboard.clickUpdateProfile();
								
	}
}
