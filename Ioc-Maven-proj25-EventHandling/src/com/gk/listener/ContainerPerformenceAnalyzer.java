package com.gk.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class ContainerPerformenceAnalyzer implements ApplicationListener {
private long start,end;
	public ContainerPerformenceAnalyzer() {
	System.out.println("ContainerPerformenceAnalyzer.ContainerPerformenceAnalyzer()");
}
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		// write event handling code
		if(event.toString().contains("Refreshed"))
			start=System.currentTimeMillis();
		else if(event.toString().contains("closed")) {
			end=System.currentTimeMillis();
			System.out.println("Container is in running mode for::"+(end-start)+" ms");
		}
		
	}

}
