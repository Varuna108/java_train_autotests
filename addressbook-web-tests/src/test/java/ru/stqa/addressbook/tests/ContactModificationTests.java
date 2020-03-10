package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getContactHelper().selectEditContact();
        app.getContactHelper().fillNewContactData(new ContactData("_modification test", "_modification test", "_modification test", "_modification test", "_modification test"));
        app.getContactHelper().updateContact();
        app.getContactHelper().returnHomePage();

    }
}
