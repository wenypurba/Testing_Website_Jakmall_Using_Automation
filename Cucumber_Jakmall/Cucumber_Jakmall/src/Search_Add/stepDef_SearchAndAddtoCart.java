package Search_Add;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDef_SearchAndAddtoCart {
	WebDriver driver;
	
	@Given("^We are on login page and login$")
	public void We_are_on_login_page_and_login() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jakmall.com/login?_r=eyJpdiI6IkZaMEltdGVYUlk1d1VGd2lWK3FMbFE9PSIsInZhbHVlIjoiTUtKdURWSVFhS0FaNWpcL0k5WmtTNFUwUGFnSXZsVUFETXhsckFmcjBTZ2M9IiwibWFjIjoiN2RjMTk0ZjU4ZDdlOTQyZmFkMWMyZmU3NmVmMzVkNzJmZjc0NjEzYjY5MTZmYWM1YTM2ZDI0Y2RlNTgyY2I1MSJ9&");
		driver.findElement(By.id("email")).sendKeys("dianhasibuan171@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("dianhasibuan171");
	    driver.findElement(By.xpath("//*[@id=\"member\"]/div/form/fieldset/div[5]/div[2]/input")).click();
	}

	@When("^We input and search gaun$")
	public void We_input_and_search_gaun() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"header-search\"]/div/input")).sendKeys("Gaun");
	    driver.findElement(By.xpath("//*[@id=\"header-search\"]/div/button")).click();
	}

	@When("^We are input min price$")
	public void We_are_input_min_price() throws Throwable {
	    driver.findElement(By.id("v--currency-input")).sendKeys("50000");
	}

	@When("^We are input max price$")
	public void We_are_input_max_price() throws Throwable {
	    // driver.findElement(By.xpath("//*[@id=\"v--currency-input\"]")).sendKeys("200000");
		driver.findElement(By.xpath("//*[@id=\"product-list\"]/form/div[1]/div[2]/div[2]/div[1]/div[1]")).click();
	}

	@Then("^We are click add to cart$")
	public void We_are_click_add_to_cart() throws Throwable {
		// driver.findElement(By.xpath("//*[@id=\"product-list\"]/form/div[1]/div[2]/div[2]/div[1]/div[1]")).click();
	    driver.findElement(By.xpath("//*[@id=\"dp\"]/div/section[1]/div[2]/div[2]/div[1]/div[4]/div[3]/a[1]")).click();
	}
}
