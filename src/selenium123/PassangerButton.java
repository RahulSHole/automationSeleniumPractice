package selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassangerButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement passanger=driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		
		passanger.click();
		
		WebElement adultplus=driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
		
		Thread.sleep(1000);
		
		for(int i=0; i<=8; i++)
		{
			adultplus.click();
			Thread.sleep(1000);
		}
		
	}

}