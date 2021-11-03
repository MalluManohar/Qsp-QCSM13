package demo.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//a[@id='logoutLink']")
private WebElement logout;


public void clickLogout() {
	logout.click();
}


}
