package Daftar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {
WebDriver driver;
	
	@Given("^We are on Daftar Page$")
	public void We_are_on_Daftar_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jakmall.com/register?_r=eyJpdiI6IlBZS1ZDMEhsUlBUMkdSdVRaajBaWFE9PSIsInZhbHVlIjoiVGlqODZLdGZyVW8zQURtU01RRFVnYm5nc0hheHBOamRRM3hIMlJhMno1VT0iLCJtYWMiOiI0MThlMDE5NTM0MDc0NmI1M2IwYzE0ZjRjOGNlZmNjOTI4ZmVhYjEzNThkNzkwZWIzZWQ3YjI3NDU3N2JkNjg5In0%3D&");
		// driver.get("https://www.jakmall.com/");
//		driver.findElement(By.xpath("//*[@id=\"header-body\"]/div[1]/div/div/div[3]/div[2]/div/div/a[2]")).click();
	}
//	}
//	
	@When("^We inputs the correct form data$")
	public void We_inputs_the_correct_form_data() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("dianhasibuan786@gmail.com");
		driver.findElement(By.id("name")).sendKeys("dian hasibuan");
	    driver.findElement(By.id("phone_number")).sendKeys("081350649737");
	    driver.findElement(By.id("password")).sendKeys("dianhasibuan786");
	}
//	
	@Then("^We can register successfully$")
	public void We_can_register_successfully() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"member\"]/div/div[2]/div/form/fieldset/div[7]/div[2]/input")).click();
	}

}
