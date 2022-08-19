package com.fb.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.Pages.HomePage;
import com.fb.qa.Pages.LoginPage;
import com.fb.qa.Pages.SignUpPage;
import com.fb.qa.base.TestBase;

public class SignUpPageTest extends TestBase {

	
	LoginPage loginPage;
	SignUpPage signUpPage;
	HomePage homePage;
	public SignUpPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		signUpPage = new SignUpPage();
		homePage = new HomePage();
		
	}
	

	@Test(priority=1)
	public void createNewAccountTest() {
		signUpPage.createNewAccount().signup(prop.getProperty("firstName"), 
				prop.getProperty("lastName"), prop.getProperty("emailAddress"),
				prop.getProperty("remailAddress"), prop.getProperty("newpassword"), 
				prop.getProperty("day"), prop.getProperty("month"), prop.getProperty("year"),
				prop.getProperty("Gender"));
	}
	

	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}


}
