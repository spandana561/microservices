package com.fedex.springboot.microservice.demo.ULDOrchestrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@RestController
public class OrchestratorController {
	
  @Autowired
  private Environment environment;
  
  
  @GetMapping("/ULDOrchestrator/find/{id}")
  public OrchestratorBean retrieveExchangeValue
    (@PathVariable String id){

	    
	  ResponseEntity<OrchestratorBean> responseEntity = new RestTemplate().getForEntity(
		"http://"+environment.getProperty("hostname")+":8000/ULDLifecycle/find/{id}", OrchestratorBean.class,
		id);

	  OrchestratorBean response = responseEntity.getBody();

	  boolean status;

	  if (id.equals(response.getId()))
		  status = true;
	  else 
		  status = false;

	  return new OrchestratorBean(id,status);
	  

  }
}