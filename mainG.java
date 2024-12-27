package googleF;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mainG {
	
	public WebDriver driver ;
	@Test
	public void start() throws InterruptedException {
		driver= new ChromeDriver();
		Actions action=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com/");
		
		WebElement app= driver.findElement(By.xpath("//div[@class='gb_I gb_bd gb_Z']"));
		app.click();
		WebElement frame= driver.findElement(By.name("app"));
		driver.switchTo().frame(frame);
		
		WebElement map=driver.findElement(By.xpath("//span[text()='Maps']"));
		action.moveToElement(map).build().perform();
		//map.click();
		driver.switchTo().defaultContent();
		
		
		app= driver.findElement(By.xpath("//div[@class='gb_I gb_bd gb_Z']"));
		app.click();
		frame= driver.findElement(By.name("app"));
		driver.switchTo().frame(frame);
		
		WebElement news=driver.findElement(By.xpath("//*[text()='News']"));
	    action.click(news).build().perform();
	    Thread.sleep(3000);
				
		
		driver.switchTo().defaultContent();
		app= driver.findElement(By.xpath("//div[@class='gb_I gb_bd gb_Z']"));
		app.click();
		Thread.sleep(3000);
		frame= driver.findElement(By.name("app"));
		driver.switchTo().frame(frame);
		
		WebElement src=driver.findElement(By.xpath("//span[text()='Search']"));
		src.click();
		Thread.sleep(3000);
		
		
		driver.switchTo().defaultContent();
		app= driver.findElement(By.xpath("//div[@class='gb_I gb_bd gb_Z']"));
		app.click();
		Thread.sleep(3000);
		frame= driver.findElement(By.name("app"));
		driver.switchTo().frame(frame);
		
		WebElement yout=driver.findElement(By.xpath("//span[text()='YouTube']"));
	    action.click(yout).build().perform();
		
	    Set<String>listOfWind=driver.getWindowHandles();
	    Iterator<String>it=listOfWind.iterator();
	    String wind=it.next();
	   /* String win1=it.next();
	    String win2=it.next();
	    String win3=it.next();*/
	    
	    driver.switchTo().defaultContent();
	    driver.switchTo().window(wind);
	    WebElement src1=driver.findElement(By.xpath("//textarea[@aria-label='Search']"));
	    src1.sendKeys("GoogleHouse");
	    
	    driver.switchTo().window(wind);
	    WebElement nws=driver.findElement(By.xpath("//input[@class='Ax4B8 ZAGvjd']"));
	    nws.sendKeys("BangladeshNews");
	    
	    driver.switchTo().window(wind);
	    WebElement maps=driver.findElement(By.name("q"));
	    maps.sendKeys("Bangladesh");
	    
	   /* driver.switchTo().window(win2);
	    WebElement nws=driver.findElement(By.xpath("//input[@class='Ax4B8 ZAGvjd']"));
	    nws.sendKeys("BangladeshNews");*/
	    
	    driver.switchTo().window(wind);
	    WebElement ytb=driver.findElement(By.xpath("//span[text()='YouTube']"));
	    ytb.sendKeys("BanglaSong");
	    
	    
		;
	}
}
