package pac1;
import java.awt.datatransfer.SystemFlavorMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TC001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("The title is: "+driver.getTitle());
		System.out.println("The url is: "+driver.getCurrentUrl());
		
		System.out.println("The page source is: "+driver.getPageSource());
		
		WebElement search=driver.findElement(By.id("APjFqb"));
		if(search.isDisplayed()) {
			
		}
		search.sendKeys(Keys.SPACE);
		search.sendKeys(Keys.TAB);
		
		
		search.sendKeys("Software Testing Tools");
		search.submit();
		
		driver.navigate().to("https://amazon.in/");
		System.out.println("The title is: "+driver.getTitle());
		System.out.println("The url is: "+driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println("The title is: "+driver.getTitle());
		System.out.println("The url is: "+driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println("The title is: "+driver.getTitle());
		System.out.println("The url is: "+driver.getCurrentUrl());
	}

}
