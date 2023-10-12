package selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice123 {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement item1=driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee ui-selected']"));
		
		item1.click();
		
		
	}

}
