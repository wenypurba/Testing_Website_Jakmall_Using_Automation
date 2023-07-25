package UbahPassword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDef_UbahPass {
	WebDriver driver;
	
	@Given("^We are login on login page$")
	public void We_are_login_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jakmall.com/login?_r=eyJpdiI6IkZaMEltdGVYUlk1d1VGd2lWK3FMbFE9PSIsInZhbHVlIjoiTUtKdURWSVFhS0FaNWpcL0k5WmtTNFUwUGFnSXZsVUFETXhsckFmcjBTZ2M9IiwibWFjIjoiN2RjMTk0ZjU4ZDdlOTQyZmFkMWMyZmU3NmVmMzVkNzJmZjc0NjEzYjY5MTZmYWM1YTM2ZDI0Y2RlNTgyY2I1MSJ9&");
		driver.findElement(By.id("email")).sendKeys("dianhasibuan171@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("Hasibuan171");
	    driver.findElement(By.xpath("//*[@id=\"member\"]/div/form/fieldset/div[5]/div[2]/input")).click();
	}

	@When("^We are click Profil Saya$")
	public void We_are_click_Profil_Saya() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"onesignal-slidedown-allow-button\"]")).click();
		driver.findElement(By.id("jakmall-header-account")).click();
	    driver.findElement(By.xpath("//*[@id=\"header-body\"]/div[1]/div/div/div[3]/div[2]/div/div[2]/div[2]/div[2]/div[1]/div[2]/a[1]")).click();
	}

	@When("^We are click Keamanan$")
	public void We_are_click_Keamanan() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"profile\"]/div/a[2]")).click();
	}

	@When("^We are input the change password form$")
	public void We_are_input_the_change_password_form() throws Throwable {
		driver.findElement(By.name("old_password")).sendKeys("Hasibuan171");
	    driver.findElement(By.name("password")).sendKeys("dianhasibuan171");
	    driver.findElement(By.name("password_confirmation")).sendKeys("dianhasibuan171");
	}

	@Then("^We click ubah password$")
	public void We_click_ubah_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"profile\"]/form/div/fieldset/div[4]/div[2]/input")).click();
	}

}
