package com.tcs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupplierLoginPage {
WebDriver driver;	
	
	@FindBy(xpath = "/html/body/div/div[1]/main/div/div/div/div[1]/div/form/div[3]/div/label")
	private WebElement remembermecheckbox;
	
	@FindBy(name = "email")
	private WebElement email;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(xpath = "/html/body/div/div[1]/main/div/div/div/div[1]/div/form/div[4]/button/span[1]")
	private WebElement loginButton;
	
	@FindBy(id = "languages")
	private WebElement languagedropdown;
	
	@FindBy(xpath = "//div//ul//li//a[contains(text(),' English')]")
	private WebElement english;
	
	@FindBy(xpath = "/html/body/header/div/div/div/div/div/div[2]/div/div[2]/div[3]/div/button/i")
	private WebElement account;
	
	
	
	public SupplierLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
		
	public void clickRememberMeCheckbox() {
		if(!remembermecheckbox.isSelected()) {
			remembermecheckbox.click();
		}
	}
		
	public void setEmail(String strEmail) {
		email.sendKeys(strEmail);
	}
	
	
	public void setPassword(String strPassword) {
		password.sendKeys(strPassword);
	}
	

	public void clickSigninButton() {
		loginButton.submit();
	}
	
	

}
