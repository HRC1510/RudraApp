package com.upstox.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02VerifyLogoutFunctionality extends BaseClass
{

	@Test
	public void VerifyLogoutFunction()
	{
	String actualTitle= "Upstox login";
	String expectedTitle=driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	System.out.println("Logout successfully");
}
}
