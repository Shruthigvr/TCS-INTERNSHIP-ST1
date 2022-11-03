package com.tcs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupplierDashboardPage {
	
WebDriver driver;	
	
	@FindBy(xpath = "//*[contains(text(),'Sales overview & summary')]")
	private WebElement sales;
	
	@FindBy(xpath = "//*[contains(text(),'Revenue Breakdown 2022')]")
	private WebElement revenue;
	
	@FindBy(xpath="/html/body/header/div/div/div/div/div/div[2]/div/div[1]/nav/ul/li[2]/a")
	private  WebElement flights;
	
	@FindBy(xpath="/html/body/header/div/div/div/div/div/div[2]/div/div[1]/nav/ul/li[3]/a")
	private  WebElement tours;
			
	@FindBy(xpath="/html/body/header/div/div/div/div/div/div[2]/div/div[1]/nav/ul/li[5]/a")
	private  WebElement visa;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/nav/div/div/a[7]")
	private  WebElement bookings;
	

	

	public SupplierDashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void checkSalesoverview(){
		sales.isDisplayed();
	}

	public void checkRevenueBreakdown()  {
		revenue.isDisplayed();
	}
	
	public void clickBookingLink()  {
		bookings.click();
	}

}
