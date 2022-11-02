package com.tcs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgentLoginPage {
	WebDriver driver;	
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div[2]/div/form/div[3]/div/div/a")
	private WebElement signupbutton;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div[2]/div/form/div[2]/div[2]/div[1]/label")
	private WebElement remembermecheckbox;
	
	@FindBy(name = "email")
	private WebElement email;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div[2]/div/form/div[3]/button")
	private WebElement signinButton;
	
	@FindBy(id = "languages")
	private WebElement languagedropdown;
	
	@FindBy(xpath = "//div//ul//li//a[contains(text(),' English')]")
	private WebElement english;
	
	@FindBy(xpath = "/html/body/header/div/div/div/div/div/div[2]/div/div[2]/div[3]/div/button/i")
	private WebElement account;
	
	public void clickSignupbutton() {
		signupbutton.click();
	}
	
	public void clickRememberMeCheckbox() {
		if(!remembermecheckbox.isSelected()) {
			remembermecheckbox.click();
		}
	}
	
	@FindBy(xpath = "/html/body/header/div/div/div/div/div/div[2]/div/div[2]/div[3]/div/ul/li[1]/a")
	private WebElement customerloginbutton;
	
	
	
	public AgentLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setEmail(String strEmail) {
		email.sendKeys(strEmail);
	}
	
	
	public void setPassword(String strPassword) {
		password.sendKeys(strPassword);
	}
	

	public void clickSigninButton() {
		signinButton.submit();
	}
	
	public void selectLoginPage() {
		account.click();
		customerloginbutton.click();
		
	}
	
	public void languageSelect()
	{
		languagedropdown.click();
		english.click();
		
		
	}

}
