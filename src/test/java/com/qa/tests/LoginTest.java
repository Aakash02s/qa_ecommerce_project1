package com.qa.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		
		System.out.println("title of website is"+title);
		System.out.println("url of page is"+url);
		
		
		
		
		Thread.sleep(3000);
		
		driver.quit();
	

	}

}
