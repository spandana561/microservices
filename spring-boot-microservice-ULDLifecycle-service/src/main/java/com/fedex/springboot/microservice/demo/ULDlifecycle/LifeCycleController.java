package com.fedex.springboot.microservice.demo.ULDlifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LifeCycleController {
  
  @Autowired
  private Environment environment;
  
  @Autowired
  private ContainerRepository repository;
  
  @GetMapping("/ULDLifecycle/find/{id}")
  public Container retrieveExchangeValue
    (@PathVariable String id){
    
    Container containerObject = 
        repository.findByFromAndTo(id);
    
    containerObject.setPort(
        Integer.parseInt(environment.getProperty("local.server.port")));
    
    return containerObject;
  }
}