package com.testleaf.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSepecifiMethod {
	
	public ChromeDriver Driver;

	@BeforeMethod
	
	public void precondition() {
		
		WebDriverManager.chromedriver().setup();
		
		Driver= new ChromeDriver();
		
		Driver.get("http://leaftaps.com/opentaps/control/login");
		
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterMethod
	
	public void postcondition() {
		
		Driver.close();
		
	}

}
