package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\SeleniumTraining\\Test\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://nichethyself.com/tourism/home.html");
// Above Statement will opening the browser
		
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
		
		
	if(expectedTitleAfterLogin.equals(actualTitleAfterLogin)) {
		
		System.out.println("Login is sucessfull");
	}else {
System.out.println("Logi is failed");
}
	driver.quit();
}
}