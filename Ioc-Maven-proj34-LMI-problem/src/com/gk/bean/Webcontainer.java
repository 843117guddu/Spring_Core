package com.gk.bean;

public class Webcontainer {
	private RequestHandler rh;
	
	public Webcontainer(RequestHandler rh) {
		System.out.println("Webcontainer.Webcontainer()::1-pram constructor");
		this.rh=rh;
	}
	 public void prcessRequest(String data) {
		 System.out.println("Webcontainer recived request having data::"+data+"  for processsing---->"+this.hashCode());
	rh.handle(data);
	 }

}
