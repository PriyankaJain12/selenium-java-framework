package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.common.WebDriverfactory;

public class LoginPage {
	
	@FindBy(id="txtUsername") WebElement elmUserName;
	@FindBy(id="txtPassword") WebElement elmPassword;
	@FindBy(id="btnLogin") WebElement loginbutton;
	

	public LoginPage() {
	PageFactory.initElements(WebDriverfactory.dr,this);
	}
	
	public void Login()
	{
		elmUserName.sendKeys("admin");
		elmPassword.sendKeys("admin");
		loginbutton.click();
	}
	
	
}
