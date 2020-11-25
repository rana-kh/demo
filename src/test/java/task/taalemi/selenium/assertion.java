package task.taalemi.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assertion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.ta3limy.com/faq");
		java.util.List<WebElement> links = driver.findElements(By.tagName("i"));
		System.out.println(links.size());
		Assert.assertEquals(7, links.size());

	}
}


