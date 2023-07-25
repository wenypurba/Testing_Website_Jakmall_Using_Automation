package Ubah_Profil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {
	WebDriver driver;
	
	@Given("^We are on login page$")
	public void We_are_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jakmall.com/login?_r=eyJpdiI6IkZaMEltdGVYUlk1d1VGd2lWK3FMbFE9PSIsInZhbHVlIjoiTUtKdURWSVFhS0FaNWpcL0k5WmtTNFUwUGFnSXZsVUFETXhsckFmcjBTZ2M9IiwibWFjIjoiN2RjMTk0ZjU4ZDdlOTQyZmFkMWMyZmU3NmVmMzVkNzJmZjc0NjEzYjY5MTZmYWM1YTM2ZDI0Y2RlNTgyY2I1MSJ9&");
	}

	@When("^We input email and password$")
	public void We_input_email_and_password() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("dianhasibuan171@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("Dianhasibuan171");
	    driver.findElement(By.xpath("//*[@id=\"member\"]/div/form/fieldset/div[5]/div[2]/input")).click();
	}

	@When("^We are click Profil Saya$")
	public void We_are_click_Profil_Saya() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"jakmall-header-account\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"onesignal-slidedown-allow-button\"]")).click();
		driver.findElement(By.id("jakmall-header-account")).click();
	    driver.findElement(By.xpath("//*[@id=\"header-body\"]/div[1]/div/div/div[3]/div[2]/div/div[2]/div[2]/div[2]/div[1]/div[2]/a[1]")).click();
	}

	@When("^We input the data we want to change$")
	public void We_input_the_data_we_want_to_change() throws Throwable {
		driver.findElement(By.id("name")).sendKeys("Dian Esra Vitania");
	    
//	    WebElement dropdown = driver.findElement(By.name("day"));
//	    Select select = new Select(dropdown);
//	    select.deselectByValue("26");
	    
	    // Select Tanggal
	    Select tanggal = new Select (driver.findElement(By.name("day")));
	    tanggal.selectByValue("26");
	    
	    // Select Bulan
	    Select bulan = new Select (driver.findElement(By.name("month")));
	    bulan.selectByVisibleText("Aug");
	    
	    // Select Tahun
	    Select tahun = new Select (driver.findElement(By.name("year")));
	    tahun.selectByValue("2001");
	    
	    driver.findElement(By.xpath("//*[@id=\"profile-form\"]/fieldset/div[5]/div[2]/div/div[2]/div/label/span")).click();
	    
	}

	@Then("^We click update profil$")
	public void We_click_update_profil() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"profile\"]/form/div[2]/fieldset/div/div/button")).click();
	}
}
