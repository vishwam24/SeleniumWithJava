package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class handlingMultipleElements {
	
	WebDriver driver;
  @Test
  public void handlingMultipleElement () {
	  
	  /*
	  1. Goto google.com
	  2. Get all the link elements on the page.
	  3. For each link element print the following on the console
	  VisibleText - URL to which link is pointing to.
	  Gmail - https://mail.google.com/mail/&ogbl
	  Images - https://www.google.co.in/imghp?hl=en&og	  
	  */
	  
	  driver.get("http://www.google.com");
	  List<WebElement> allGoogleLinks = driver.findElements(By.tagName("a"));
	  
	  for ( WebElement oneLink: allGoogleLinks) {
		  System.out.println(oneLink.getText() + " - " + oneLink.getAttribute("href"));
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\SeleniumTraining\\Test\\Resources\\chromedriver.exe");
		
		 driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
