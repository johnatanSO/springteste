package br.com.springteste.models;

import java.util.Date;

public class Warning {
  public String title;
  public String description;
  public Date createdAt;
  public String _id;
  
  public Warning(String title, String description){
    this.title = title;
    this.description = description;
    this.createdAt = new Date();
  }

  public String getId(){
    return _id;
  }

  public String getTitle(){
    return title;
  }

  public String getDescription(){
    return description;
  }

  public Date getCreatedAt(){
    return createdAt;
  }
}
