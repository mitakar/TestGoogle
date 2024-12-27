package googleF;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class Test_1 {
	
	@Test
	public void start() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	Actions act= new Actions(driver);
     driver.get("https://www.google.com/");
    // driver.manage().window().maximize();
      
     WebElement apps= driver.findElement(By.xpath("//div[@class='gb_I gb_bd gb_Z']"));
     apps.click();
      
     WebElement frame=driver.findElement(By.xpath("//iframe[@name='app']"));
     driver.switchTo().frame(frame);
 
     WebElement map= driver.findElement(By.xpath("//span[text()='Maps']"));
     map.click();
     Thread.sleep(3000);         
          
     driver.switchTo().defaultContent();
     Thread.sleep(3000);
     apps= driver.findElement(By.xpath("//div[@class='gb_I gb_bd gb_Z']"));
     apps.click();
     frame=driver.findElement(By.xpath("//iframe[@name='app']"));
     driver.switchTo().frame(frame);
     Thread.sleep(3000);
     WebElement news=driver.findElement(By.xpath("//*[text()='News']"));
     act.click(news).build().perform();
     Thread.sleep(3000);
     
    /* driver.switchTo().defaultContent();
     Thread.sleep(3000);
     apps= driver.findElement(By.xpath("//div[@class='gb_I gb_bd gb_Z']"));
     apps.click();
     Thread.sleep(3000);
     frame=driver.findElement(By.xpath("//iframe[@name='app']"));
     driver.switchTo().frame(frame);
     
     WebElement yout=driver.findElement(By.xpath("//span[text()='YouTube']"));
     act.click(yout).build().perform();*/
          
     
    
     Thread.sleep(3000);
     /*WebElement search=driver.findElement(By.name("search_query"));
     act.sendKeys(Keys.ENTER).build().perform();
     search.sendKeys("Bangla song");*/    
     Set<String>liOfWin= driver.getWindowHandles();
     Iterator <String>it=liOfWin.iterator();
     String main=it.next();
     String child=it.next();
     //String child1= it.next();
     
     driver.switchTo().window(main);
     WebElement msrc=driver.findElement(By.name("q"));
     msrc.sendKeys("Dhaka");
     msrc.sendKeys(Keys.ENTER);
     Thread.sleep(3000); 
     driver.switchTo().window(child);
     WebElement nsrc=driver.findElement(By.xpath("//input[@class='Ax4B8 ZAGvjd']"));
     nsrc.sendKeys("DhakaNews");
     nsrc.sendKeys(Keys.ENTER);
     driver.switchTo().defaultContent();
     Thread.sleep(3000);
     apps= driver.findElement(By.xpath("//div[@class='gb_I gb_bd gb_Z']"));
     apps.click();
     Thread.sleep(3000);
     frame=driver.findElement(By.xpath("//iframe[@name='app']"));
     driver.switchTo().frame(frame);
     
     WebElement yout=driver.findElement(By.xpath("//span[text()='YouTube']"));
     //act.click(yout).build().perform();
     //driver.switchTo().defaultContent();
     //driver.switchTo().window(child1);
     yout.click();
     Thread.sleep(3000);
   //  WebElement ysrc=driver.findElement(By.xpath("div[@class='ytSearchboxComponentInputBox']"));
    // ysrc.sendKeys(Keys.ENTER);
   //  ysrc.sendKeys("Bangla song");
     
     driver.switchTo().window(main);
     Thread.sleep(3000);
     driver.switchTo().defaultContent();
     Thread.sleep(3000);
     apps= driver.findElement(By.xpath("//div[@class='gb_I gb_bd gb_Z']"));
     apps.click();
     Thread.sleep(3000);
     frame=driver.findElement(By.xpath("//iframe[@name='app']"));
     driver.switchTo().frame(frame);
     
     WebElement shop=driver.findElement(By.xpath("//span[text()='Shopping']"));
     act.click(shop).build().perform();
    // driver.switchTo().defaultContent();
     WebElement src=driver.findElement(By.id("APjFqb"));
     act.sendKeys(Keys.ENTER).build().perform();
     src.sendKeys("Bangla Book");
     
     driver.switchTo().window(main);
     Thread.sleep(3000);
     
     driver.switchTo().defaultContent();
     Thread.sleep(3000);
     apps= driver.findElement(By.xpath("//div[@class='gb_I gb_bd gb_Z']"));
     apps.click();
     Thread.sleep(3000);
     frame=driver.findElement(By.xpath("//iframe[@name='app']"));
     driver.switchTo().frame(frame);
     
     WebElement mail=driver.findElement(By.xpath("//span[text()='Gmail']"));
     act.click(mail).build().perform();
     Thread.sleep(3000);
     //driver.switchTo().defaultContent();
     
     driver.switchTo().window(main);
     Thread.sleep(3000);
     driver.switchTo().defaultContent();
     Thread.sleep(3000);
    
     apps= driver.findElement(By.xpath("//div[@class='gb_I gb_bd gb_Z']"));
     apps.click();
     Thread.sleep(3000);
     frame=driver.findElement(By.xpath("//iframe[@name='app']"));
     driver.switchTo().frame(frame);
     
     WebElement dat=driver.findElement(By.xpath("//span[text()='Calendar']"));
     act.click(dat).build().perform();
       
     
     //driver.close();
	}
}
