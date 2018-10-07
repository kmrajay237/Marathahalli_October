package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorTagName {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Coursecube/Desktop/TagName.html");
		//By by = By.tagName("input");
		//By by=By.tagName("button");
		By by=By.tagName("a");
		WebElement ele = driver.findElement(by);
		Thread.sleep(2000);
		//ele.sendKeys("Coursecube");
		ele.click();
		Thread.sleep(2000);
		driver.close();
	}

}
