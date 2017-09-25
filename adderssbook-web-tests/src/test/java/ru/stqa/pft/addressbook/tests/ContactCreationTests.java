package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.TestBase;


public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() {
    app.getContactHelper().initNewContact();
    app.getContactHelper().fillContactForm(new ContactData("testName", "testMName", "testLName", "89200000000", "testmail@mail.mail","test1"),true );
    app.getContactHelper().saveContact();
    app.getNavigationHelper().gotoHomePage();
  }

}
