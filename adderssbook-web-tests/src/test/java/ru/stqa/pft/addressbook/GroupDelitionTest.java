package ru.stqa.pft.addressbook;


import org.testng.annotations.Test;


public class GroupDelitionTest extends TestBase {


  @Test
  public void GroupDelitionTest() {
    gotoGroupPage();

    selectGroup();
    deleteSelectedGroups();
    gotoHomePage();
  }

}
