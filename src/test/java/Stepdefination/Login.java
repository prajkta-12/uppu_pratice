package Stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	public static WebDriver a;
	@Given("^user on home page$")
	public void useronhomepage() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium drivers\\chromedriver.exe");
		a=new ChromeDriver();
		a.get("http://10.232.237.143:443/TestMeApp");
		a.manage().window().maximize();
		a.manage().timeouts().implicitlyWait(69, TimeUnit.SECONDS);
		
	}
	
	@When("^click on signin$")
	public void clickonsignin() throws InterruptedException {
		a.findElement(By.xpath("//a[@href='login.htm']")).click();
		Thread.sleep(3000);
		
	}
	
	@And("^enter userName as \"([^\"]*)\"$")
	public void  enteruserNameas(String uname) {
		a.findElement(By.id("userName")).sendKeys(uname);
		
		
	}
	
	@And("^enter password as \"([^\"]*)\"$")
	public void  enterpasswordas (String pass) {
		a.findElement(By.id("password")).sendKeys(pass);
		
		
	}
	
	@Then("^click on login$")
	public void clickonlogin() {
		a.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		
	}

}
