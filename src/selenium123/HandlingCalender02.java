package selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalender02 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement calender=driver.findElement(By.xpath(""));
		
		
	}

}
