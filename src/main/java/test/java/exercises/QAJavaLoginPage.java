package test.java.exercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
Please, imaging that we have a login page with two input fields (username and password) and submit button.

  -Username and password fields are present
  -Button is present
  -If user is logged a message box is shown “Welcome to eID”
  -If credentials are not valid, a message box is shown “You shall not pass!”

  Goal 1: identify some tests to validate this login workflow
  Goal 2: write some test in the test class below ensuring following topics:
*/

public class QAJavaLoginPage {
  /*
    !!! Do not create your own WebDriver!!! Directly use the object webDriver

    You can copy credentials from here:
    - valid@username.com    password
    - unknown@username.com  password
  */

  String url = "https://exercise.com/login.html";
  WebDriver driver = new ChromeDriver();

  @FindBy(id = "user_email")
  WebElement username;

  @FindBy(id = "user_password")
  WebElement password;

  @FindBy(name = "commit")
  WebElement loginBtn;

  public QAJavaLoginPage() {
    this.url = "https://exercise.com/login.html";
  }

  public void startDriver() {
    this.driver = new ChromeDriver();
    PageFactory.initElements(driver, this);
  }

  public void killDriver() {
    driver.close();
  }

  // @Test
  public void successFullLogin() {
    startDriver();
    driver.get(url);
    driver.manage().window().maximize();

    // Validate fields displayed
    username.isDisplayed();
    password.isDisplayed();
    loginBtn.isDisplayed();

    // Login
    username.sendKeys("wji34975@mzico.com");
    password.sendKeys("password");
    loginBtn.click();

    // Validating successfull login
    driver.getPageSource().contains("Get started by logging your first workout!");
    killDriver();
  }

  public void failedFullLogin() {
    startDriver();
    this.driver.get(url);
    driver.manage().window().maximize();

    // Error login
    username.sendKeys("invalid@username.com");
    password.sendKeys("password");
    loginBtn.click();

    // Validating failed login
    driver.getPageSource().contains("Invalid Email or password.");
    killDriver();
  }
}
