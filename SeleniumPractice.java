package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumGecko\\geckodriver.exe");
		// Initialize Gecko Driver using Desired Capabilities Class  
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
        capabilities.setCapability("marionette",true); 

            WebDriver driver = new FirefoxDriver();
          
         
                driver.get("https://www.toolsqa.com/automation-practice-form");
                
               // WebElement element = driver.findElement(By.partialLinkText("Partial"));
               // element.clear();
            
                // WebElement element2 = driver.findElement(By.linkText("Link Test"));
                // element2.clear();
                 driver.findElement(By.name("firstname")).sendKeys("Muhammad");
                 driver.findElement(By.name("lastname")).sendKeys("Tauqeer");
                 driver.findElement(By.xpath("//input[@id='sex-0']")).click();//for selecting male.
                 driver.findElement(By.xpath("//input[@value='2']")).click();//for selecting Experience.
                 driver.findElement(By.id("datepicker")).sendKeys("15/04/2018");
               //Click on check Box
                 driver.findElement(By.id("profession-1")).click();
                 
                 WebElement uploadElement = driver.findElement(By.id("photo"));

                 // enter the file path onto the file-selection input field
                 uploadElement.sendKeys("C:\\Users\\RAC\\Documents\\photo.jpg");
              // click the "UploadFile" button
                // driver.findElement(By.name("send")).click();
                 //Automation tool selection//Selenium Webdriver
                 driver.findElement(By.id("tool-2")).click();
                 //Continent
                 Select s = new Select(driver.findElement(By.id("continents")));
         	    Thread.sleep(1000);
         	    s.selectByVisibleText("Asia");
         	    //Selenium commands
         	   Select commands = new Select(driver.findElement(By.id("selenium_commands")));
       		commands.selectByVisibleText(" WebElement Commands");
       		//commands.selectByIndex(4);
       		//submit
       		driver.findElement(By.name("submit")).click();
       	 System.out.println("Succesfull");
       	 driver.quit();

	}

}
