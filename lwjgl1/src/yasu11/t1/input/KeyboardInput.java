package yasu11.t1.input;

import org.lwjgl.input.Keyboard;

public class KeyboardInput {

	public boolean w,a,s,d,r,space;
	
	public void pollInput() {
	/*	w = false;
		a = false;
		s = false;
		d = false;*/
		space = false;
		
	if (Keyboard.isKeyDown(Keyboard.KEY_SPACE)) {
	    space = true;
	}
 
	while (Keyboard.next()) {
		
	    if (Keyboard.getEventKeyState()) {
	        if (Keyboard.getEventKey() == Keyboard.KEY_A) {
		    a = true;
		}
		if (Keyboard.getEventKey() == Keyboard.KEY_S) {
			s = true;
			}
		if (Keyboard.getEventKey() == Keyboard.KEY_D) {
			d = true;
			}
		if (Keyboard.getEventKey() == Keyboard.KEY_R) {
				r = true;
			}
	    } else {
	        if (Keyboard.getEventKey() == Keyboard.KEY_A) {
	        	a = false;
	        }
	    	if (Keyboard.getEventKey() == Keyboard.KEY_S) {
	    		s = false;
		}
		if (Keyboard.getEventKey() == Keyboard.KEY_D) {
			d = false;
		   }if (Keyboard.getEventKey() == Keyboard.KEY_R) {
			r = false;
		   }
	    }
	}
	}
	
}