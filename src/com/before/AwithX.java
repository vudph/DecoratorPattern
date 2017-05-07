package com.before;

public class AwithX extends A {
	public void doIt() {
		super.doIt();
		this.doX();
	}
	
	public void doX() {
		System.out.print("X");
	}
}
