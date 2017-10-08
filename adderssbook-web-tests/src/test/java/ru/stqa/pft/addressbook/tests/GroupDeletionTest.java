package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.TestBase;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTest extends TestBase {
  @Test
  public void GroupDelitionTest() {

    int n = 1; // Количество удаляемых групп
    for (int i = 1; i <= n; i++) {
      app.getNavigationHelper().gotoGroupPage();

      if (!app.getGroupHelper().isThereAGroup()) {
        app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
      }
      List<GroupData> before = app.getGroupHelper().getGroupList();
      app.getGroupHelper().selectGroup(before.size() - 1);
      app.getGroupHelper().deleteSelectedGroups();
      app.getNavigationHelper().gotoGroupPage();
      List<GroupData> after = app.getGroupHelper().getGroupList();
      Assert.assertEquals(after.size(), before.size() - 1);

      before.remove(before.size() - 1);
      //before.remove(before.size()-1);

      Assert.assertEquals(after, before);

      app.getNavigationHelper().gotoHomePage();
    }
  }
}
