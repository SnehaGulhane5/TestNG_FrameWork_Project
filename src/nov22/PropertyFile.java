package nov22;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PropertyFile {
public Properties p;
WebDriver driver;
@BeforeTest
public void setUp()throws Throwable{
	p=new Properties();
	p.load(new FileInputStream("D:\\eclipse-workspace\\TestNG_Framework\\Flight.properties"));
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(p.getProperty("Url"));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(5000);
}
@Test
public void validateRegister()  {
	driver.findElement(By.xpath(p.getProperty("ObjReg"))).click();
	
	driver.findElement(By.xpath(p.getProperty("ObjName"))).sendKeys(p.getProperty("ObjEnterName"));
	driver.findElement(By.xpath(p.getProperty("ObjContact"))).sendKeys(p.getProperty("ObjEnterCont"));
	driver.findElement(By.xpath(p.getProperty("ObjEmail"))).sendKeys(p.getProperty("ObjEnterMail"));
	driver.findElement(By.xpath(p.getProperty("Objpass"))).sendKeys(p.getProperty("ObjEnterpass"));
	new Select(driver.findElement(By.xpath(p.getProperty("ObjGender")))).selectByVisibleText(p.getProperty("ObjSelectGender"));
	driver.findElement(By.xpath(p.getProperty("Objbirth"))).click();
	driver.findElement(By.xpath(p.getProperty("ObjDate"))).click();
	driver.findElement(By.xpath(p.getProperty("ObjCheckbox"))).click();
	driver.findElement(By.xpath(p.getProperty("ObjRegister"))).click();
}
@AfterTest
public void tearDown() {
	driver.close();
}
}