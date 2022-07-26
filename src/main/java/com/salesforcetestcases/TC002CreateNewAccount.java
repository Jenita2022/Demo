package com.salesforcetestcases;

import org.testng.annotations.Test;

import com.salesforce.base.ProjectSpecificMethods;
import com.salesforcepages.LoginPage;

public class TC002CreateNewAccount extends ProjectSpecificMethods{

	@Test
	public void runCreateAccount() throws InterruptedException {
		new LoginPage().enterUsername().enterPassword().clickLogin()
		.verifySetupHomePg().clickAppLauncher()
		.clickViewAll()
		.switchToNewWindow()
		.clickSales()
		.GotoParentWin()
		.verifyHomePage()
		.clickAccounts()
		.verifyAcctPage()
		.clickNew()
		.enterAccountName()
		.clickSave()
		.verifyAcctPage();
	}
}
