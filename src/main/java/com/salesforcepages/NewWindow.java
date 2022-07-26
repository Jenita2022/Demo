package com.salesforcepages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.salesforce.base.ProjectSpecificMethods;

public class NewWindow extends ProjectSpecificMethods{

	public AppLauncherPage switchToNewWindow() {
		Set<String> set = driver.getWindowHandles();
		List<String> lst = new ArrayList<String>(set);
		driver.switchTo().window(lst.get(0));
		return new AppLauncherPage();
	}
	public HomePage GotoParentWin() {
		String parentWin = driver.getWindowHandle();
		driver.switchTo().window(parentWin);
		return new HomePage();

	}
}
