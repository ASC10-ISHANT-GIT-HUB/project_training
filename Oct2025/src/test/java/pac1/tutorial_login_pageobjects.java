package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tutorial_login_pageobjects {
	WebDriver driver;
	
	By myaccount = By.linkText("My Account");

	public tutorial_login_pageobjects(WebDriver driver2) {
		this.driver=driver2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void clickonmyaccount() {
		// TODO Auto-generated method stub
		driver.findElement(myaccount).click();
		
	}



}
