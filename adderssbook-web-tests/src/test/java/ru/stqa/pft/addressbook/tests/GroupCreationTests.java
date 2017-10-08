package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.TestBase;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupCreationTests extends TestBase {
  @Test
  public void testGroupCreation() {
    int n = 3; // Количество создаваемых групп
    for (int i = 0; i <= n; i++) {

      app.getNavigationHelper().gotoGroupPage();
      List<GroupData> before = app.getGroupHelper().getGroupList();
      app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
      List<GroupData> after = app.getGroupHelper().getGroupList();
      Assert.assertEquals(after.size(), before.size() + 1);
    }
  }
}
