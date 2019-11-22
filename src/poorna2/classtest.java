package poorna2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class classtest {

		public static void main(String[] args) {
			{
				
				WebDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("http://www.google.com");
				String name =driver.getTitle();
				System.out.println(name);
				driver.navigate().to("http://www.facebook.com");
				System.out.println(driver.getCurrentUrl());
				driver.navigate().back();
				driver.navigate().refresh();
				driver.navigate().forward();
				System.out.println(driver.getPageSource());
                
			}
	}

}
