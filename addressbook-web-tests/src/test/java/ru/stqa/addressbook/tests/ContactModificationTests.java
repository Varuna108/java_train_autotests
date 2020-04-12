package ru.stqa.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        int before = app.getContactHelper().getContactCount();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("alexander", "Junior",
                    null, null, "CompanyName", "test1"), true);
        }
        app.getNavigationHelper().returnHomePage();
        app.getContactHelper().selectEditContact();
        app.getContactHelper().fillNewContactData(new ContactData("_modification test", "_modification test", "_modification test", "_modification test", "_modification test", null), false);
        app.getContactHelper().updateContact();
        app.getNavigationHelper().returnHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before);

    }
}
