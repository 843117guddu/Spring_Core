package com.gk.bean;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("container")

public abstract class Webcontainer{
	@Lookup
	public abstract RequestHandler getHandler();
	 public void processRequest(String data) {
		 RequestHandler rh=null;
		 System.out.println("Webcontainer recived request having data::"+data+"  for processsing---->"+this.hashCode());
	    rh=getHandler();
		rh.handle(data);
	 }
	

}
