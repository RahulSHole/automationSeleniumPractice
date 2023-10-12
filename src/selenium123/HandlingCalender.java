package selenium123;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalender {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement cal=driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		
		    cal.click();
		
		  Thread.sleep(1000);
		  
		  WebElement date=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[7]/a"));
		  
	//	  date.click();
		  
		  System.out.println(date.getText());
		  
		  date.click();
		  
	}

}
