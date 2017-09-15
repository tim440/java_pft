package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupContact;
import ru.stqa.pft.addressbook.TestBase;


public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() {
    app.initNewContact();
    app.fillNewContact(new GroupContact("testName", "testMName", "testLName", "89200000000", "testmail@mail.mail"));
    app.saveContact();
    app.gotoHomePage();
  }

}
