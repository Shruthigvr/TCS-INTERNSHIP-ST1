package com.tcs.tests;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.tcs.base.BaseSetup;
import com.tcs.constants.AutomationConstants;
import com.tcs.pages.AgentDashboardPage;
import com.tcs.pages.AgentLoginPage;
import com.tcs.utilities.excelUtility;

public class PHPTravelsTestCases_Agent extends BaseSetup{
	AgentLoginPage obj_agent;
	AgentDashboardPage obj_agentdashboard;
	
	@Test(priority = 1)
	public void verifyLoginPageLaunch() throws IOException, InterruptedException {
	
		obj_agent= new AgentLoginPage(driver);
		//obj_agent.languageSelect();
		String expectedURL = AutomationConstants.PHPTRAVELS_LOGINPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	@Test(priority = 2)
	public void verifyLoginWithInvalidEmailAndInvalidPassword() throws IOException, InterruptedException {
	
		obj_agent= new AgentLoginPage(driver);
		//obj_agent.languageSelect();
		String email = excelUtility.getCellData(8, 0);
		String password = excelUtility.getCellData(8, 1);
		obj_agent.setEmail(email);
		obj_agent.setPassword(password);
		obj_agent.clickSigninButton();
		String expectedURL = AutomationConstants.PHPTRAVELS_LOGINPAGE_FAIL_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	

	@Test(priority = 3)
	public void verifyLoginBlankEmail() throws IOException, InterruptedException {
	
		obj_agent= new AgentLoginPage(driver);
		//obj_agent.languageSelect();
		String password = excelUtility.getCellData(9, 1);
		obj_agent.setPassword(password);
		obj_agent.clickSigninButton();
		Thread.sleep(3000);
		String expectedURL = AutomationConstants.PHPTRAVELS_LOGINPAGE_FAIL_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	@Test(priority = 4)
	public void verifyBlankEmailandPassword() throws IOException, InterruptedException {
	
		obj_agent= new AgentLoginPage(driver);
		//obj_agent.languageSelect();
		obj_agent.clickSigninButton();
		String expectedURL = AutomationConstants.PHPTRAVELS_LOGINPAGE_FAIL_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	@Test(priority = 5)
	public void verifyLoginBlankPassword() throws IOException, InterruptedException {
	
		obj_agent= new AgentLoginPage(driver);
		//obj_agent.languageSelect();
		String email = excelUtility.getCellData(10, 0);
		obj_agent.setPassword(email);
		obj_agent.clickSigninButton();
		String expectedURL = AutomationConstants.PHPTRAVELS_LOGINPAGE_FAIL_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	
	
	@Test(priority = 6)
	public void verifyLoginWithValidEmailAndInValidPassword() throws IOException, InterruptedException {
	
		obj_agent= new AgentLoginPage(driver);
		//obj_agent.languageSelect();
		String email = excelUtility.getCellData(11, 0);
		String password = excelUtility.getCellData(11, 1);
		obj_agent.setEmail(email);
		obj_agent.setPassword(password);
		obj_agent.clickSigninButton();
		String expectedURL = AutomationConstants.PHPTRAVELS_LOGINPAGE_FAIL_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	
	@Test(priority = 7)
	public void verifyLoginWithInValidEmailAndValidPassword() throws IOException, InterruptedException {
	
		obj_agent= new AgentLoginPage(driver);
		//obj_agent.languageSelect();
		String email = excelUtility.getCellData(12, 0);
		String password = excelUtility.getCellData(12, 1);
		obj_agent.setEmail(email);
		obj_agent.setPassword(password);
		obj_agent.clickSigninButton();
		String expectedURL = AutomationConstants.PHPTRAVELS_LOGINPAGE_FAIL_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	
	@Test(priority = 8)
	public void verifySignupButton() throws IOException, InterruptedException {
	
		obj_agent= new AgentLoginPage(driver);
		obj_agent.clickSignupbutton();
		String expectedURL = AutomationConstants.PHPTRAVELS_SIGNUPPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);	
				
	}
	
	@Test(priority = 9)
	public void verifyRememberMeCheckbox() throws IOException, InterruptedException {
	
		obj_agent= new AgentLoginPage(driver);
		obj_agent.clickRememberMeCheckbox();
		String expectedURL = AutomationConstants.PHPTRAVELS_LOGINPAGE_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
				
	}
	
	@Test(priority = 10)
	public void verifyLoginWithValidEmailAndValidPassword() throws IOException, InterruptedException {
	
		obj_agent= new AgentLoginPage(driver);
		String email = excelUtility.getCellData(7, 0);
		String password = excelUtility.getCellData(7, 1);
		obj_agent.setEmail(email);
		obj_agent.setPassword(password);
		obj_agent.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_AGENT_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);		
		
	}
	

	@Test(priority=11)
    public void verifyMyBookings() throws IOException {
		obj_agent= new AgentLoginPage(driver);
		String email = excelUtility.getCellData(7, 0);
		String password = excelUtility.getCellData(7, 1);
		obj_agent.setEmail(email);
		obj_agent.setPassword(password);
		obj_agent.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_AGENT_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);		
		
		obj_agentdashboard=new AgentDashboardPage(driver);
	    obj_agentdashboard.clickMyBookings();
	    String expectedUrl =AutomationConstants.PHPTRAVELS_AGENT_DASHBOARD_MYBOOKINGS_URL;
	    String actualUrl =driver.getCurrentUrl();
	    Assert.assertEquals(expectedUrl,actualUrl);
	      
	}
	
	@Test(priority=12)
    public void verifyMyProfile() throws IOException {
		obj_agent= new AgentLoginPage(driver);
		String email = excelUtility.getCellData(7, 0);
		String password = excelUtility.getCellData(7, 1);
		obj_agent.setEmail(email);
		obj_agent.setPassword(password);
		obj_agent.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_AGENT_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);		
		
		obj_agentdashboard=new AgentDashboardPage(driver);    
    
	    obj_agentdashboard.clickMyprofile();
	    String expectedUrl=AutomationConstants.PHPTRAVELS_AGENT_DASHBOARD_MYPROFILE_URL;
	    String actualUrl =driver.getCurrentUrl();
	    Assert.assertEquals(expectedUrl,actualUrl);
       
	}
		
	@Test(priority=13)
    public void verifyAddFunds() throws IOException {
		obj_agent= new AgentLoginPage(driver);
		String email = excelUtility.getCellData(7, 0);
		String password = excelUtility.getCellData(7, 1);
		obj_agent.setEmail(email);
		obj_agent.setPassword(password);
		obj_agent.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_AGENT_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);		
		
		obj_agentdashboard=new AgentDashboardPage(driver); 
	    obj_agentdashboard.clickAddFund();
	    String expectedUrl=AutomationConstants.PHPTRAVELS_AGENT_DASHBOARD_ADDFUNDS_URL;
	    String actualUrl =driver.getCurrentUrl();
	    Assert.assertEquals(expectedUrl,actualUrl);
    }
	
		
	@Test(priority=14)
    public void verifyLogout() throws IOException {
		obj_agent= new AgentLoginPage(driver);
		String email = excelUtility.getCellData(7, 0);
		String password = excelUtility.getCellData(7, 1);
		obj_agent.setEmail(email);
		obj_agent.setPassword(password);
		obj_agent.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_AGENT_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);		
		
		obj_agentdashboard=new AgentDashboardPage(driver); 
	    obj_agentdashboard.clickLogout();
	    String expectedUrl =AutomationConstants.PHPTRAVELS_AGENT_DASHBOARD_LOGOUT_URL;
	    String actualUrl =driver.getCurrentUrl();
	    Assert.assertEquals(expectedUrl,actualUrl);
	    System.out.println("Test Passed successfully");
	
	}
	
	@Test(priority=15)
    public void verifyFlights() throws IOException {
		obj_agent= new AgentLoginPage(driver);
		String email = excelUtility.getCellData(7, 0);
		String password = excelUtility.getCellData(7, 1);
		obj_agent.setEmail(email);
		obj_agent.setPassword(password);
		obj_agent.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_AGENT_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);		
		obj_agentdashboard=new AgentDashboardPage(driver); 
        obj_agentdashboard.clickFlights();
	    String expectedUrl =AutomationConstants.PHPTRAVELS_FLIGHTS;
	    String actualUrl =driver.getCurrentUrl();
	    Assert.assertEquals(expectedUrl,actualUrl);
   	}
	
	
	@Test(priority=16)
    public void verifyVisa() throws IOException {
		obj_agent= new AgentLoginPage(driver);
		String email = excelUtility.getCellData(7, 0);
		String password = excelUtility.getCellData(7, 1);
		obj_agent.setEmail(email);
		obj_agent.setPassword(password);
		obj_agent.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_AGENT_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);		
		obj_agentdashboard=new AgentDashboardPage(driver); 
        obj_agentdashboard.clickVisa();
	    String expectedUrl =AutomationConstants.PHPTRAVELS_VISA;
	    String actualUrl =driver.getCurrentUrl();
	    Assert.assertEquals(expectedUrl,actualUrl);
	    	
	}
	
		
		@Test(priority=17)
	    public void verifyBlog() throws IOException {
			obj_agent= new AgentLoginPage(driver);
			String email = excelUtility.getCellData(7, 0);
			String password = excelUtility.getCellData(7, 1);
			obj_agent.setEmail(email);
			obj_agent.setPassword(password);
			obj_agent.clickSigninButton();		
			String expectedURL = AutomationConstants.PHPTRAVELS_AGENT_DASHBOARD_URL;
			String actualURL = driver.getCurrentUrl();
			Assert.assertEquals(expectedURL, actualURL);		
			obj_agentdashboard=new AgentDashboardPage(driver); 
	        obj_agentdashboard.clickBlog();
		    String expectedUrl =AutomationConstants.PHPTRAVELS_BLOG;
		    String actualUrl =driver.getCurrentUrl();
		    Assert.assertEquals(expectedUrl,actualUrl);
		   			
		}
		
		
		@Test(priority=18)
	    public void verifyOffers() throws IOException {
			obj_agent= new AgentLoginPage(driver);
			String email = excelUtility.getCellData(7, 0);
			String password = excelUtility.getCellData(7, 1);
			obj_agent.setEmail(email);
			obj_agent.setPassword(password);
			obj_agent.clickSigninButton();		
			String expectedURL = AutomationConstants.PHPTRAVELS_AGENT_DASHBOARD_URL;
			String actualURL = driver.getCurrentUrl();
			Assert.assertEquals(expectedURL, actualURL);		
			obj_agentdashboard=new AgentDashboardPage(driver); 
	        obj_agentdashboard.clickOffers();
		    String expectedUrl =AutomationConstants.PHPTRAVELS_OFFERS;
		    String actualUrl =driver.getCurrentUrl();
		    Assert.assertEquals(expectedUrl,actualUrl);
		    
		}
		
		
	@Test(priority=9)
	    public void verifyHotel() throws IOException, InterruptedException {
		obj_agent= new AgentLoginPage(driver);
		String email = excelUtility.getCellData(7, 0);
		String password = excelUtility.getCellData(7, 1);
		obj_agent.setEmail(email);
		obj_agent.setPassword(password);
		obj_agent.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_AGENT_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);		
		
		obj_agentdashboard=new AgentDashboardPage(driver);  	    
	    obj_agentdashboard.clickHotel();	
	    Thread.sleep(3000);
	    String expectedUrl =AutomationConstants.PHPTRAVELS_HOTELSELECTED;
	    String actualUrl =driver.getCurrentUrl();
	    Assert.assertEquals(expectedUrl,actualUrl);	       
		
		}

	
	@Test(priority=19)
    public void verifyCurrency() throws IOException {
		obj_agent= new AgentLoginPage(driver);
		String email = excelUtility.getCellData(7, 0);
		String password = excelUtility.getCellData(7, 1);
		obj_agent.setEmail(email);
		obj_agent.setPassword(password);
		obj_agent.clickSigninButton();		
		String expectedURL = AutomationConstants.PHPTRAVELS_AGENT_DASHBOARD_URL;
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);		
		obj_agentdashboard=new AgentDashboardPage(driver);     
		obj_agentdashboard.Currencybtn();
    
    }

}
