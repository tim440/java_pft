package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String name;
  private final String MName;
  private final String LName;
  private final String phone;
  private final String EMail;
  private int id;
  private String group;


  public ContactData(String Name, String MName, String LName, String phone, String EMail, String group) {
    this.name = Name;
    this.MName = MName;
    this.LName = LName;
    this.phone = phone;
    this.EMail = EMail;

    this.group = group;
  }

  public ContactData(int id, String Name, String MName, String LName, String phone, String EMail, String group) {
    this.id = id;
    this.name = Name;
    this.MName = MName;
    this.LName = LName;
    this.phone = phone;
    this.EMail = EMail;
    this.group = group;
  }

  public int getId() {
    return id;
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

  public String getGroup() {
    return group;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "name='" + name + '\'' +
            ", LName='" + LName + '\'' +
            ", id=" + id +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    return name != null ? name.equals(that.name) : that.name == null;
  }

  @Override
  public int hashCode() {
    return name != null ? name.hashCode() : 0;
  }


}
