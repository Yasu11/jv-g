package yasu11.t1.input;

import org.lwjgl.input.Mouse;

public class MouseInput {
	
	public int x = Mouse.getX();
	public int y = Mouse.getY();
	public boolean grabed = false;
	
	private boolean leftButtonDown = Mouse.isButtonDown(0); // is left mouse button down.
	private boolean rightButtonDown = Mouse.isButtonDown(1); // is right mouse button down.
	
	public void pollInput() { 
		
	    x = Mouse.getX();
	    y = Mouse.getY();
		
	    if (Mouse.isButtonDown(0)) {
		rightButtonDown = Mouse.isButtonDown(1);
	    System.out.println("MOUSE DOWN @ X: " + x + " Y: " + y);
	    System.out.println("MOUSE DOWN @ X: " + x + " Y: " + y);
	    }	
	    
	    
	    
	}
	
	public int getX(){
		return Mouse.getX();
	}
	
	public int getY(){
		return Mouse.getY();
	}
	
	public void grab(boolean val){
		grabed = val;
		Mouse.setGrabbed(grabed);
		
	}
	
}


