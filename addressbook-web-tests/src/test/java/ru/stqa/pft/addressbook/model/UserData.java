package ru.stqa.pft.addressbook.model;

public class UserData {
  private final String userName;
  private final String userSoName;
  private final String userAddress;
  private final String userEmail;

  public UserData(String userName, String userSoName, String userAddress, String userEmail) {
    this.userName = userName;
    this.userSoName = userSoName;
    this.userAddress = userAddress;
    this.userEmail = userEmail;
  }

  public String getUserName() {
    return userName;
  }

  public String getUserSoName() {
    return userSoName;
  }

  public String getUserAddress() {
    return userAddress;
  }

  public String getUserEmail() {
    return userEmail;
  }
}
