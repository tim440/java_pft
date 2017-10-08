package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.TestBase;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class GroupCreationTests extends TestBase {
  @Test
  public void testGroupCreation() {
    int n = 1; // Количество создаваемых групп
    for (int i = 1; i <= n; i++) {

      app.getNavigationHelper().gotoGroupPage();
      List<GroupData> before = app.getGroupHelper().getGroupList();
      GroupData group = new GroupData("test" + i, "test2", "test3");
      app.getGroupHelper().createGroup(group);
      List<GroupData> after = app.getGroupHelper().getGroupList();
      Assert.assertEquals(after.size(), before.size() + 1);


      before.add(group);
      Comparator<? super GroupData> byId = Comparator.comparingInt(GroupData::getId);
      before.sort(byId);
      after.sort(byId);
      Assert.assertEquals(new HashSet<Object>(after), new HashSet<Object>(before));
    }
  }
}
