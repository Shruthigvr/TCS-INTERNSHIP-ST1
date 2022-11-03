package com.tcs.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tcs.base.BaseAdmin;
import com.tcs.constants.AutomationConstants;
import com.tcs.pages.AdminDashboardPage;
import com.tcs.pages.AdminLoginPage;
import com.tcs.pages.AgentLoginPage;
import com.tcs.utilities.excelUtility;

public class PHPTravelsTestCases_Admin extends BaseAdmin{
	
	AdminLoginPage obj_adminlogin;
	AdminDashboardPage obj_admindashboard;
	
	@Test(priority = 1)
	public void verifyLoginPageLaunch() throws IOException, InterruptedException {
	
		obj_adminlogin= new AdminLoginPage(driver);
		//obj_adminlogin.languageSelect();
		String expectedURL = AutomationConstants.PHPTRAVELS_ADMINLOGINPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	@Test(priority = 2)
	public void verifyLoginWithInvalidEmailAndInvalidPassword() throws IOException, InterruptedException {
	
		obj_adminlogin= new AdminLoginPage(driver);
		//obj_adminlogin.languageSelect();
		String email = excelUtility.getCellData(15, 0);
		String password = excelUtility.getCellData(15, 1);
		obj_adminlogin.setEmail(email);
		obj_adminlogin.setPassword(password);
		obj_adminlogin.clickSigninButton();
		String expectedURL = AutomationConstants.PHPTRAVELS_ADMINLOGINPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	

	@Test(priority = 3)
	public void verifyLoginBlankEmail() throws IOException, InterruptedException {
	
		obj_adminlogin= new AdminLoginPage(driver);
		//obj_adminlogin.languageSelect();
		String password = excelUtility.getCellData(16, 1);
		obj_adminlogin.setPassword(password);
		obj_adminlogin.clickSigninButton();
		Thread.sleep(3000);
		String expectedURL = AutomationConstants.PHPTRAVELS_ADMINLOGINPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	@Test(priority = 4)
	public void verifyBlankEmailandPassword() throws IOException, InterruptedException {
	
		obj_adminlogin= new AdminLoginPage(driver);
		//obj_adminlogin.languageSelect();
		obj_adminlogin.clickSigninButton();
		String expectedURL = AutomationConstants.PHPTRAVELS_ADMINLOGINPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	@Test(priority = 5)
	public void verifyLoginBlankPassword() throws IOException, InterruptedException {
	
		obj_adminlogin= new AdminLoginPage(driver);
		//obj_adminlogin.languageSelect();
		String email = excelUtility.getCellData(17, 0);
		obj_adminlogin.setPassword(email);
		obj_adminlogin.clickSigninButton();
		String expectedURL = AutomationConstants.PHPTRAVELS_ADMINLOGINPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	
	
	@Test(priority = 6)
	public void verifyLoginWithValidEmailAndInValidPassword() throws IOException, InterruptedException {
	
		obj_adminlogin= new AdminLoginPage(driver);
		//obj_adminlogin.languageSelect();
		String email = excelUtility.getCellData(18, 0);
		String password = excelUtility.getCellData(18, 1);
		obj_adminlogin.setEmail(email);
		obj_adminlogin.setPassword(password);
		obj_adminlogin.clickSigninButton();
		String expectedURL = AutomationConstants.PHPTRAVELS_ADMINLOGINPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	
	@Test(priority = 7)
	public void verifyLoginWithInValidEmailAndValidPassword() throws IOException, InterruptedException {
	
		obj_adminlogin= new AdminLoginPage(driver);
		//obj_adminlogin.languageSelect();
		String email = excelUtility.getCellData(19, 0);
		String password = excelUtility.getCellData(19, 1);
		obj_adminlogin.setEmail(email);
		obj_adminlogin.setPassword(password);
		obj_adminlogin.clickSigninButton();
		String expectedURL = AutomationConstants.PHPTRAVELS_ADMINLOGINPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	
	
	@Test(priority = 8)
	public void verifyRememberMeCheckbox() throws IOException, InterruptedException {
	
		obj_adminlogin= new AdminLoginPage(driver);
		Thread.sleep(3000);
		obj_adminlogin.clickRememberMeCheckbox();
		String expectedURL = AutomationConstants.PHPTRAVELS_ADMINLOGINPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
				
	}
	
	@Test(priority = 9)
	public void verifyLoginWithValidEmailAndValidPassword() throws IOException, InterruptedException {
	
		obj_adminlogin= new AdminLoginPage(driver);
		String email = excelUtility.getCellData(14, 0);
		String password = excelUtility.getCellData(14, 1);
		obj_adminlogin.setEmail(email);
		obj_adminlogin.setPassword(password);
		obj_adminlogin.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_ADMIN_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);		
		
	}

	@Test(priority = 10)
	public void verifyBookings() throws IOException, InterruptedException {
	
		obj_adminlogin= new AdminLoginPage(driver);
		String email = excelUtility.getCellData(14, 0);
		String password = excelUtility.getCellData(14, 1);
		obj_adminlogin.setEmail(email);
		obj_adminlogin.setPassword(password);
		obj_adminlogin.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_ADMIN_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
		
		obj_admindashboard= new AdminDashboardPage(driver);
		Thread.sleep(3000);
		obj_admindashboard.clickBookings();
		String expectedBookingURL = AutomationConstants.PHPTRAVELS_ADMIN_DASHBOARD_MYBOOKINGS_URL;
		String actualBookingURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedBookingURL, actualBookingURL);
		
	}
	
	@Test(priority = 11)
	public void verifyBookingStatusUpdate() throws IOException, InterruptedException {
	
		obj_adminlogin= new AdminLoginPage(driver);
		String email = excelUtility.getCellData(14, 0);
		String password = excelUtility.getCellData(14, 1);
		obj_adminlogin.setEmail(email);
		obj_adminlogin.setPassword(password);
		obj_adminlogin.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_ADMIN_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
		
		obj_admindashboard= new AdminDashboardPage(driver);
		Thread.sleep(3000);
		obj_admindashboard.clickBookings();
		obj_admindashboard.statusChange();
		
	}
	
	@Test(priority = 12)
	public void verifyDeleteCancelledRecord() throws IOException, InterruptedException {
	
		obj_adminlogin= new AdminLoginPage(driver);
		String email = excelUtility.getCellData(14, 0);
		String password = excelUtility.getCellData(14, 1);
		obj_adminlogin.setEmail(email);
		obj_adminlogin.setPassword(password);
		obj_adminlogin.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_ADMIN_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
		
		obj_admindashboard= new AdminDashboardPage(driver);
		Thread.sleep(3000);
		obj_admindashboard.clickBookings();
		obj_admindashboard.deleteRecord();
		
	}
	
	@Test(priority = 13)
	public void verifyWebsiteLink() throws IOException, InterruptedException {
	
		obj_adminlogin= new AdminLoginPage(driver);
		String email = excelUtility.getCellData(14, 0);
		String password = excelUtility.getCellData(14, 1);
		obj_adminlogin.setEmail(email);
		obj_adminlogin.setPassword(password);
		obj_adminlogin.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_ADMIN_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
		
		obj_admindashboard= new AdminDashboardPage(driver);
		Thread.sleep(3000);
		obj_admindashboard.websiteLink();
		Thread.sleep(5000);
		List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
		//switch to new tab
		driver.switchTo().window(browserTabs .get(1));
		
		String expectedWebsiteURL = AutomationConstants.PHPTRAVELS_ADMIN_DASHBOARD_WEBSITE_URL;
		String actualWebsiteURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedWebsiteURL, actualWebsiteURL);
				
	}
	
	@Test(priority = 14)
	public void verifyBookingsPaymentSuccessfullInvoice() throws IOException, InterruptedException {
	
		obj_adminlogin= new AdminLoginPage(driver);
		String email = excelUtility.getCellData(14, 0);
		String password = excelUtility.getCellData(14, 1);
		obj_adminlogin.setEmail(email);
		obj_adminlogin.setPassword(password);
		obj_adminlogin.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_ADMIN_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
		
		obj_admindashboard= new AdminDashboardPage(driver);
		Thread.sleep(3000);
		obj_admindashboard.clickBookings();
		obj_admindashboard.displayInvoice();
		
	}
}
