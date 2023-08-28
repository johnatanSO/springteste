package br.com.springteste.models;

import java.util.Date;

public class Warning {
  public String title;
  public String description;
  public Date createdAt;
  
  public Warning(String title, String description){
    this.title = title;
    this.description = description;
    this.createdAt = new Date();
  }
}
