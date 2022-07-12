package com.testleaf.page;

import org.openqa.selenium.By;

import com.testleaf.base.ProjectSepecifiMethod;

public class LoginPage extends ProjectSepecifiMethod {

	public LoginPage EnterUserName() {
		
		
	Driver.findElement(By.id("username")).sendKeys("DemoSalesManager");	
		
	return this;
		
	}
	
	public LoginPage EnterPassword() {
		
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		return this;
	}
	
	public HomePage Submit() {
		
		Driver.findElement(By.className("decorativeSubmit")).click();
		
		
		return new HomePage();
		
	}
}


