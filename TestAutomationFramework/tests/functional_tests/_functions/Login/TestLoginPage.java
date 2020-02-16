import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

public class TestLoginPage {
   
  WebDriver driver;
  LoginPage objLogin;
  
  @Test(dataProvider = "LoginData")
  public void verifySuccessLogin (String userName, String passWord) {
	  objLogin.enterUserName(userName);
	  objLogin.enterPassword(passWord);
	  objLogin.clickLogin();
	  Assert.assertTrue(objLogin.getTitle().contains("Login Successfully"));
  }

  @DataProvider
  public Object[][] LoginData() {
    return new Object[][] {
      new Object[] { "admin", "admin" },
      new Object[] { "test", "test" },
      new Object[] { "joe", "joe" },
    };
  }
  @BeforeTest
  public void setupTest() 
  {
	  System.setProperty("webdriver.gecko.driver", driverPath);
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://meu-solutions.com/demo/apps/app001.com/v1/login");
	  objLogin = new LoginPage(driver);
  }
}

