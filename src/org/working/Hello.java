package org.working;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Java\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
driver.get("https://greenstech.in/selenium-course-content.html");
	}
	
	

}
