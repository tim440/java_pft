package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTest extends TestBase {
  @Test
  public void contactDelitionTest() {
    int n = 1; // Количество удаляемых контактов
    for (int i = 1; i <= n; i++) {
      app.getNavigationHelper().gotoHomePage();
      if (!app.getContactHelper().isThereAContact()) {
        app.getContactHelper().createContact(new ContactData("testName", "testMName", "testLName", "89200000000", "testmail@mail.mail", "test1"), true);
      }
      List<ContactData> before = app.getContactHelper().getContactList();
      app.getContactHelper().selectContactCheckbox(before.size() - 1);
      app.getContactHelper().deleteContact();
      app.getNavigationHelper().gotoHomePage();
      List<ContactData> after = app.getContactHelper().getContactList();
      Assert.assertEquals(after.size(), before.size() - 1);

      before.remove(before.size() - 1);

      Assert.assertEquals(after, before);
    }
  }
}
