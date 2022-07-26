package com.salesforcepages;

import org.openqa.selenium.By;

import com.salesforce.base.ProjectSpecificMethods;

public class ViewOpportunityPage extends ProjectSpecificMethods{

	public ViewOpportunityPage verifyOppPage() {
		System.out.println("Page Title:" +driver.getTitle());
		return this;
	}
	public NewOpportunityPage clickNew() {
		driver.findElement(By.xpath("//div[@title='New']")).click();
		return new NewOpportunityPage();
	}
}
