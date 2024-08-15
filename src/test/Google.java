package test;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		
		Google g = new Google();
		
		System.setProperty("webdrier.chrome.driver", "C:\\Users\\kamra\\Selenium\\Selenium-01");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

	}
	


}
