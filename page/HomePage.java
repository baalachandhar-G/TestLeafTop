package com.testleaf.page;

import org.openqa.selenium.By;

import com.testleaf.base.ProjectSepecifiMethod;

public class HomePage extends ProjectSepecifiMethod{

	
	public MyHomePage ClickCRMSFA( ){
		
		return new MyHomePage();
	}
	
	public LoginPage clickLogut() {
		
		Driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage();
		
	}
	
	public HomePage Verifyloginsuccess() {
		
		return this;
	}
}
