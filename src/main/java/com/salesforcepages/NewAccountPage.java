package com.salesforcepages;

import org.openqa.selenium.By;

import com.salesforce.base.ProjectSpecificMethods;

public class NewAccountPage extends ProjectSpecificMethods{

	public NewAccountPage enterAccountName() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='slds-input'][@name='Name']")).sendKeys("Jenita Account");
		return this;
	}

	public ViewAccountPage clickSave() {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		return new ViewAccountPage();
	}

}