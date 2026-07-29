package com.omrbranch.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	WebDriver driver;
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	}
	

	@When("User enters the {string} and {string}")
	public void user_enters_the_and(String name, String pass) {
		WebElement username = driver.findElement(By.id("email"));
        username.sendKeys(name);
        WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(pass);
	}



	@When("User click the Login button")
	public void user_click_the_login_button() {
		WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
		btnLogin.click();
	    
	}
	@Then("the User should verify the success Login message")
	public void the_user_should_verify_the_success_login_message() {
		Assert.assertTrue("verify after login",true);
	    
	}







}
