package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void returnHomePage() {
        click(By.id("logo"));
    }

    public void submitNewContact() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }


    public void fillNewContactData(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("middlename"), contactData.getMiddlename());
        type(By.name("lastname"), contactData.getSurname());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("title"), contactData.getCompany());
    }



    public void addNewContact() {
        click(By.linkText("add new"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void deleteContact() {
        click((By.xpath("//input[@value='Delete']")));
    }

    public void acceptDeleteContact() {
        wd.switchTo().alert().accept();
    }

    public void selectEditContact() {
        click(By.xpath("//img[@alt='Edit']"));
    }

    public void updateContact() {
        click(By.name("update"));
    }
}
