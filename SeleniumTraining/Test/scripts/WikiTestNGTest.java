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

public class WikiTestNGTest {
	
	WebDriver driver;
	
  @Test
  public void WikiTest() {
	  driver.get("https://www.wikipedia.org/");
		
		WebElement english = driver.findElement(By.id("js-link-box-en"));
			
			english.click();
			
	 WebElement search=driver.findElement(By.name("search"));
	 search.sendKeys("Selenium");
	 
	search.submit();

	String excpectedTitleafterSearch= "Selenium - Wikipedia";
	String actualTitleafterSearch= driver.getTitle();

	assertEquals(excpectedTitleafterSearch,actualTitleafterSearch, "error in title");

  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\SeleniumTraining\\Test\\Resources\\chromedriver.exe");
		
		  driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

  /*@BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }*/

}
