package com.fb.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath = "//span[contains(text(),'Er Md Aamir Reza')]")
	WebElement profilePage;

	
	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	


	public ProfilePage clickOnprofilePage(){
	profilePage.click();
	return new ProfilePage();
	}

	
}
