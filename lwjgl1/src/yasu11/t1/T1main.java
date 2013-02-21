package yasu11.t1;

import org.lwjgl.LWJGLException;
import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import yasu11.t1.input.KeyboardInput;
import yasu11.t1.input.MouseInput;
import yasu11.t1.util.glUtil;
 
public class T1main{
 
	int windowWidth = 800;
	int windowHeight = 600;
	
	MouseInput mouse;
	KeyboardInput key;
	
	public void start() {
        try {
	    Display.setDisplayMode(new DisplayMode(windowWidth, windowHeight));
	    Display.create();
	} catch (LWJGLException e) {
	    e.printStackTrace();
	    System.exit(0);
	}
        mouse = new MouseInput();
        key = new KeyboardInput();
        
	// init OpenGL here
        
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity(); // Resets any previous projection matrices
        glOrtho(0, windowWidth, 0, windowHeight, 1, -1);
        glMatrixMode(GL_MODELVIEW);
 
        while (!Display.isCloseRequested()) {
 
        glClear(GL_COLOR_BUFFER_BIT);
        	
        key.pollInput();
	    mouse.pollInput();
        
	    // render OpenGL here
	    
	    setColor(0xff0000);
	    
	    if(key.space == true){
	    	
	    	mouse.grab(true);
	    	Tri(	mouse.x +5  , mouse.y - 25 ,
	    			mouse.x +20 , mouse.y - 10 ,
	    			mouse.x     , mouse.y       );
	    	
	    } else {
	    	mouse.grab(false);
	    	Rectangle(mouse.x+25,mouse.y+25,50,50);	
	    }
	    
	    
	    Display.update();
	}
 
	Display.destroy();
    }
    
	
    
    
    
 
    public static void main(String[] argv) {
    	T1main t1main = new T1main();
	t1main.start();
    }
}