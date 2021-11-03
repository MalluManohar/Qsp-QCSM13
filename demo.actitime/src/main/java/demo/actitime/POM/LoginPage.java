package demo.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(name="pwd")
	private WebElement passwordTextField;
	
	
	@FindBy(xpath="//div[text( )='Login ']")
	private WebElement loginButton ;

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}


	public void setUsernameTextField(WebElement usernameTextField) {
		this.usernameTextField = usernameTextField;
	}


	public WebElement getPasswordtextField() {
		return passwordTextField;
	}


	public void setPasswordtextField(WebElement passwordtextField) {
		this.passwordTextField = passwordtextField;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	public void login()	{
		usernameTextField.sendKeys("admin");
		passwordTextField.sendKeys("manager");
	}
	}
	


