package com.after;

public class Y extends D {

	public Y(I core) {
		super(core);
	}

	public void doIt()  {
        super.doIt();
        doY();
    }

    private void doY() {
        System.out.print('Y');
    }
}
