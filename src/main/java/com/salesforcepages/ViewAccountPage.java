package com.salesforcepages;

import org.openqa.selenium.By;

import com.salesforce.base.ProjectSpecificMethods;

public class ViewAccountPage extends ProjectSpecificMethods{
	public ViewAccountPage verifyAcctPage() {
		System.out.println(driver.getTitle());
		return this;
	}
	public NewAccountPage clickNew() {
		driver.findElement(By.xpath("//div[@title='New']")).click();
		return new NewAccountPage();
	}
}
