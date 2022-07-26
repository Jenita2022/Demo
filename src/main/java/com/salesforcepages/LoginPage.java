package com.salesforcepages;

import org.openqa.selenium.By;

import com.salesforce.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public  LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		return this;
	}
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("India$321");
		return this;
	}
	public SetupHomePage clickLogin() {
		driver.findElement(By.id("Login")).click();
		return new SetupHomePage();
	}

}
