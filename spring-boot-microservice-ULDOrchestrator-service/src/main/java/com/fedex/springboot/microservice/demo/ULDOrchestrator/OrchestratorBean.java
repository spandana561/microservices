package com.fedex.springboot.microservice.demo.ULDOrchestrator;
import java.math.BigDecimal;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


public class OrchestratorBean {
  private String id;
  private boolean containerFound;


  public OrchestratorBean() {

  }

  public OrchestratorBean(String id, boolean containerFound) {
    //super();
    this.id = id;
    this.containerFound = containerFound;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public boolean getContainerFound() {
    return containerFound;
  }

  public void setContainerFound(boolean containerFound) {
    this.containerFound = containerFound;
  }

}