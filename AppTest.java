package aya2.aya2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.w3c.dom.NameList;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {
	
	@Test 
	public void mytest() {}
	
	WebDriver driver = new EdgeDriver();
	String THEWEBSITE = "https://www.saucedemo.com/";
	String username = "standard_user";
	String password = "secret_sauce";
	
	
	@BeforeTest 
	public void mySetup() {
		
		driver.manage().window().maximize();
		driver.get(THEWEBSITE);
	}
	
	@Test(priority = 1)
	public void login() throws InterruptedException {
		 WebElement UserNameInput = driver.findElement(By.id("user-name"));
		 WebElement passwordinput = driver.findElement(By.id("password"));
		 WebElement logininput = driver.findElement(By.id("login-button"));
		 
		 UserNameInput.sendKeys(username);
			passwordinput.sendKeys(password);
			logininput.click();
	    
	
	}
	

	@Test(priority = 2)
	public void addAllItemToThecart() throws InterruptedException {
		List<WebElement> addtocartbuttons = driver.findElements(By.className("btn"));
		for(int i = 0 ; i<addtocartbuttons.size();i++) {
			addtocartbuttons.get(i).click();
			Thread.sleep(2000);
		}
	}
	
	@Test(priority = 3, enabled = false)
	public void removeitemfromthecart() {
		WebElement backpackremovebutton = driver.findElement(By.id("remove-sauce-labs-backpack"));
		
		backpackremovebutton.click();
		
	}
	@Test(priority = 4, enabled = false)
	public void logout() throws InterruptedException {
		WebElement bugurmenu = driver.findElement(By.id("react-burger-menu-btn"));
		bugurmenu.click();
		Thread.sleep(1000);
		
		
		WebElement logoutbutton = driver.findElement(By.id("logout_sidebar_link"));
		logoutbutton.click();
		
		WebElement mainlogo = driver.findElement(By.className("login_logo"));
		System.out.println(mainlogo.getText());
		WebElement UserNames = driver.findElement(By.id("login_credentials"));
		System.out.println(UserNames.getText());
	}
	@Test(priority = 4)
	public void Task() {
		
		// lastindex = size - 1 
		
		List<WebElement> ItemsNames = driver.findElements(By.className("inventory_item_name"));
		
		for(int i = 0 ; i < ItemsNames.size();i++) {
			
			String itemName = ItemsNames.get(i).getText();
			System.out.println(itemName.charAt(0));
		}
		}
		
	@Test(priority = 6)
	public <WebElemet> void task1 () {
		
		List<WebElemet> element = (List<WebElemet>) driver.findElement(By.className("inventory_item_name"));
		List<WebElemet> ItemsNames = element;
		for(int i = 0 ; i < ItemsNames.size();i++) {

			String itemName = ItemsNames.get(i).getText();
			System.out.println(itemName.charAt(0));

			
		}
	
	}
	
	
		
		//@Test(priority = 5)
      // 	public void task2 () {
       	//List<WebElement> ItemsNames = driver.findElements(By.className("inventory_item_name"));
	
	//for(int i = 0 ; i < ItemsNames.size();i++) {
		
		//String itemName = ItemsNames.get(i).getText();
		
		//if(itemName.startsWith("S")) {
		//	continue ; 
	//	}else {
			//System.out.println(itemName);
		//}}
		
	}

	
	@AfterTest
	public void myaftertest() {
		
	//	driver.quit();
	}
	
	
}