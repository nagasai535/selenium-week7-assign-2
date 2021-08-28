package week7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Welcome  to Ebay...");
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.close();
		
		
		

	}

}
