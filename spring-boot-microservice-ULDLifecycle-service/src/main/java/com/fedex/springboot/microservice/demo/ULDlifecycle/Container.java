package com.fedex.springboot.microservice.demo.ULDlifecycle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Container {
  
  @Id
  private String id;
  
  @Column(name="container_status")
  private String status;
  
  @Column(name="container_date_created")
  private String dateCreated;
  
  private int port;
  
  public Container() {
    
  }
  

  public Container(String id, String status, String dateCreated) {
    super();
    this.id = id;
    this.status = status;
    this.dateCreated = dateCreated;
    
  }

  public String getId() {
    return id;
  }

  public String getstatus() {
    return status;
  }

  public String getdatecreated() {
    return dateCreated;
  }
  
  public int getPort() {
    return port;
  }

  public void setPort(int port) {
    this.port = port;
  }

}