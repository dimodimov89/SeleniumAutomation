import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebaySearch {
	WebDriver driver;
	
	
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\35988\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.ebay.com/");
		driver.manage().window().maximize();
	}
	
	
//Test Case
	public void searchProduct() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("gh-ac")).sendKeys("JBL Speakers");
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(3000);
	}
	
	
//Test Case
	public void dayliDeals() throws InterruptedException {
		driver.findElement(By.linkText("Daily Deals")).click();
		Thread.sleep(3000);
	}

	
//Test Case
	public void watchList() throws InterruptedException {
		driver.findElement(By.linkText("Watchlist")).click();
		Thread.sleep(3000);
	}

	
//Test Case
	public void sell() throws InterruptedException {
		driver.findElement(By.linkText("Sell")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	
//Test Case
	public void signIn() throws InterruptedException {
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("userid")).sendKeys("elon@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("signin-continue-btn")).click();
	}

	
//Test Case	
	public void navigate() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().to("https://www.simplilearn.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
		}
	
	
//Test Case
	public void createAccount() throws InterruptedException {
		driver.findElement(By.linkText("create an account")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("firstname")).sendKeys("Elon");
		Thread.sleep(3000);
		driver.findElement(By.id("lastname")).sendKeys("Tusk");
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("elon@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("mypassword123");
		Thread.sleep(3000);
	}
	
	
//Test case
	public void radioControl() throws InterruptedException {
		driver.findElement(By.id("businessaccount-radio")).click();
		Thread.sleep(3000);
	}
	
	
//Test Case
	public void dropDownMenu() throws InterruptedException {
		driver.findElement(By.id("businessCountry")).click();
		Thread.sleep(3000);
	}
	
	
//Test Case	
	public void closeBrowser() {
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
	
		ebaySearch obj = new ebaySearch();
		obj.launchbrowser();
		obj.searchProduct();
		obj.dayliDeals();
		obj.watchList();
		obj.sell();
		obj.signIn();
		obj.navigate();
		obj.createAccount();
		obj.radioControl();
		obj.dropDownMenu();
		obj.closeBrowser();
	}

}
