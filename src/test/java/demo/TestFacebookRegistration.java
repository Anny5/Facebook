package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by macbook on 7/20/2017.
 */
public class TestFacebookRegistration {

  //https://www.youtube.com/watch?v=juKRybHPMwE

  public static void main(String[] args){

    WebDriver driver = new FirefoxDriver();

    driver.get("http://www.facebook.com");
    driver.manage().window().maximize();

    driver.findElement(By.xpath(".//*[@id='u_0_2']")).sendKeys("Test Selenium");
    driver.findElement(By.xpath(".//*[@id='u_0_i']")).click();

    Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
    sel1.selectByVisibleText("Apr");

    Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
    sel2.selectByValue("6");

    Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
    sel3.selectByIndex(6);

    driver.findElement(By.xpath(".//*[@id='u_0_m']")).click();

    driver.findElement(By.xpath(".//*[@id='reg_pages_msg']/a")).click();
    driver.navigate().back();

    driver.quit();
  }
}
