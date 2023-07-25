package Kirim_Pesan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDef_KirimPesan {
	WebDriver driver;
	
	@Given("^We are on login page and inputs correct data$")
	public void We_are_on_login_page_and_inputs_correct_data() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jakmall.com/login?_r=eyJpdiI6IkZaMEltdGVYUlk1d1VGd2lWK3FMbFE9PSIsInZhbHVlIjoiTUtKdURWSVFhS0FaNWpcL0k5WmtTNFUwUGFnSXZsVUFETXhsckFmcjBTZ2M9IiwibWFjIjoiN2RjMTk0ZjU4ZDdlOTQyZmFkMWMyZmU3NmVmMzVkNzJmZjc0NjEzYjY5MTZmYWM1YTM2ZDI0Y2RlNTgyY2I1MSJ9&");
		
		driver.findElement(By.id("email")).sendKeys("dianhasibuan786@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("dianhasibuan786");
	    driver.findElement(By.xpath("//*[@id=\"member\"]/div/form/fieldset/div[5]/div[2]/input")).click();
	}

	@When("^We click send message$")
	public void We_click_send_message() throws Throwable {
		// BUtton Send Message
	    driver.findElement(By.xpath("/html/body/div/div/button/div/div/div[1]"));    
	}

	@When("^we input the message form$")
	public void we_input_the_message_form() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"zjigucd6b6r81654085760227\"]")).sendKeys("Dian");
	    driver.findElement(By.xpath("//*[@id=\"cojped6pg9no1654085760229\"]")).sendKeys("dianhasibuan171@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"tawk-prechat-form\"]/div[3]/fieldset/div/textarea")).sendKeys("Selamat pagi, saya Dian ingin meminta bantuan tentang ...");
	}

	@Then("^We click Kirim$")
	public void We_click_Kirim() throws Throwable {
	    
	}
}
