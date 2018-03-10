package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\D964565\\java files\\chromedriver.exe");
		
		WebDriver   driver = new ChromeDriver();
		
		String url = "https://web2.0calc.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(8000);
		WebElement btn1 = river.findElement@id='Btn1']"));
				btn1.click();
		Thread.sleep(8000);
		driver.close();
		
	}

}
