 package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class WebElementClass {

	WebDriver driver;

	@Test
	public void WebElementComand() throws InterruptedException {

		driver.get("https://nichethyself.com/tourism/home.html");

		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("stc123");
		user.clear(); // clear the text input
		Thread.sleep(2000);
		user.sendKeys("stc123");
		System.out.println("User field visible?" + user.isDisplayed()); // Check whether elemet is visible= boolen
		System.out.println("User field visible?" + user.isEnabled()); // user.isEnabled(); // check wether element is
																		// accessible.
		user.getText(); // Input element threre is no visible text
		WebElement custom = driver.findElement(By.xpath("//a[@href='customised.html']"));
		System.out.println("Visible text is - " + custom.getText());

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345");
		System.out.println("Typed Password typed is - " + password.getAttribute("value"));
		System.out.println("Typed Password Tag is - " + password.getTagName());
		System.out.println(custom.getAttribute("target"));
		WebElement submitButton = driver.findElement(By.xpath("//form[@name='loginform']/button"));
		WebElement submitButtonCSS = driver.findElement(By.cssSelector("form[name='loginform']>button"));
		submitButton.click();

		// user.submit();

	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\SeleniumTraining\\Test\\Resources\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
	}

}
