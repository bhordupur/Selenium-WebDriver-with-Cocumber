//author : bhordupur
//data : September 2014
//Turku University



package cucumber.features;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Test
public class Steps {

	protected WebDriver driver = new FirefoxDriver();
	
	@Given("^go to matkahuolto\\.fi site$")
	public void setUpBrowser(){
		driver.get("http://matkahuolto.fi");		
	}
	
	@When("^you are on the home page$")
	public void homePage(){
		try{
			//System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getCurrentUrl()+" : "+driver.getTitle());
			
			String s = driver.getTitle();
			Assert.assertEquals(s,"Matkahuolto");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Then("^display the logo$")
	public void displayLogo(){
		driver.get("http://matkahuolto.fi");
		WebElement logo = driver.findElement(By.xpath("/html/body/div/div/a/img"));
		logo.isDisplayed();
		
	}
	
	
	public void closeBrowser(){
		//driver.close();
	}
	
}
