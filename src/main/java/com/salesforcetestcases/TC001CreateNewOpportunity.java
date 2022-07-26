package com.salesforcetestcases;

import org.testng.annotations.Test;

import com.salesforce.base.ProjectSpecificMethods;
import com.salesforcepages.LoginPage;

public class TC001CreateNewOpportunity extends ProjectSpecificMethods {

	@Test
	public void runCreateNewOpportunity() throws InterruptedException{
		new LoginPage().enterUsername().enterPassword().clickLogin()
		.verifySetupHomePg().clickAppLauncher()
		.clickViewAll()
		.switchToNewWindow()
		.clickSales()
		.GotoParentWin()
		.verifyHomePage()
		.clickOpportunities()
		.verifyOppPage()
		.clickNew()
		.enterOpporName()
		.enterCloseDate()
		.clickStage().selectStage()
		.clickSave()
		.verifyOppPage();
	}

}
