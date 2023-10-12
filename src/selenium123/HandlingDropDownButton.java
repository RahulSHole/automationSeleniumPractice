package selenium123;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HandlingDropDownButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement dropdownbutton=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		//   dropdownbutton.click();
		
		Select s= new Select(dropdownbutton);
		
		s.selectByIndex(1);
		
		Thread.sleep(2000);
		
		s.selectByVisibleText("Option2");
		
	       Thread.sleep(2000);
	       
	    s.selectByValue("option3");
	    
	       Thread.sleep(2000);
	       
	       List<WebElement> l=s.getOptions();
	       
	       for(int i=0; i<l.size(); i++)
	       {
	    	      System.out.println(l.get(i).getText());
	    	       Thread.sleep(1000);
	       }	
	}

}
