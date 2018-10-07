package basics;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChangeDimension {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		int width=120;
		int height=340;
		Dimension dim=new Dimension(width, height);
		driver.manage().window().setSize(dim);
		Thread.sleep(2000);
		Point point=new Point(width, height);
		driver.manage().window().setPosition(point);
		Thread.sleep(2000);
		driver.close();
	}
}