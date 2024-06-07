package org.sunbird.notification.beans;

public class EmailConfig {

  private String fromEmail;
  private String userName;
  private String password;
  private String host;
  private String port;
  private String emailProtocol;

  public EmailConfig(String fromEmail, String userName, String password, String host, String port, String emailProtocol) {
    super();
    this.fromEmail = fromEmail;
    this.userName = userName;
    this.password = password;
    this.host = host;
    this.port = port;
    this.emailProtocol = emailProtocol;
  }

  public EmailConfig() {
    super();
  }

  public String getFromEmail() {
    return fromEmail;
  }

  public void setFromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public String getEmailProtocol() {
    return emailProtocol;
  }

  public void setEmailProtocol(String emailProtocol) {
    this.emailProtocol = emailProtocol;
  }
}
