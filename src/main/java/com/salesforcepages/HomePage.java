package com.salesforcepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.salesforce.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{

	public HomePage verifyHomePage() {
		String title = driver.getTitle();
		if(title.equals("Home | Salesforce")) {
			System.out.println("Home Page is in Focus");
			}
		return this;
	}
	
	public ViewOpportunityPage clickOpportunities() {
		WebElement oppoTab = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();",oppoTab);
		return new ViewOpportunityPage();
	}
	
	public ViewAccountPage clickAccounts() throws InterruptedException {
		WebElement accountsTab = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();",accountsTab);
		Thread.sleep(1000);
		return new ViewAccountPage();
	}
}
