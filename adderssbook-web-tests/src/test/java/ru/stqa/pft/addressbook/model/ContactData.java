package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String name;
  private final String MName;
  private final String LName;
  private final String phone;
  private final String EMail;

  public ContactData(String Name, String MName, String LName, String phone, String EMail) {
   this.name = Name;
    this.MName = MName;
    this.LName = LName;
    this.phone = phone;
    this.EMail = EMail;
  }

  public String getName() {
    return name;
  }

  public String getMName() {
    return MName;
  }

  public String getLName() {
    return LName;
  }

  public String getPhone() {
    return phone;
  }

  public String getEMail() {
    return EMail;
  }
}
