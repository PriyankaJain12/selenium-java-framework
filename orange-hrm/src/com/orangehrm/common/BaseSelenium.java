package com.orangehrm.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseSelenium {
	
	
	
	@BeforeMethod
	public void beforeEachTestExecution()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");  //Launch browser
	    WebDriverfactory.dr.manage().window().maximize();
		//dr.manage().window().setSize(new Dimension (640,360));
	    WebDriverfactory.dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");  //navigate orangehrm
		/*WebElement Username= WebDriverfactory.dr.findElement(By.id("txtUsername"));
		Username.sendKeys("admin"); 
		WebElement password= WebDriverfactory.dr.findElement(By.id("txtPassword"));
		password.sendKeys("admin"); 
		WebElement login= WebDriverfactory.dr.findElement(By.id("btnLogin"));
		login.click(); 
		WebElement Welcomescreen= WebDriverfactory.dr.findElement(By.id("welcome"));
		Assert.assertEquals("Welcome Admin",Welcomescreen.getText()); */
	}

	@AfterMethod
	public void afterEachTestExecution()
	{
		WebDriverfactory.dr.quit();
		
	}
}
