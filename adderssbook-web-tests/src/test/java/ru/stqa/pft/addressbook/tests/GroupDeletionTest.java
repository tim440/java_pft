package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Set;

public class GroupDeletionTest extends TestBase {
  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().groupPage();
    if (app.group().all().size() == 0) {
      app.group().create(new GroupData().withName("test2").withHeader("test2").withFooter("test3"));
    }
  }

  @Test
  public void GroupDelitionTest() {

    //  int n = 3; // Количество удаляемых групп
    // for (int i = 1; i <= n; i++) {

    Set<GroupData> before = app.group().all();
    GroupData deletedGroup = before.iterator().next();
    app.group().delete(deletedGroup);
    Set<GroupData> after = app.group().all();
    Assert.assertEquals(after.size(), before.size() - 1);

    before.remove(deletedGroup);
    //before.remove(before.size()-1);

    Assert.assertEquals(after, before);

    app.goTo().gotoHomePage();
    // }
  }


}
