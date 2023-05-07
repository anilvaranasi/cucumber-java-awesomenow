package io.cucumber.awesomenow;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver.Timeouts;
//import java.util.concurrent.TimeUnit;
public class ServiceNowUtils {
	//Opening Chrome Browser, login to ServiceNow, open incident list
	
	private final WebDriver driver = new ChromeDriver();
	String baseUrl = "https://dev111463.service-now.com";
	   public void openLoginPage() {
    	driver.get(baseUrl + "/login.do");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
    }
    public void enterCreds() throws InterruptedException {
    	//Thread.sleep(1000);
    	//enter user_name, user_password and click on login button
    	driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("adminanil");
    	driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("MyAdminP@55w0rd");
    	driver.findElement(By.xpath("//*[@id=\"sysverb_login\"]")).click();
    	
    }
    public void openIncidentList() {
    	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
    	driver.get(baseUrl+ "/incident_list.do");
    	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
    }
    public void closeBrowser() {
    	driver.quit();
    }
}
