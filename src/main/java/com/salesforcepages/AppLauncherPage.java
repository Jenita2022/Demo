package com.salesforcepages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import com.salesforce.base.ProjectSpecificMethods;

public class AppLauncherPage extends ProjectSpecificMethods{
	
	public NewOpportunityPage switchToNewWindow() {
		Set<String> set = driver.getWindowHandles();
		System.out.println(set.size());
		List<String> lst = new ArrayList<String>(set);
		driver.switchTo().window(lst.get(0));
		return new NewOpportunityPage();
	}
//		String parentWin = driver.getWindowHandle();
//	public SalesPage GotoParentWin() {
//		driver.switchTo().window(parentWin);
//		return new SalesPage();
//	}
	
	public NewAccountPage switchToNewAcctWindow() {
		Set<String> set1 = driver.getWindowHandles();
		System.out.println(set1.size());
		List<String> lst1 = new ArrayList<String>(set1);
		driver.switchTo().window(lst1.get(0));
		return new NewAccountPage();
	}
	
	public NewWindow clickSales() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(2000);
		return new NewWindow();
	}
	}