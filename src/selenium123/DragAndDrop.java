package selenium123;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.sql.Driver;

import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement source=driver.findElement(By.xpath("//div[@id='box4']"));
		
		Thread.sleep(2000);
		
		WebElement target=driver.findElement(By.xpath("//div[@id='box104']"));
		
		Thread.sleep(2000);
		
		Actions a=new Actions(driver);
		
		a.dragAndDrop(source, target).release().build().perform();
		
		WebElement source1=driver.findElement(By.xpath("//div[@id='box1']"));
		
		Thread.sleep(1000);
		
		WebElement target1=driver.findElement(By.xpath("//div[@id='box101']"));
		
		Thread.sleep(1000);
		
		a.clickAndHold(source1).moveToElement(target1).release().build().perform();
		
	WebElement source2=driver.findElement(By.xpath("//div[@id='box6']"));
		
		Thread.sleep(1000);
		
		WebElement target2=driver.findElement(By.xpath("//div[@id='box106']"));
		
		Thread.sleep(1000);
		
		a.clickAndHold(source2).moveToElement(target2).release().build().perform();
		
	WebElement source3=driver.findElement(By.xpath("//div[@id='box7']"));
		
		Thread.sleep(1000);
		
		WebElement target3=driver.findElement(By.xpath("//div[@id='box107']"));
		
		Thread.sleep(1000);
		
		a.clickAndHold(source3).moveToElement(target3).release().build().perform();
		
	WebElement source4=driver.findElement(By.xpath("//div[@id='box5']"));
		
		Thread.sleep(1000);
		
		WebElement target4=driver.findElement(By.xpath("//div[@id='box105']"));
		
		Thread.sleep(1000);
		
		a.clickAndHold(source4).moveToElement(target4).release().build().perform();
		
	WebElement source5=driver.findElement(By.xpath("//div[@id='box3']"));
		
		Thread.sleep(1000);
		
		WebElement target5=driver.findElement(By.xpath("//div[@id='box103']"));
		
		Thread.sleep(1000);
		
		a.clickAndHold(source5).moveToElement(target5).release().build().perform();
		
	WebElement source6=driver.findElement(By.xpath("//div[@id='box2']"));
		
		Thread.sleep(1000);
		
		WebElement target6=driver.findElement(By.xpath("//div[@id='box102']"));
		
		Thread.sleep(1000);
		
		a.clickAndHold(source6).moveToElement(target6).release().build().perform();
		
		
		
		
		
		
		
		
		
	}

}
