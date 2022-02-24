package com.upstox.POMClasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
   private WebDriver driver;
   
   @FindBy(xpath="//input[@id='userCode']")
   private WebElement userID;
   
   @FindBy(xpath="//input[@id='password']")
   private WebElement password;
   
   @FindBy(xpath="//button[@id='submit-btn']")
   private WebElement login;
   
   public LoginPage(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	 
   }
    
   public void sendUserID()
   {
	   userID.sendKeys("HT1144");
   }
   
   public void sendPassword()
   {
	   password.sendKeys("Rudra@2021");
   }
   
   public void clicklogin()
   {
	   login.click();
   }
}

