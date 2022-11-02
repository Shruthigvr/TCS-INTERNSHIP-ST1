package com.tcs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerDashboardPage {
	
WebDriver driver;	
	
	@FindBy(xpath = "/html/body/div[4]/div/div[3]/ul/li[2]/a")
	private WebElement myBookingslink;
	
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[3]/ul[1]/li[3]/a[1]")
	private WebElement addFundslink;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[3]/ul/li[4]/a")
	private WebElement myprofilelink;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[3]/ul/li[5]/a")
	private WebElement logoutlink;
	
	@FindBy(xpath= "/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div/div[1]/div/div[2]/div/ul/label/label/label/div/div/div[1]/input")
	private WebElement paypalradiobutton;
	
	@FindBy(xpath = "/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div/div[2]/div/div/input")
	private WebElement paytextarea;
	
	@FindBy(xpath = "/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div/div[2]/div/button/i")
	private WebElement paynowbutton;
	
	@FindBy(xpath = "/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/div/table/tbody/tr[1]/td[4]/div/a")
	private WebElement viewvoucher;
	
	@FindBy(xpath = "/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[11]/td[3]/div/input")
	private WebElement address1;
	
	@FindBy(xpath = "/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[12]/td[3]/div/input")
	private WebElement address2;
	
	@FindBy(xpath = "/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button")
	private WebElement updateprofilebutton;
	
	public CustomerDashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickMybooking() {
		myBookingslink.click();
	}
	
	public void clickAddFunds() {
		addFundslink.click();
	}
	public void clickMyProfile() {
		myprofilelink.click();
	}
	
	public void clickLogout() {
		logoutlink.click();
	}
	
	public void paypal() {
		paypalradiobutton.click();
//		paytextarea.clear();
//		paytextarea.sendKeys("50");
		paynowbutton.click();
	}
	public void viewVoucher() {
		viewvoucher.click();
	}
	public void updateAddress1(String straddress1) {
		address1.clear();
		address1.sendKeys(straddress1);
		
	}
	
	public void updateAddress2(String straddress2) {
		
		address2.clear();
		address2.sendKeys(straddress2);
	}
	
	public void clickUpdateProfile() {
		updateprofilebutton.submit();
	}

}
