package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://google.com");
		driver.getCurrentUrl();
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
	}

}
