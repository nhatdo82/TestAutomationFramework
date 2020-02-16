import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

	WebDriver driver;

    @FindBy(how= How.NAME, using="username")
    WebElement userName;

    @FindBy(how= How.NAME, using="password")
    WebElement password;    

    @FindBy(className="formtitle")
    WebElement title;

    @FindBy(how= How.NAME, using="btnLogin")
    WebElement login;

    public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
		//initialize web elements
		PageFactory.initElements(driver, this);
	}

    //Set UserName
  	public void enterUserName (String strUsername)
  	{
  		userName.sendKeys(strUsername);
  	}

  //Set password
  	public void enterPassword (String strPassword)
  	{
  		dpassword.sendKeys(strPassword);
  	}
  	//Click on Login Button
  	public void clickLogin()
  	{
  		login.click();
  	}
    //Get Page Title
  	public String getTitle()
  	{
  		return    dtitle.getText();
  	}
}

