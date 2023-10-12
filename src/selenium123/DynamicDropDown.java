package selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement from=driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']"));
		
		   from.click();
		   
		WebElement bhopal=driver.findElement(By.xpath("//a[@value='BHO']"));
		
		   bhopal.click();
		   
		   System.out.println(bhopal.getText());
		   
	   WebElement delhi=driver.findElement(By.xpath("(//a[@text='Delhi (DEL)'])[1]"));
	   
	       delhi.click();
	       
	       System.out.println(delhi.getText());
		

	}

}
