package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	WebDriver dr;

	@Given("in login page {string}")
	public void in_login_page(String string) {
		dr= new ChromeDriver();
		dr.get(string);
	}
	@Then("user enter loginid {string}")
	public void user_enter_loginid(String string) {
		dr.findElement(By.name("q")).sendKeys(string);
	}
	@Then("user password is fillerd {string}")
	public void user_password_is_fillerd(String string) {
		dr.findElement(By.name("q")).sendKeys(string);
	}
	@When("user hit login")
	public void user_hit_login() {
		dr.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}
	@Then("user logged in the page")
	public void user_logged_in_the_page() {
		dr.close();
	}
}
