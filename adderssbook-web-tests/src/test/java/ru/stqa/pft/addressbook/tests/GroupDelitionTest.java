package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.TestBase;


public class GroupDelitionTest extends TestBase {


  @Test
  public void GroupDelitionTest() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getNavigationHelper().gotoHomePage();
  }

}
