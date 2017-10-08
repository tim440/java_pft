package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.TestBase;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class ContactCreationTests extends TestBase {
  @Test
  public void testContactCreation() {
    int n = 1; // Количество создаваемых контактов
    for (int i = 1; i <= n; i++) {
      app.getNavigationHelper().gotoHomePage();
      List<ContactData> before = app.getContactHelper().getContactList();
      app.getContactHelper().initNewContact();
      ContactData contact = new ContactData("testName", "testMName", "testLName", "89200000000", "testmail@mail.mail", "test1");
      app.getContactHelper().fillContactForm(contact, true);
      app.getContactHelper().saveContact();
      app.getNavigationHelper().gotoHomePage();
      List<ContactData> after = app.getContactHelper().getContactList();
      Assert.assertEquals(after.size(), before.size() + 1);

      before.add(contact);

      Comparator<? super ContactData> byId = Comparator.comparingInt(ContactData::getId);
      before.sort(byId);
      after.sort(byId);
      Assert.assertEquals(new HashSet<Object>(after), new HashSet<Object>(before));

    }
  }
}
