package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void saveContact() {
    click(By.name("submit"));
  }

  public void fillNewContact(ContactData contactData) {
    type(By.name("firstname"), contactData.getName());
    type(By.name("middlename"), contactData.getMName());
    type(By.name("lastname"), contactData.getLName());
    type(By.name("home"), contactData.getPhone());
    type(By.name("email"), contactData.getEMail());

  }

  public void initNewContact() {
    click(By.linkText("add new"));
  }
  public void deleteContact() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    //int count = 0;
    //while (!pushOkConfirmPresent(wd)) {
    //if (count++ < 1) throw new NoAlertPresentException("Окно подтверждения не найдено. Время истекло");
    //};
    pushOkConfirmPresent(wd);
  }

  public void selectContactCheckbox() {
    click(By.name("selected[]"));
  }

  public static boolean pushOkConfirmPresent(WebDriver wd) {
    try {
      wd.switchTo().alert().accept();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  public void initContactModification() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public void updateContactDate() {
    click(By.name("update"));
  }
}
