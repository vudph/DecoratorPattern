package com.before;

public class AwithY extends A {
	public void doIt() {
		super.doIt();
		this.doY();
	}
	
	public void doY() {
		System.out.print("Y");
	}
}
