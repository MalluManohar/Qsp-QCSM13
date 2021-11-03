package com.demoTestCases;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo {
@Test

public void sample () {
System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
new ChromeDriver();
}
}
