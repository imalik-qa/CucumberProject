package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class OrangeHRMsteps {
	WebDriver driver;
	@Given ("I launch chrome browser")
	public void i_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "E://Documents//Selenium Java Course//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@When ("I open google home page")
	public void i_open_google_home_page() {
		driver.get("https://www.google.com/");
	}
	@Then ("I verity that the logo is present on page")
	public void i_verity_that_the_logo_is_present_on_page() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.className("lnXdpd")).isDisplayed());
	}
	@Then("Close browser")
	public void close_browser() {
		driver.quit();
	}
}
