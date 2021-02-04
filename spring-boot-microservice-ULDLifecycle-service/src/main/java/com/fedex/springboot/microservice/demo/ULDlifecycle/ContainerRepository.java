package com.fedex.springboot.microservice.demo.ULDlifecycle;
import org.springframework.stereotype.Repository;


public interface ContainerRepository{
  Container findById(String id);
}