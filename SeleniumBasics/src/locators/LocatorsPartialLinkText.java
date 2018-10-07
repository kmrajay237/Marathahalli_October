package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorsPartialLinkText {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Coursecube/Desktop/Locators.html");
		//By by = By.partialLinkText("MyInsta");
		//By by = By.partialLinkText("inLink");
		By by = By.partialLinkText("book");
		WebElement ele = driver.findElement(by);
		Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);
		driver.close();
	}
}
