package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactDelitionTest {
  FirefoxDriver wd;

  @BeforeMethod
  public void setUp() throws Exception {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys("admin");
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys("secret");
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    wd.findElement(By.linkText("home")).click();
  }

  @Test
  public void ContactDelitionTest() {

    wd.findElement(By.name("selected[]")).click();
    wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input")).click();
    //int count = 0;
    //while (!pushOkConfirmPresent(wd)) {
    //if (count++ < 1) throw new NoAlertPresentException("Окно подтверждения не найдено. Время истекло");
    //};
    pushOkConfirmPresent(wd);
    wd.findElement(By.linkText("home")).click();
  }

  public static boolean pushOkConfirmPresent(FirefoxDriver wd) {
    try {
      wd.switchTo().alert().accept();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  @AfterMethod
  public void tearDown() {
    wd.quit();
  }

  public static boolean isAlertPresent(FirefoxDriver wd) {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }


}
