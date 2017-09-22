package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.TestBase;

public class ContactDeletionTest extends TestBase {


  @Test
  public void contactDelitionTest() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContactCheckbox();
    app.getContactHelper().deleteContact();
    app.getNavigationHelper().gotoHomePage();
  }

}
