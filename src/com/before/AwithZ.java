package com.before;

public class AwithZ extends A {
	public void doIt() {
		super.doIt();
		this.doZ();
	}
	
	public void doZ() {
		System.out.print("Z");
	}
}
