package com.qa.test.pages;

import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver wd) {
		//my constructor  
		this.driver = wd;
	}

	public void myLogin() {
		
		System.out.println("hello login page");
	}
	
}
