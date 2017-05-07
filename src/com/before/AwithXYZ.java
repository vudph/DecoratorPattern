package com.before;

public class AwithXYZ extends AwithX {
	private AwithY objY = new AwithY();
	private AwithZ objZ = new AwithZ();
	
	public void doIt() {
		super.doIt();
		objY.doY();
		objZ.doZ();
	}
}
