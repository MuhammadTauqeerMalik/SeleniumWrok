package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class FlyvoPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stu
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumGecko\\geckodriver.exe");
		// Initialize Gecko Driver using Desired Capabilities Class  
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
        capabilities.setCapability("marionette",true); 

            WebDriver driver = new FirefoxDriver();
          
         
                driver.get("http://staging.flyvo.com/en");
                driver.findElement(By.id("loginModuleForm")).click();
                driver.switchTo().alert();
                Thread.sleep(1000);
                
                driver.findElement(By.xpath("//a[@class='active'][contains(.,'Sign Up')]")).click();
                Thread.sleep(1000);
                Select s = new Select(driver.findElement(By.xpath("//span[@class='filter-option pull-left']")));
        	    Thread.sleep(1000);
        	    s.selectByVisibleText("Mr");
        	    driver.findElement(By.id("userName_signup")).sendKeys("Asad");
        	    driver.findElement(By.id("userlname_signup")).sendKeys("khan");
        	    driver.findElement(By.id("useremail_signup")).sendKeys("khan@gmail.com");
        	    driver.findElement(By.id("password_signup")).sendKeys("123456");
        	    Select s1 = new Select(driver.findElement(By.className("selected-flag")));
        	    Thread.sleep(1000);
        	    s1.selectByVisibleText("Pakistan");
        	    driver.findElement(By.id("phoneLst")).sendKeys("3336650510");
        	    Thread.sleep(15000);
        	    driver.findElement(By.xpath("(//ins[@class='iCheck-helper'])[1]")).click();
        	    driver.findElement(By.xpath("(//ins[@class='iCheck-helper'])[2]")).click();
        	    driver.findElement(By.id("submitSignUpForm")).click();
        	    System.out.println("Successfully Sign Up");

        	    //
        	    //driver.findElement(By.id("agreedCondition")).click();
        	    //driver.findElement(By.className("iCheck-helper")).click();


//phoneLst

                
	}

}
