package ru.stqa.pft.addressbook.model;

import java.io.File;

public class ContactData {

  private String MName;
  private String homePhone;
  private String EMail;
  private int id = Integer.MAX_VALUE;
  private String group;
  private String lastname;
  private String firstname;
  //private String homePhone;
  private String mobilePhone;
  private String workPhone;
  private String allPhones;
  private File photo;

  public File getPhoto() {
    return photo;
  }

  public ContactData withPhoto(File photo) {
    this.photo = photo;
    return this;
  }

  public String getAllPhones() {
    return allPhones;
  }

  public ContactData withAllPhones(String allPhones) {
    this.allPhones = allPhones;
    return this;
  }

  public ContactData() {

  }


  public String getMobilePhone() {
    return mobilePhone;
  }

  public String getWorkPhone() {
    return workPhone;
  }

  public ContactData(String firstname, String MName, String lastname, String homePhone, String EMail, String group) {
    this.firstname = firstname;
    this.MName = MName;
    this.lastname = lastname;
    this.homePhone = homePhone;
    this.EMail = EMail;
    this.group = group;
  }

  public ContactData(int id, String firstname, String MName, String lastname, String homePhone, String EMail, String group) {
    this.id = id;
    this.firstname = firstname;
    this.MName = MName;
    this.lastname = lastname;
    this.homePhone = homePhone;
    this.EMail = EMail;
    this.group = group;
  }



  public ContactData(int id, String lastname, String firstname, String homePhone, String mobilePhone, String workPhone) {
    this.id = id;
    this.lastname = lastname;
    this.firstname = firstname;
    this.homePhone = homePhone;
    this.mobilePhone = mobilePhone;
    this.workPhone = workPhone;
  }

  public int getId() {
    return id;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getMName() {
    return MName;
  }

  public String getLastname() {
    return lastname;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public String getEMail() {
    return EMail;
  }



  @Override
  public String toString() {
    return "ContactData{" +
            "firstname='" + firstname + '\'' +
            ", lastname='" + lastname + '\'' +
            ", id=" + id +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    return firstname != null ? firstname.equals(that.firstname) : that.firstname == null;
  }

  @Override
  public int hashCode() {
    return firstname != null ? firstname.hashCode() : 0;
  }


  public ContactData withId(int id) {
    this.id = id;
    return this;
  }
  public ContactData withGroup(String group) {
    this.group = group;
    return this;
  }
  public ContactData withFirstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  public ContactData withLastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  public ContactData withHomePhone(String home) {
    this.homePhone = home;
    return this;
  }

  public ContactData withMobilePhone(String mobile) {
    this.mobilePhone = mobile;
    return this;
  }

  public ContactData withWorkPhone(String work) {
    this.workPhone = work;
    return this;
  }

  public String getGroup() {
    return group;
  }
}
