package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class MyFirstTestNGTest {
	
	WebDriver driver;
  @Test
  public void this_is_test_case() {
	  
	  driver.get("https://nichethyself.com/tourism/home.html");
			
		WebElement user= driver.findElement(By.name("username"));	
			user.sendKeys("stc123");
			
			driver.findElement(By.name("password")).sendKeys("12345");
			 //Above is called method chaining in java.
			
		//WebElement password =driver.findElement(By.name("password"));
		//	password.sendKeys("1234");
			
			user.submit();	
			
			//no test should end with out verification
			
			String expectedTitleAfterLogin = "My account";
			String actualTitleAfterLogin = driver.getTitle();
			
			
		
		assertEquals(actualTitleAfterLogin, expectedTitleAfterLogin);
		assertEquals(actualTitleAfterLogin, expectedTitleAfterLogin, "Login is not sucessfull");
  }
  
  @Test
  
  public void google_search_test() {
	  
	  driver.get("http://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("Learning Selenium");
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  }

  @AfterMethod
  public void afterMethod() {
	 
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\SeleniumTraining\\Test\\Resources\\chromedriver.exe"); 
	   driver = new ChromeDriver();
	  
	//  driver.get("https://nichethyself.com/tourism/home.html");
 
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  } 

}
