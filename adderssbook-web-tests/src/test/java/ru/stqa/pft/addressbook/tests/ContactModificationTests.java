package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTests extends TestBase {
  @Test
  public void contactModificationTest() {
    app.goTo().gotoHomePage();
    if (!app.contact().isThereAContact()) {
      app.contact().createContact(new ContactData("testName", "testMName", "testLName", "89200000000", "testmail@mail.mail", "test1"), true);
    }
    List<ContactData> before = app.contact().allm();
    app.contact().selectContactCheckbox(before.size() - 1);
    app.contact().initContactModification();
    ContactData contact = new ContactData(before.get(before.size() - 1).getId(), "testName", "testMName", "testLName", "89200000000", "testmail@mail.mail", null);
    app.contact().fillContactForm(contact, false);
    app.contact().updateContactDate();
    app.goTo().gotoHomePage();
    List<ContactData> after = app.contact().allm();

    Assert.assertEquals(after.size(), before.size());

    before.remove(before.size() - 1);
    before.add(contact);
    Comparator<? super ContactData> byId = Comparator.comparingInt(ContactData::getId);
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(after, before);

  }
}
