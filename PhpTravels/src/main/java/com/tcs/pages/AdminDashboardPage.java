package com.tcs.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminDashboardPage {
	
WebDriver driver;	
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/nav/div/div/a[18]")
	private WebElement bookingslink;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/main/div/div[2]/div/div/div[2]/div/div[4]/span/a[3]")
	private WebElement pageselect;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/main/div/div[2]/div/div/div[2]/div/table/tbody/tr[2]/td[14]")
	private WebElement invoice;
	
	@FindBy(xpath = "/html/body/nav/div/div/ul/li[1]/a")
	private WebElement website;
	
	@FindBy(tagName = "table")
	private WebElement basetable;
	
	@FindBy(xpath = "//table[@class='table table-bordered table-hover mb-0 dataTable no-footer']//thead//tr[7]")
	private WebElement tablerow;
	
	@FindBy(xpath= "/html/body/div[2]/div[2]/main/div/div[2]/div/div/div[2]/div/table/tbody/tr[4]/td[11]/select")
	private WebElement bookingstatus;
	
	@FindBy(xpath= "/html/body/div[2]/div[2]/main/div/div[1]/div[2]/a/div/div/div/div[1]")
	private WebElement pending_count;
	
	@FindBy(xpath= "/html/body/div[2]/div[2]/main/div/div[1]/div[1]/a/div/div/div")
	private WebElement confirmed_count;
	
	@FindBy(xpath= "/html/body/div[2]/div[2]/main/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[15]")
	private WebElement delete;
	
	

	public AdminDashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickBookings() {
	
		bookingslink.click();
	}

	public void displayInvoice() throws InterruptedException  {
		Thread.sleep(2000);
		pageselect.click();
		Thread.sleep(2000);
		invoice.click();
	}
	
	public void websiteLink() throws InterruptedException  {
		website.click();
		Thread.sleep(2000);
	}
	
public void deleteRecord()  {
		
		delete.click();
	}
public void statusChange() throws InterruptedException  {
//	WebElement tablerow=basetable.findElement(By.xpath("//*[@id=\"data_wrapper\"]/table/tbody/tr[4]"));
//    String rowtext = tablerow.getText();
//	 System.out.println("Row text is : "+rowtext);
//	 
//	 WebElement cellIneed = tablerow.findElement(By.xpath("//*[@id=\"data_wrapper\"]/table/tbody/tr[4]/td[11]"));
//	 String celltext = cellIneed.getText();
//	 System.out.println("Cell text is : "+celltext);
	System.out.println("Initial PENDING COUNT : "+pending_count.getText());
	System.out.println("Initial CONFIRMATION COUNT : "+confirmed_count.getText());
	 Select drpbooking = new Select(bookingstatus);
		drpbooking.selectByIndex(1);
		Thread.sleep(3000);
		System.out.println("Current PENDING COUNT after changing status: "+pending_count.getText());
		System.out.println("Current CONFIRMATION COUNT after changing status : "+confirmed_count.getText());
		
	}
}
