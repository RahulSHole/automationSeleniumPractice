package selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathandcss {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=NeXbmEnpSz0");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement start=driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']"));
		
		start.click();
		
		Thread.sleep(5000);
		
		WebElement full=driver.findElement(By.cssSelector("button[class='ytp-fullscreen-button ytp-button']"));
		
		full.click();
		
		Thread.sleep(8000);
		
		driver.close();
	}
	

}
