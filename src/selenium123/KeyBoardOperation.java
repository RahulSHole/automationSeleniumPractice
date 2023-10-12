package selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardOperation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement user=driver.findElement(By.name("username"));
		
		user.sendKeys("Admin");
		
		Thread.sleep(2000);
		
		user.sendKeys(Keys.CONTROL+"a");   //to select entire text
		
		Thread.sleep(2000);
		
		user.sendKeys(Keys.CONTROL+"c");        //to copy all the text
		
		Thread.sleep(2000);
		
		user.sendKeys(Keys.TAB);              // tab
		
		Thread.sleep(2000);
		
		WebElement pwd=driver.findElement(By.name("password"));
		
		pwd.sendKeys(Keys.CONTROL+"v");
		
		pwd.sendKeys(Keys.CONTROL.BACK_SPACE);
		
		pwd.sendKeys(Keys.CONTROL.BACK_SPACE);
		
		pwd.sendKeys(Keys.CONTROL.BACK_SPACE);
		
		pwd.sendKeys(Keys.CONTROL.BACK_SPACE);
		
		pwd.sendKeys(Keys.CONTROL.BACK_SPACE);
		
		Thread.sleep(2000);
		
		pwd.sendKeys("admin123");
		
		Thread.sleep(2000);
		
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		
		login.click();
		
		
		
		
		
		
		
	}

}
