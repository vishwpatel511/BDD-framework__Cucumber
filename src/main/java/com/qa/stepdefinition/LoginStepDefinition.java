package com.qa.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition {
	
	public static WebDriver driver;

	@Given("^User should already be on the login Page$")
	public void user_should_already_be_on_the_login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishw\\Desktop\\Study Material\\SeleniumJar\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/");
	}

	@When("^title of login page is Store$")
	public void title_of_login_page_is_Store() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		Assert.assertEquals("STORE", driver.getTitle());
		
		
	}

	@Then("^User clicks on Login Button$")
	public void user_clicks_on_Login_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement loginBtn = driver.findElement(By.id("login2"));
		loginBtn.click();
		Thread.sleep(2000);
	
	}
	
	@Then("^User enters \"(,*)\" and \"(,*)\"$")
	public void user_enters_username_and_password(String userName, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		WebElement userNameInputBox = driver.findElement(By.id("loginusername"));
		WebElement passwordInputBox = driver.findElement(By.id("loginpassword"));
		userNameInputBox.sendKeys(userName);
		Thread.sleep(1500);
		passwordInputBox.sendKeys(password);
		Thread.sleep(1000);
		
	}

	@Then("^User clickes on Login Button$")
	public void user_clickes_on_Login_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Log in']"));
		loginBtn.click();
		Thread.sleep(2000);
		
	}

	@Then("^User is on the Home Page$")
	public void user_is_on_the_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement WelcomenameOfUser = driver.findElement(By.xpath("//a[@id='nameofuser']"));
	    Assert.assertEquals("Welcome test123@yahoo.com", WelcomenameOfUser.getText());
		driver.quit();
	}


	
	
	
	
	
	
	
	
	
	
	
	
}
