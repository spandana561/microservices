package com.fedex.springboot.microservice.demo.ULDlifecycle;

import org.springframework.stereotype.Repository;

@Repository
public class ContainerRepositoryImpl implements ContainerRepository{

	@Override
	public Container findById(String id) {
		// TODO Auto-generated method stub
		return new Container("1000", "Open", "Feb 23rd,2020");
	}

}
