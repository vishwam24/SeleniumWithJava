package scripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\SeleniumTraining\\Test\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
	WebElement english = driver.findElement(By.id("js-link-box-en"));
		
		english.click();
		
 WebElement search=driver.findElement(By.name("search"));
 search.sendKeys("Selenium");
 
search.submit();


String excpectedTitleafterSearch= "https://en.wikipedia.org/wiki/Selenium";
String actualTitleafterSearch= driver.getCurrentUrl();

assertEquals(excpectedTitleafterSearch,actualTitleafterSearch, "error in title");

driver.quit();

	}

}
