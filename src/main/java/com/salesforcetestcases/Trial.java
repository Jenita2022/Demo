package com.salesforcetestcases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.cli.Main;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Trial {
	
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("India$321");
	driver.findElement(By.id("Login")).click();
	
	driver.findElement(By.className("slds-icon-waffle")).click();
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	
	Set<String> set1 = driver.getWindowHandles();
	List<String> lst1 = new ArrayList<String>(set1);
	driver.switchTo().window(lst1.get(0));
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	
	WebElement oppoTab = driver.findElement(By.xpath("//span[text()='Opportunities']"));
	driver.executeScript("arguments[0].click();",oppoTab);
	driver.findElement(By.xpath("//div[@title='New']")).click();
	
	driver.switchTo().window(lst1.get(0));
	WebElement name = driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow']/input[@name='Name']"));
	name.sendKeys("SalesForce Automation PP");
		
	driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon_right']/input[@name='CloseDate']")).sendKeys("07/03/2022");
	driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']/span")).click();
	driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Needs Analysis']")).click();
	driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand'][text()='Save']")).click();
	
	String parent = driver.getWindowHandle();
	driver.switchTo().window(parent);
	Thread.sleep(2000);
	String title = driver.getTitle();
	System.out.println(title);
	
	Thread.sleep(2000);
	if (title.contains("SalesForce Automation PP")){
		System.out.println("New Opportunity is created succesfully.");
	}
	else
		System.out.println("New Opportunity is NOT created.");
	//driver.findElement(By.xpath("//lightning-formatted-text[text()='SalesForce Automation PP']"));
	
	driver.quit();
	
	
	
	
	
}
	
}


