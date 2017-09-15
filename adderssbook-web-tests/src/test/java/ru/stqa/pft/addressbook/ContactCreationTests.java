package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;


public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() {
    initNewContact();
    fillNewContact(new GroupContact("testName", "testMName", "testLName", "89200000000", "testmail@mail.mail"));
    saveContact();
    gotoHomePage();
  }

}
