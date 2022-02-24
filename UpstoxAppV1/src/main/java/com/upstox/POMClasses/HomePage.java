package com.upstox.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	private WebDriver driver;

	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")   
	private WebElement settingButton;

	@FindBy(xpath="//div[@id='logout']")
	private WebElement logoutButton;
	
	
public HomePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void clicksettingButton() 
	{
	settingButton.click();
	}
public void clicklogoutButton()
{
	logoutButton.click();
}
}
