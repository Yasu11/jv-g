package yasu11.t1.input;

import org.lwjgl.input.Keyboard;

public class KeyboardInput {

	public boolean w,a,s,d,space;
	
	public void pollInput() {
		w = false;
		a = false;
		s = false;
		d = false;
		space = false;
		
	if (Keyboard.isKeyDown(Keyboard.KEY_SPACE)) {
	    space = true;
	}
 
	while (Keyboard.next()) {
		
	    if (Keyboard.getEventKeyState()) {
	        if (Keyboard.getEventKey() == Keyboard.KEY_A) {
		    System.out.println("A Key Pressed");
		}
		if (Keyboard.getEventKey() == Keyboard.KEY_S) {
		    System.out.println("S Key Pressed");
		}
		if (Keyboard.getEventKey() == Keyboard.KEY_D) {
		    System.out.println("D Key Pressed");
		}
	    } else {
	        if (Keyboard.getEventKey() == Keyboard.KEY_A) {
		    System.out.println("A Key Released");
	        }
	    	if (Keyboard.getEventKey() == Keyboard.KEY_S) {
		    System.out.println("S Key Released");
		}
		if (Keyboard.getEventKey() == Keyboard.KEY_D) {
		    System.out.println("D Key Released");
		   }
	    }
	}
	}
	
}