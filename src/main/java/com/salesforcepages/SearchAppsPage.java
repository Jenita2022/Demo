package com.salesforcepages;

import org.openqa.selenium.By;

import com.salesforce.base.ProjectSpecificMethods;

public class SearchAppsPage extends ProjectSpecificMethods{
	
	public NewWindow clickViewAll(){
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		return new NewWindow();
	}

}
