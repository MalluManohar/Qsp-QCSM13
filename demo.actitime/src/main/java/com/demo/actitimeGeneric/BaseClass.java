package com.demo.actitimeGeneric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.internal.PropertyUtils;

import demo.actitime.POM.HomePage;
import demo.actitime.POM.LoginPage;

public class BaseClass {
WebDriver driver = null;



@BeforeSuite
public void configBS() {
	//database connection
}

@BeforeTest
public void configBT() {
	//parallel testing codes
}


PropertyUtils1 putils = new PropertyUtils1();
@BeforeClass
public void configBC() {
	
// open the browser
	String browserName = putils.getPropertyData(IPathConstant.PROFILE_PATH,"browser");
	String url = putils.getPropertyData(IPathConstant.PROFILE_PATH,"url");
	if(browserName.equals("chrome")) {
		System.setProperty(IPathConstant.CHROME_KEY,IPathConstant.CHROME_PATH);
		driver = new ChromeDriver();
	} else if(browserName.equals("firefox")) {
		System.setProperty(IPathConstant.FIREFOX_KEY,IPathConstant.FIREFOX_PATH);
		driver = new FirefoxDriver();
	} else {
		throw new SessionNotCreatedException("browser is not supported");
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(IPathConstant.IMP_TIME, TimeUnit.SECONDS);
	driver.get(url);
}

@BeforeMethod
public void ConfigBM() {
	
	LoginPage loginpage = new LoginPage(driver);
	String username = putils.getPropertyData(IPathConstant.PROFILE_PATH,"username");
    String password = putils.getPropertyData(IPathConstant.PROFILE_PATH,"password");
    System.out.println(username);
    System.out.println(password);
    
    loginpage.login();
    
}
@AfterMethod
public void configAM() {
	HomePage homepage = new HomePage(driver);
	homepage.clickLogout();
}
@AfterClass
public void configAC() {
	//close the browser
	driver.quit();
}
@AfterTest
public void configAT() {
	//close all the parallel connection
}
@AfterSuite
public void configAS() {
	//close database connection
}
}
