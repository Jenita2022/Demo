package com.salesforcepages;

import org.openqa.selenium.By;

import com.salesforce.base.ProjectSpecificMethods;

public class SetupHomePage extends ProjectSpecificMethods{

	public SetupHomePage verifySetupHomePg() {
		System.out.println("Title: "+driver.getTitle());
		return this;
	}
	public SearchAppsPage clickAppLauncher() {
		driver.findElement(By.className("slds-icon-waffle")).click();
		return new SearchAppsPage();
	}

}
