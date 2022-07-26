package com.salesforcepages;

import org.openqa.selenium.By;
import com.salesforce.base.ProjectSpecificMethods;

public class NewOpportunityPage extends ProjectSpecificMethods {
	public NewOpportunityPage enterOpporName() {
		driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow']/input[@name='Name']")).sendKeys("SalesForce Automation PP");
		return this;
	}
	public NewOpportunityPage enterCloseDate() {
		driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon_right']/input[@name='CloseDate']")).sendKeys("07/03/2022");
		return this;
	}
	public NewOpportunityPage clickStage() {
		driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']/span")).click();
		return this;
	}
	public NewOpportunityPage selectStage() throws InterruptedException {
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Needs Analysis']")).click();
		return this;
	}
	public ViewOpportunityPage clickSave() {
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand'][text()='Save']")).click();
		return new ViewOpportunityPage(); 
	}
}
