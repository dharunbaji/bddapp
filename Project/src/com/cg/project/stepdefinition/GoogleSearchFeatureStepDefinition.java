package com.cg.project.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GoogleSearchFeatureStepDefinition {
	
	private WebDriver driver;
	
	@Given("^user is on Google home page$")
	public void user_is_on_Google_home_page() throws Throwable {
	   System.setProperty("webdriver.chrome.driver",
			   "C:\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.google.com/");
	}

	@When("^user searches for 'Agile Methodology'$")
	public void user_searches_for_Agile_Methodology() throws Throwable {
	   WebElement searchElement= driver.findElement(By.id("lst-ib"));
	   searchElement.sendKeys("Agile Methodology");
	   searchElement.submit();
	   
	}

	@Then("^on page links should be displayed for the information about 'Agile Methodology'$")
	public void on_page_links_should_be_displayed_for_the_information_about_Agile_Methodology() throws Throwable {
	    String actualTitle=driver.getTitle();
	    String expectedTitle = "Agile Methodology - GoogleSearch";
	    Assert.assertEquals(expectedTitle, actualTitle);
	    driver.close();
	}



}
