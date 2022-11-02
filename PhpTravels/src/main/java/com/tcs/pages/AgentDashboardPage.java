package com.tcs.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgentDashboardPage {

	WebDriver driver;
			
		@FindBy(xpath="/html/body/div[4]/div/div[3]/ul/li[4]/a")
		private  WebElement myprofile;
		
		@FindBy(xpath="/html/body/div[4]/div/div[3]/ul/li[3]/a")
		private  WebElement addfunds;
		
		@FindBy(xpath="//*[@id=\"fadein\"]/div[4]/div/div[3]/ul/li[2]/a")
		private  WebElement bookings;
		
		@FindBy(xpath="/html/body/div[4]/div/div[3]/ul/li[5]/a")
		private  WebElement logout;
		
		@FindBy(xpath="/html/body/header/div/div/div/div/div/div[2]/div/div[1]/nav/ul/li[2]/a")
		private  WebElement flights;
		
		@FindBy(xpath="/html/body/header/div/div/div/div/div/div[2]/div/div[1]/nav/ul/li[3]/a")
		private  WebElement tours;
				
		@FindBy(xpath="/html/body/header/div/div/div/div/div/div[2]/div/div[1]/nav/ul/li[5]/a")
		private  WebElement visa;
				
		@FindBy(xpath="/html/body/header/div/div/div/div/div/div[2]/div/div[1]/nav/ul/li[6]/a")
		private  WebElement blog ;

		@FindBy(xpath="/html/body/header/div/div/div/div/div/div[2]/div/div[1]/nav/ul/li[7]/a")
		private  WebElement offers;
		

		@FindBy(xpath="/html/body/header/div/div/div/div/div/div[2]/div/div[1]/nav/ul/li[1]/a")
		private  WebElement hotel;
		
		@FindBy(xpath="/html/body/section[1]/section/div/div/form/div/div/div[1]/div/div/div/span/span[1]/span/span[1]")
		private  WebElement city;
		
		@FindBy(xpath="/html/body/span/span/span[1]/input")
		private  WebElement citynamesearchbox;
				
		@FindBy(id="submit")
		private WebElement searchbutton;
			
		@FindBy(id="currency")
		private  WebElement currency;
		
			    
		@FindBy(xpath="/html/body/header/div/div/div/div/div/div[2]/div/div[2]/div[2]/div/ul/li[7]/a")
		private  WebElement Inr;


	public AgentDashboardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public  void clickMyBookings()
	{
		bookings.click();
	}


	public  void clickAddFund()
	{
		addfunds.click();
	}


	public  void clickMyprofile()
	{
		myprofile.click();
	}

	public  void clickLogout()
	{
		logout.click();
	}


	public  void clickFlights()
	{
		flights.click();
	}


	public  void clickVisa()
	{
		visa.click();
	}

	public  void clickBlog()
	{
		blog.click();
	}
	public  void clickTour()
	{
		tours.click();
	}
	public  void clickOffers()
	{
		offers.click();
	}

	public  void clickHotel() throws InterruptedException
	{
		hotel.click();
		city.click();
		citynamesearchbox.sendKeys("Dubai");
		Thread.sleep(8000);
		citynamesearchbox.sendKeys(Keys.ENTER);
		searchbutton.click();		
	}

	public void Currencybtn()
	{
		currency.click();
		Inr.click();

	}
			
	
}
