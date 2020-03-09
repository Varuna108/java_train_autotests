package ru.stqa.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String middlename;
    private final String surname;
    private final String nickname;
    private final String company;

    public ContactData(String firstname, String middlename, String surname, String nickname, String company) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.surname = surname;
        this.nickname = nickname;
        this.company = company;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getSurname() {
        return surname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCompany() {
        return company;
    }
}
