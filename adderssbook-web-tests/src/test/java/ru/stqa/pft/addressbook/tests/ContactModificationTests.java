package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.TestBase;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {
  @Test
  public void contactModificationTest() {
    app.getNavigationHelper().gotoHomePage();
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("testName", "testMName", "testLName", "89200000000", "testmail@mail.mail", "test1"), true);
    }
    app.getContactHelper().selectContactCheckbox();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("testName", "testMName", "testLName", "89200000000", "testmail@mail.mail", null), false);
    app.getContactHelper().updateContactDate();
  }
}
