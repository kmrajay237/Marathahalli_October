package basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyTitleAndUrl {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		String expTitle = "Facebook – log in or sign up";
		String actTitle = driver.getTitle();
		if (expTitle.equals(actTitle)) {
			System.out.println("Title is Matching::Test Pass");
		} else {
			System.out.println("Title is not Matching::Test Fail");
		}
		String expUrl="https://www.facebook.com/";
		String actUrl = driver.getCurrentUrl();
		if (expUrl.equals(actUrl)) {
			System.out.println("URL is Matching::Test Pass");
		} else {
			System.out.println("URL is not Matching::Test Fail");
		}
		driver.close();
	}
}
