package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sindh\\eclipse-workspace\\Tester\\driver\\chromedriver.exe");

		ChromeOptions chromeOption = new ChromeOptions();
		chromeOption.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(chromeOption);

		driver.get("https://adactinhotelapp.com/");

		WebElement createnew = driver.findElement(By.xpath("//td[@align='center']"));
		createnew.click();

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("john1234");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("231892hbd");

		WebElement repassword = driver.findElement(By.id("re_password"));
		repassword.sendKeys("231892hbd");

		WebElement fullname = driver.findElement(By.id("full_name"));
		fullname.sendKeys("john1234");

		WebElement email = driver.findElement(By.id("email_add"));
		email.sendKeys("mareesraja85@gmail.com");

		Thread.sleep(20000);

		WebElement terms = driver.findElement(By.id("tnc_box"));
		terms.click();

		WebElement register = driver.findElement(By.id("Submit"));
		register.click();

		Thread.sleep(5000);

		WebElement loginpage = driver.findElement(By.xpath("//a[@href='index.php']"));
		loginpage.click();

		WebElement username1 = driver.findElement(By.id("username"));
		username1.sendKeys("john1234");

		WebElement password1 = driver.findElement(By.id("password"));
		password1.sendKeys("231892hbd");

		Thread.sleep(5000);

		WebElement login = driver.findElement(By.id("login"));
		login.click();

		Thread.sleep(8000);

		WebElement location = driver.findElement(By.id("location"));
		location.click();

		Select s = new Select(location);
		s.selectByIndex(1);

		WebElement hotels = driver.findElement(By.id("hotels"));
		hotels.click();

		Select s1 = new Select(hotels);
		s1.selectByValue("Hotel Sunshine");

		WebElement room = driver.findElement(By.id("room_type"));
		room.click();

		Select s2 = new Select(room);
		s2.selectByVisibleText("Standard");

		WebElement search = driver.findElement(By.id("Submit"));
		search.click();

		WebElement click = driver.findElement(By.id("radiobutton_0"));
		click.click();

		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();

		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("john");

		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("michel");

		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("mumbai");

		WebElement credit = driver.findElement(By.id("cc_num"));
		credit.sendKeys("1234567890098765");

		WebElement credittype = driver.findElement(By.id("cc_type"));
		credittype.click();

		Select s3 = new Select(credittype);
		s3.selectByValue("VISA");

		WebElement expire = driver.findElement(By.id("cc_exp_month"));
		expire.click();

		Select s4 = new Select(expire);
		s4.selectByValue("3");

		WebElement expireyear = driver.findElement(By.id("cc_exp_year"));
		expireyear.click();

		Select s5 = new Select(expireyear);
		s5.selectByValue("2012");

		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("123");

		WebElement book = driver.findElement(By.id("book_now"));
		book.click();

		Thread.sleep(8000);

		Actions act = new Actions(driver);

		WebElement order = driver.findElement(By.id("order_no"));	

		String attribute = order.getAttribute("value");
		System.out.println(attribute);
		
		TakesScreenshot tk = (TakesScreenshot) driver;

		File sourceFile = tk.getScreenshotAs(OutputType.FILE);

		File targetFile = new File("D:\\Marees\\selenium\\screenshot\\hotelbooking1.jpeg");

		FileUtils.copyFile(sourceFile, targetFile);


	}

}
