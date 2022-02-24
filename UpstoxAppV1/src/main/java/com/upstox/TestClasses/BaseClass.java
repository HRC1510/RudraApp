package com.upstox.TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.upstox.POMClasses.HomePage;
import com.upstox.POMClasses.LoginPage;

public class BaseClass 
{
     WebDriver driver;
     LoginPage login;
     HomePage logout;
     
     @BeforeClass
	   public void SetUpMethod() 
	   {
		    System.setProperty("webdriver.chrome.driver", "D:\\Velocity Notes\\Velocity 13th Nov Batch\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://login-v2.upstox.com/?client_id=PW3-6Agd37PB52Q6B6DDpYWLuT7b&platform_id=PW3&redirect_path=%2F&redirect_uri=https%3A%2F%2Fpro.upstox.com");
			System.out.println("URL is opened");
			driver.getTitle();
			System.out.println("Title of Login page is " +driver.getTitle());
	   }
     @BeforeMethod
 	public void loginMethod() throws InterruptedException 
 	{
 		    login=new LoginPage(driver);
 			login.sendUserID();
 			login.sendPassword();
 			login.clicklogin();
 			Thread.sleep(5000);
 	   }
     @AfterMethod
 	public void logoutMethod()
 	{
 		   logout= new HomePage(driver);
 		   logout.clicksettingButton();
 		   logout.clicklogoutButton();
 	}
     
     @AfterClass
  	public void tearDown()
  	{
  		driver.quit();
  	}
 }

