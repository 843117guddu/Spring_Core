package com.gk.bean;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
@Named("pEngine")
@Primary
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
