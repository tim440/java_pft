package ru.stqa.pft.addressbook.appmanager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.By.xpath;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void saveContact() {
    click(By.name("submit"));
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getName());
    type(By.name("middlename"), contactData.getMName());
    type(By.name("lastname"), contactData.getLName());
    type(By.name("home"), contactData.getPhone());
    type(By.name("email"), contactData.getEMail());
    if (creation){
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    }else{
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }

  }

  public void initNewContact() {
    click(By.linkText("add new"));
  }
  public void deleteContact() {
    click(xpath("//div[@id='content']/form[2]/div[2]/input"));
    //int count = 0;
    //while (!pushOkConfirmPresent(wd)) {
    //if (count++ < 1) throw new NoAlertPresentException("Окно подтверждения не найдено. Время истекло");
    //};
    pushOkConfirmPresent(wd);
  }

  public void selectContactCheckbox(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();
    //click(By.name("selected[]"));
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
    click(xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public void updateContactDate() {
    click(By.name("update"));
  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }

  public void createContact(ContactData contactData, boolean groupPresent) {
    initNewContact();
    fillContactForm(contactData, groupPresent);
    saveContact();
  }

  public List<ContactData> getContactList() {

    List<ContactData> contacts = new ArrayList<ContactData>();
    List<WebElement> elements = wd.findElements(By.name("entry"));
    for (WebElement element : elements) {

      int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("id"));
      String name = element.findElement(By.xpath(".//td[3]")).getText();
      String LName = element.findElement(By.xpath(".//td[2]")).getText();
      ContactData contact = new ContactData(id, name, null, LName, null, null, null);
      contacts.add(contact);
    }
    return contacts;
    }
}
