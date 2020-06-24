package com.gk.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("pEngine")
public class PetrolEngine implements Engine {
	@Value("${engine.petrol.id}")
	private long engineId;
	@Override
	public void start() {
System.out.println("PetrolEngine.start() with eingineIf"+engineId);

	}

	@Override
	public void stop() {
	System.out.println("PetrolEngine.stop()");

	}

}
