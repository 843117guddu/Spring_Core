package com.gk.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@PropertySource(value= {"com/gk/commos/info.properties","com/gk/commos/info1.properties"})
@Scope
public class Vechicle {
	@Value("${vehicle.type}")
	private String type;
	@Autowired
	private Engine engg;
	public void jounery(String startPlace,String endPlace) {
	System.out.println("Vechicle.jounery() started from="+startPlace);
	engg.start();
	System.out.println("Vechicle.jounery() is going on of type="+type);
	
	System.out.println("Vechicle.jounery() End at="+endPlace);
	engg.stop();
	}

}
