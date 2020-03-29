package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.ContactData;

public class CreateNewContact extends TestBase {

  @Test
  public void testCreateNewContact() {
    app.getContactHelper().createContact(new ContactData("alexander", "Junior",
            null, null, "CompanyName", "test1"), true);
    app.getNavigationHelper().returnHomePage();
  }

}
