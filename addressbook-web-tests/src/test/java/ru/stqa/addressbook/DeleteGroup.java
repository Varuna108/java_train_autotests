package ru.stqa.addressbook;

import org.testng.annotations.Test;

public class DeleteGroup extends TestBase {



  @Test
  public void testDeleteGroup() throws Exception {
    goToGroupPage();
    selectGroup();
    deleteSelectGroups();
    returnGroupPage();
  }


}
