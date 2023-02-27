package ServiceNow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CreateNewProposal {

	public static void main(String[] args) {
		
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev140572.service-now.com\r\n");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.switchTo().frame(0);
	    WebElement name = driver.findElement(By.id("user_name"));
	    name .sendKeys("admin");
	    
	    WebElement password= driver.findElement(By.id("user_password"));
	    password.sendKeys("P-qQ7@umSYz8");
	    
	    WebElement login = driver.findElement(By.id("sysverb_login"));
	    login.click();
	    
	    driver.switchTo().defaultContent();
		
		WebElement search = driver.findElement(By.id("filter"));
		search.sendKeys("proposal");
		
		WebElement box = driver.findElement(By.xpath("//div[text()='My Proposals']"));
		box.click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		
		WebElement button = driver.findElement(By.id("sysverb_new"));
		button.click();
		
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame(0);
		
		WebElement findElement = driver.findElement(By.id("std_change_proposal.short_description"));
		findElement.sendKeys("Muthu Gowreswaran");
		
	    driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
	}
		
		
	


	}


