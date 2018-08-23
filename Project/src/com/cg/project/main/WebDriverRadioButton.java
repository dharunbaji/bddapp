package com.cg.project.main;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverRadioButton {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver",
				   "C:\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("C:\\MavenProject\\RadioButtonTest.html");
		   By elements = By.name("color");
		   List<WebElement> radioButtons = driver.findElements(elements);
		   WebElement radioBtn = radioButtons.get(1);
		   radioBtn.click();
		   for(WebElement radioButton : radioButtons) {
			   if(radioButton.isSelected()) {
				   System.out.println(radioButton.getAttribute("value"));
			   }
		   }

	}

}
