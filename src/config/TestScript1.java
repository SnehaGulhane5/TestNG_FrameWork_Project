package config;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript1 extends AppUtil1{
@Test(priority=2,enabled=false)
public static void addition() {
	driver.findElement(By.name("display")).sendKeys("987654");
	driver.findElement(By.xpath("(//input[@id='btn'])[6]")).click();
	driver.findElement(By.name("display")).sendKeys("9842");
	driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
	Reporter.log("Executing addition test",true);
}
@Test(priority=0,invocationCount=3)
public static void division() {
	driver.findElement(By.name("display")).sendKeys("987654");
	driver.findElement(By.xpath("(//input[@id='btn'])[21]")).click();
	driver.findElement(By.name("display")).sendKeys("9842");
	driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
	Reporter.log("Executing Division test",true);
}
@Test(priority=1)
public static void multiplication() {
	driver.findElement(By.name("display")).sendKeys("987654");
	driver.findElement(By.xpath("(//input[@id='btn'])[16]")).click();
	driver.findElement(By.name("display")).sendKeys("9842");
	driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
	Reporter.log("Executing Multiplication test",true);
}
}
