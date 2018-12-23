package com.orangehrm.test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.common.BaseSelenium;
import com.orangehrm.common.WebDriverfactory;
import com.orangehrm.pages.LoginPage;

	public class LoginTestChrome extends BaseSelenium {
		@Test
		public void VerifyAdminLoginSuccessful()
		{
			LoginPage login =new LoginPage();
			login.Login();
					
			WebElement Welcomescreen= WebDriverfactory.dr.findElement(By.id("welcome"));
			//Assert.assertEquals("Welcome Admin",Welcomescreen.getText());
			
			 
			// chrome 70.0 ,chrome  driver required of 2.43 , selenium is 3.14	
		}
	}
		
		/*
		@Test
		public void VerifyESSLoginSuccessful()
		{
						WebElement Welcomescreen= dr.findElement(By.id("welcome"));
			Assert.assertEquals("Welcome Admin",Welcomescreen.getText());
		}
			
		@Test(enabled=false)
		public void VerifyESSmaxLoginSuccessful()
		{
						WebElement Welcomescreen= dr.findElement(By.id("welcome"));
			Assert.assertEquals("Welcome Admin",Welcomescreen.getText());
			
		}
		@Test
		public void VerifyESSminLoginSuccessful()
		{
						WebElement Welcomescreen= dr.findElement(By.id("welcome"));
			Assert.assertEquals("Welcome Admin",Welcomescreen.getText());
		}


*/
	


