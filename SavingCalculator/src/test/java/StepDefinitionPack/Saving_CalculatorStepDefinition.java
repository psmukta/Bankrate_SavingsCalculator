package StepDefinitionPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Saving_CalculatorStepDefinition {
	WebDriver driver;
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C://ITTraining//Alldriver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	@Given("^User will navigate bankrate homepage$")
	public void user_will_navigate_bankrate_homepage() {
		driver.get("https://www.bankrate.com/");
	    
	}

	@When("^User will hover mouse on BANKING menu and click on Savingscalculator$")
	public void user_will_hover_mouse_on_BANKING_menu_and_click_on_Savingscalculator() throws InterruptedException {
		WebElement Banking=driver.findElement(By.xpath("//*[@id=\"csstyle\"]/div[2]/header/nav/ul/li[2]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(Banking).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Savings calculator")).click();
		Thread.sleep(4000);

	    
	}

	@When("^User will enter InitialAmount\"([^\"]*)\" , MonthlyDeposit \"([^\"]*)\" and NumberofYears \"([^\"]*)\"$")
	public void user_will_enter_InitialAmount_MonthlyDeposit_and_NumberofYears(String IAM, String MDP, String NYR) throws InterruptedException {
		WebElement IA= driver.findElement(By.xpath("//*[@id=\"initialAmount\"]"));
		IA.clear();
		driver.findElement(By.xpath("//*[@id=\"initialAmount\"]")).sendKeys(IAM);
		Thread.sleep(3000);
		WebElement MD=driver.findElement(By.xpath("//*[@id=\"monthlyDeposit\"]"));
		MD.clear();
		driver.findElement(By.xpath("//*[@id=\"monthlyDeposit\"]")).sendKeys(MDP);
		Thread.sleep(3000);
		WebElement NOY=driver.findElement(By.xpath("//*[@id=\"numberOfYears\"]"));
		NOY.clear();
		driver.findElement(By.xpath("//*[@id=\"numberOfYears\"]")).sendKeys(NYR);
		Thread.sleep(3000);
	    
	}

	@When("^User will click Calculator button$")
	public void user_will_click_Calculator_button() {
		driver.findElement(By.id("calculate")).click();
	    
	}

	@Then("^User should see his/her Final SavingsBalance \"([^\"]*)\"$")
	public void user_should_see_his_her_Final_SavingsBalance(String FS) {
		String ActualFSB= driver.findElement(By.id("finalSavingsBalance")).getText();
		Assert.assertEquals(ActualFSB,FS );
	}

}
