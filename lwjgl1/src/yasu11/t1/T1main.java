package yasu11.t1;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import yasu11.t1.input.MouseInput;
 
public class T1main{
 
    public void start() {
    	
        try {
	    Display.setDisplayMode(new DisplayMode(800,600));
	    Display.create();
	} catch (LWJGLException e) {
	    e.printStackTrace();
	    System.exit(0);
	}
 
        
	// init OpenGL here
 
	while (!Display.isCloseRequested()) {
 
	    // render OpenGL here
 
	    Display.update();
	}
 
	Display.destroy();
    }
 
    public static void main(String[] argv) {
    	T1main t1main = new T1main();
	t1main.start();
    }
}