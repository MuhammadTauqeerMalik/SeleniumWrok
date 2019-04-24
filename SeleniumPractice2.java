package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumPractice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumGecko\\geckodriver.exe");
		// Initialize Gecko Driver using Desired Capabilities Class  
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
        capabilities.setCapability("marionette",true); 

            WebDriver driver = new FirefoxDriver();
          
         
                driver.get("http://thedemosite.co.uk/");
                Thread.sleep(5000);
                
                WebElement element2 = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
                 element2.click();
                Thread.sleep(1000);
                 driver.findElement(By.name("username")).sendKeys("Tauqeer");
                 driver.findElement(By.name("password")).sendKeys("123456");
                 driver.findElement(By.name("FormsButton2")).click();
                Thread.sleep(2000);
                 
                 WebElement element = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
                 element.click();
                 driver.findElement(By.name("username")).sendKeys("Tauqeer");
                 driver.findElement(By.name("password")).sendKeys("123456");
                 driver.findElement(By.name("FormsButton2")).click();
                 driver.close();
                 System.out.print("Successful");

}}
