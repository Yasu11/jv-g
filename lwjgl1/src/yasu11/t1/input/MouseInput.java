package yasu11.t1.input;

import org.lwjgl.input.Mouse;

public class MouseInput {
	
	private int x = Mouse.getX();
	private int y = Mouse.getY();
	
	private boolean leftButtonDown = Mouse.isButtonDown(0); // is left mouse button down.
	private boolean rightButtonDown = Mouse.isButtonDown(1); // is right mouse button down.
	public void pollInput() { 
	    if (Mouse.isButtonDown(0)) {
	    x = Mouse.getX();
	    y = Mouse.getY();
		rightButtonDown = Mouse.isButtonDown(1);
	    System.out.println("MOUSE DOWN @ X: " + x + " Y: " + y);
	    System.out.println("MOUSE DOWN @ X: " + x + " Y: " + y);
	    }	
	}
	
}


