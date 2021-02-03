package com.fedex.springboot.microservice.demo.ULDlifecycle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContainerRepository extends 
    JpaRepository<Container, Long>{
  Container findByFromAndTo(String id);
}