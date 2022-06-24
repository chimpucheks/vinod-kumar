package com.zensar.springbootdemo.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Endpoint(id="myEndPoint")
@Component
public class MyEndPoint {

	@ReadOperation
	public String sayHello() {
		return "<h2>Hello</h2>";	
		}
		
	@WriteOperation
	public String sayHi() {
	return "<h2>createdBy: vinod kumar   "
			+ "modified: 22jun2022</h2>";
	
}
}

