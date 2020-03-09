package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.ContactData;

public class CreateNewContact extends TestBase {

  @Test
  public void testCreateNewContact() throws Exception {
    app.getContactHelper().addNewContact();
    app.getContactHelper().fillNewContactData(new ContactData("alexander", "Junior", "Surname", "Tavitel", "CompanyName"));
    app.getContactHelper().submitNewContact();
    app.getContactHelper().returnHomePage();
  }

}
