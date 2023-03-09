package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class WebDriverComands {
	
	WebDriver driver;
  @Test
  public void WebDriverLearningCommands() throws InterruptedException {
	  
	  driver.get("https://nichethyself.com/tourism/home.html");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.navigate().to("http://www.google.com");
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(2000); 
	  driver.navigate().forward();
	  Thread.sleep(2000);
	  driver.navigate().refresh();
	  Thread.sleep(2000);
	  
	String currenturl =  driver.getCurrentUrl();
	System.out.println(currenturl);
	
	String pagesource= driver.getPageSource();
	System.out.println(pagesource);
	
	driver.manage().window().minimize();
	Thread.sleep(2000);
	driver.manage().window().fullscreen();
	Thread.sleep(2000);
	
	
	
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

}
