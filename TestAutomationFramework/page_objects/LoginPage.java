
public class LoginPage {
	
	WebDriver driver;
	//Adding more commenta
	
	By userName = By.name("username");
	By password = By.name("password");
	By title	= By.className ("formtitle");
	By login	 = By.name("btnLogin");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	//Set UserName
	public void enterUserName (String strUsername)
	{
		driver.findElement(userName).sendKeys(strUsername);
	}
	//Set password
	public void enterPassword (String strPassword)
	{
		driver.findElement(password).sendKeys(strPassword);
	}
	//Click on Login Button
	public void clickLogin()
	{
		driver.findElement(login).click();
	}
	//Get Page Title
	public String getTitle()
	{
		return    driver.findElement(title).getText();
	}
}


