package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTest extends TestBase {
  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().groupPage();
    if (app.group().list().size() == 0) {
      app.group().create(new GroupData().withName("test2").withHeader("test2").withFooter("test3"));
    }
  }

  @Test
  public void GroupDelitionTest() {

  //  int n = 3; // Количество удаляемых групп
   // for (int i = 1; i <= n; i++) {

      List<GroupData> before = app.group().list();
      int index = before.size() - 1;
      app.group().delete(index);
      List<GroupData> after = app.group().list();
      Assert.assertEquals(after.size(), before.size() - 1);

      before.remove(index );
      //before.remove(before.size()-1);

      Assert.assertEquals(after, before);

      app.goTo().gotoHomePage();
   // }
  }


}
