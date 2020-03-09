package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteGroup extends TestBase {



  @Test
  public void testDeleteGroup() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectGroups();
    app.getGroupHelper().returnGroupPage();
  }


}
