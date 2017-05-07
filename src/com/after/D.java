package com.after;

public abstract class D implements I {
	private I core;
	
	public D(I core) {
		this.core = core;
	}
	
	public void doIt() {
		this.core.doIt();
	}
}
