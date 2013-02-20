package yasu11.t1.input;

import org.lwjgl.input.Mouse;

public class MouseInput {
	
	private int x = Mouse.getX();
	private int y = Mouse.getY();
	
	private boolean leftButtonDown = Mouse.isButtonDown(0); // is left mouse button down.
	private boolean rightButtonDown = Mouse.isButtonDown(1); // is right mouse button down.
	
}
