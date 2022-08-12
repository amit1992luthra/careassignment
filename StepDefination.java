package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.hooks;
import utilities.ScenarioContext;;

public class StepDefination {
	
	ScenarioContext ScenarioContext ;
	 public StepDefination(ScenarioContext scenarioContext){
		 this.ScenarioContext= scenarioContext;
	 }
	
	WebDriver driver = hooks.driver;
	
	@Given("^User navigates to Google Page$")
	public void user_navigates_to_Google_Page() {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String urlname = driver.getTitle(); 
		ScenarioContext.setScenarioContext("title",urlname);
		

	}
	
	@When("^User Enter String in search box of google \"([^\"]*)\"$")
	public void user_Enter_String_in_search_box_of_google(String searchstring)  {
		driver.findElement(By.xpath("//div[@class='a4bIc']/input")).sendKeys(searchstring);
		String def = "abc";
		System.out.println(ScenarioContext.getScenarioContext("title").toString());
		
		
	    
	}

	@Then("^The Results will Display \"([^\"]*)\" , \"([^\"]*)\"$")
	public void the_Results_will_Display(String string1, String string2) throws Throwable {
	    System.out.println(string1 + string2);
	    
	}
	
	@When("^User Enter String in search box of google for background example \"([^\"]*)\"$")
	public void user_Enter_String_in_search_box_of_google_for_background_example(String arg1) throws Throwable {
		driver.findElement(By.xpath("//div[@class='a4bIc']/input")).sendKeys(arg1);
	    
	}

	@Then("^The Results will Display for background example \"([^\"]*)\" , \"([^\"]*)\"$")
	public void the_Results_will_Display_for_background_example(String arg1, String arg2) throws Throwable {
	    
		System.out.println(arg1 + arg2);
	}
	
	

	




}
