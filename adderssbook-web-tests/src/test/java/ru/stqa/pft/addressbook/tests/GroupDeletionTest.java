package ru.stqa.pft.addressbook.tests;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

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

    Groups before = app.group().all();
    GroupData deletedGroup = before.iterator().next();
    app.group().delete(deletedGroup);
    assertThat(app.group().count(),equalTo( before.size() - 1));
    Groups after = app.group().all();
    //before.remove(before.size()-1);
assertThat(after, equalTo(before.without(deletedGroup)));
    app.goTo().gotoHomePage();
    // }
  }


}
