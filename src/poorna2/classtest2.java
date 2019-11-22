package poorna2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class classtest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		//*System.out.println(driver.manage().window().getPosition());
		
		driver.navigate().to("http://www.facebook.com");
		//*System.out.println(driver.manage().getCookies());
System.out.println("before deleting the history" + driver.manage().getCookies());
System.out.println("after deleting the history" + driver.manage().getCookies());
	}

}
