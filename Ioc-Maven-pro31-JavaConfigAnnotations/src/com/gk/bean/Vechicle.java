package com.gk.bean;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
@Named("vehicle")
@Scope
public class Vechicle {
	@Value("${vehicle.type}")
	private String type;
	
	  @Inject
	  
	 // @Named("pEngine")
	 
	//@Resource(name="pEngine")
	private Engine engg;
	public void jounery(String startPlace,String endPlace) {
	System.out.println("Vechicle.jounery() started from="+startPlace);
	System.out.println(engg);
	engg.start();
	System.out.println("Vechicle.jounery() is going on of type="+type);
	
	System.out.println("Vechicle.jounery() End at="+endPlace);
	engg.stop();
	}

}
