package cssSelect;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TagAndID {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Coursecube/Desktop/Locators.html");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#a1")).sendKeys("fdhgafsdgf");
		Thread.sleep(2000);
		driver.close();
	}
}