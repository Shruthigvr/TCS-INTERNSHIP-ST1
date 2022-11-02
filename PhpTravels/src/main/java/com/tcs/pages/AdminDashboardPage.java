package com.tcs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDashboardPage {
	
WebDriver driver;	
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/nav/div/div/a[18]")
	private WebElement bookingslink;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/main/div/div[2]/div/div/div[2]/div/div[4]/span/a[2]")
	private WebElement pageselect;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/main/div/div[2]/div/div/div[2]/div/table/tbody/tr[2]/td[14]/a")
	private WebElement invoice;
	
	@FindBy(xpath = "/html/body/nav/div/div/ul/li[1]/a")
	private WebElement website;
	
	

	public AdminDashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickBookings() {
		bookingslink.click();
	}

	public void displayInvoice()  {
		pageselect.click();
		invoice.click();
	}
	
	public void websiteLink()  {
		
		website.click();
	}
	
}
