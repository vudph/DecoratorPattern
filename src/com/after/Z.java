package com.after;

public class Z extends D {

	public Z(I core) {
		super(core);
	}
	
	public void doIt()  {
        super.doIt();
        doZ();
    }

    private void doZ() {
        System.out.print('Z');
    }
}
