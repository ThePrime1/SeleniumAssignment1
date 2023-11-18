package assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		String expectedUrl = "https://www.saucedemo.com/";
		String actualUrl = "https://www.saucedemo.com/";
		
		driver.get(actualUrl);
		
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("Url Matched!");
		}else {
			System.out.println("Url did not Match!");
		}
		
		
		assertEquals(expectedUrl, actualUrl);
		

	}

}
