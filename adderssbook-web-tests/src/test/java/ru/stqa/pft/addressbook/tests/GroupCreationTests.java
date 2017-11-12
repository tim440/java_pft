package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.Set;

public class GroupCreationTests extends TestBase {
  @Test
  public void testGroupCreation() {
    int n = 1; // Количество создаваемых групп
    for (int i = 1; i <= n; i++) {

      app.goTo().groupPage();
      Set<GroupData> before = app.group().all();
      GroupData group = new GroupData().withName("test2");
      app.group().create(group);
      Set<GroupData> after = app.group().all();
      Assert.assertEquals(after.size(), before.size() + 1);

group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt());
      before.add(group);

      Assert.assertEquals(new HashSet<Object>(after), new HashSet<Object>(before));
    }
  }
}
