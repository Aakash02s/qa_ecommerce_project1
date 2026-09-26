package com.qa.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

	
		
		WebDriver driver;
		
		@BeforeClass
		void setup() {
	
		driver=new ChromeDriver();	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		}
		
		@Test(priority=1)
		void title()
		{
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		
		System.out.println("title of website is"+title);
		System.out.println("url of page is"+url);
		
		if(title.equals("isOrangeHRM") ) {
			System.out.println("passed title");
			
		}
//		if(url.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
//			System.out.println("urls is passed");
//		}
		else {
			System.out.print("failed");
		}
		}
		@Test
		void login() {
		 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		 
		 
		 driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		}
		
		@Test
		void search() throws InterruptedException {
		 driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click();
		 Thread.sleep(3000);
		}
		
		@AfterClass
		void teardown() {
		
		driver.quit();
		}
	

	}


