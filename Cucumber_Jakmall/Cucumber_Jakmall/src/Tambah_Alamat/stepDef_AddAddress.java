package Tambah_Alamat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDef_AddAddress {
	WebDriver driver;
	
	@Given("^We are on login page and login$")
	public void We_are_on_login_page_and_login() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jakmall.com/login?_r=eyJpdiI6IkZaMEltdGVYUlk1d1VGd2lWK3FMbFE9PSIsInZhbHVlIjoiTUtKdURWSVFhS0FaNWpcL0k5WmtTNFUwUGFnSXZsVUFETXhsckFmcjBTZ2M9IiwibWFjIjoiN2RjMTk0ZjU4ZDdlOTQyZmFkMWMyZmU3NmVmMzVkNzJmZjc0NjEzYjY5MTZmYWM1YTM2ZDI0Y2RlNTgyY2I1MSJ9&");
		
		// Login
		driver.findElement(By.id("email")).sendKeys("dianhasibuan171@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("dianhasibuan171");
	    driver.findElement(By.xpath("//*[@id=\"member\"]/div/form/fieldset/div[5]/div[2]/input")).click();
	}

	@When("^We click Profil Saya$")
	public void We_click_Profil_Saya() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"onesignal-slidedown-allow-button\"]")).click();
		driver.findElement(By.id("jakmall-header-account")).click();
	}

	@When("^we click add address$")
	public void we_click_add_address() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"profile\"]/div/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"aa\"]/div/div")).click();
	}

	@When("^We input data for add address$")
	public void We_input_data_for_add_address() throws Throwable {
		driver.findElement(By.id("address-name")).sendKeys("Rumah");
		driver.findElement(By.id("name")).sendKeys("Dian Esra Vitania Hasibuan");
		driver.findElement(By.id("address-name")).sendKeys("Rumah");
		driver.findElement(By.id("phone-number")).sendKeys("081350649737");
		driver.findElement(By.id("full-address")).sendKeys("Kav. Sagulung Sempurna 1 No 108");
		driver.findElement(By.xpath("//*[@id=\"address-region\"]")).sendKeys("Batam");
		driver.findElement(By.id("postal")).sendKeys("29439");
		driver.findElement(By.xpath("//*[@id=\"aa\"]/div[2]/div/div/div/form/fieldset/div[7]/div/div/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"mapnull\"]/div/div/div[2]/div[2]/div/div[1]/div/a")).click();
	}

	@Then("^We click Simpan Alamat$")
	public void We_click_Simpan_Alamat() throws Throwable {
	}
}
