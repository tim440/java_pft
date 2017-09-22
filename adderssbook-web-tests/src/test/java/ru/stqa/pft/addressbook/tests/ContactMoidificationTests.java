package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.TestBase;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactMoidificationTests extends TestBase {
  @Test
  public void contactModificationTest() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContactCheckbox();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillNewContact(new ContactData("testName", "testMName", "testLName", "89200000000", "testmail@mail.mail"));
    app.getContactHelper().updateContactDate();

  }

}
