package ru.stqa.addressbook;

import java.util.concurrent.TimeUnit;

import io.github.cdimascio.dotenv.Dotenv;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateNewContact extends TestBase {

  @Test
  public void testCreateNewContact() throws Exception {
    addNewContact();
    fillNewContactData(new ContactData("alexander", "Junior", "Surname", "Tavitel", "CompanyName"));
    submitNewContact();
    returnHomePage();
  }

}
