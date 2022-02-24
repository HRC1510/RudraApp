package com.upstox.TestClasses;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01VerifyLoginFunctionality extends BaseClass
{
	@Test
	public void VerifyLogin()
	{
	String actualTitle= "Upstox login";
	String expectedTitle=driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
}
}
