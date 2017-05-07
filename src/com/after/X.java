package com.after;

public class X extends D {

	public X(I core) {
		super(core);
	}
	
	public void doIt() {
		super.doIt();
		this.doX();
	}
	
	private void doX() {
		System.out.print("X");
	}
}
