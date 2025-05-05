

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonCaptureLinkSpecificArea {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();

		WebElement hearder = driver.findElement(By.id("nav-xshop"));

		List<WebElement>  hearderLinks = hearder.findElements(By.tagName("a"));
		System.out.println( "Total Capture Links Special Area :" + hearderLinks.size());
		for(int i=0; i<hearderLinks.size(); i++) {
			System.out.println(hearderLinks.get(i).getText());
		}
		driver.quit();
	}
}


