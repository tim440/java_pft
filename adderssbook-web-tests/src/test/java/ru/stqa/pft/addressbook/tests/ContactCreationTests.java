package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.io.File;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class ContactCreationTests extends TestBase {
  @Test
  public void testContactCreation() {
    int n = 1; // Количество создаваемых контактов
    for (int i = 1; i <= n; i++) {
      app.goTo().gotoHomePage();
      List<ContactData> before = app.contact().allm();
      app.contact().initNewContact();
      File photo = new File("src\test\resources\11111.png");
      ContactData contact = new ContactData().withFirstname("test1").withLastname("test2").withPhoto(photo);
      app.contact().fillContactForm(contact, true);
      app.contact().saveContact();
      app.goTo().gotoHomePage();
      List<ContactData> after = app.contact().allm();
      Assert.assertEquals(after.size(), before.size() + 1);

      before.add(contact);

      Comparator<? super ContactData> byId = Comparator.comparingInt(ContactData::getId);
      before.sort(byId);
      after.sort(byId);
      Assert.assertEquals(new HashSet<Object>(after), new HashSet<Object>(before));

    }
  }
}
