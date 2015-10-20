//author: bhordupur
//Date : September 
//Turku University


package cucumber.features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
@Test
public class StepsForTimetableSearch {
	
	protected WebDriver driver = new FirefoxDriver();
	
	@Given("^go to matkahuolto\\.fi site$")
	public void setUpBrowser(){
		driver.get("http://matkahuolto.fi");		
	}
	
	@Given("^the timetable is visible$")
	public void the_timetable_is_visible() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user write turku as departure$")
	public void user_write_turku_as_departure() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("departureStopAreaName")).sendKeys("Turku");

	}

	@When("^helsinki as destination$")
	public void helsinki_as_destination() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.manage().timeouts().implicitlyWait(10, Units.Seconds)
		driver.findElement(By.name("arrivalStopAreaName")).sendKeys("Helsinki");

	}

	@When("^chooses the departure date$")
	public void chooses_the_departure_date() throws Throwable {
	
		driver.findElement(By.name("departureDay")).clear();
		driver.findElement(By.name("departureDay")).sendKeys("26");
		driver.findElement(By.name("departureMonth")).clear();
		driver.findElement(By.name("departureMonth")).sendKeys("11");
		driver.findElement(By.name("departureYear")).clear();
		driver.findElement(By.name("departureYear")).sendKeys("2014");
	}

	@When("^\"(.*?)\" button is pushed$")
	public void button_is_pushed(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("search")).click();

	}

	@Then("^timetable from turku to helsinki on a chosen date is shown$")
	public void timetable_from_turku_to_helsinki_on_a_chosen_date_is_shown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

}
