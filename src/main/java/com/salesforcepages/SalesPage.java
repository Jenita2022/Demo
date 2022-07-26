package com.salesforcepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.salesforce.base.ProjectSpecificMethods;

public class SalesPage extends ProjectSpecificMethods{

//	public OpportunitiesPage clickOpportunities() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Opportunities")).click();
//		return new OpportunitiesPage();
//	}

	public SalesPage clickOpporArrow() {
		WebElement oppoArrow = driver.findElement(By.xpath("//lightning-icon[@class='slds-icon-utility-chevrondown slds-icon_container']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(oppoArrow).click().perform();
		return this;
	}
	
	public AppLauncherPage clickNewOppor() {
		WebElement newOpp = driver.findElement(By.xpath("//one-app-nav-bar-menu-item[@class='slds-dropdown__item']//span[@class='slds-truncate']/span"));
		Actions builder = new Actions(driver);
		builder.moveToElement(newOpp).click().perform();
		return new AppLauncherPage();
	}

	public SalesPage clickAccountsArrow() {
		WebElement accountsArrow = driver.findElement(By.xpath("(//lightning-icon[@class='slds-icon-utility-chevrondown slds-icon_container'])[5]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(accountsArrow).click().perform();
		return this;
	}
	public AppLauncherPage clickNewAccounts() {
		WebElement newAccounts = driver.findElement(By.xpath("(//one-app-nav-bar-menu-item[@class='slds-dropdown__item']//span[@class='slds-truncate']/span)[2]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(newAccounts).click().perform();
		return new AppLauncherPage();
	}
	
}