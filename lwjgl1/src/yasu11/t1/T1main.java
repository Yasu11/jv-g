package yasu11.t1;

import org.lwjgl.LWJGLException;
import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import yasu11.t1.input.KeyboardInput;
import yasu11.t1.input.MouseInput;
 
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
        glOrtho(0, windowWidth, windowHeight, 0, 1, -1);
        glMatrixMode(GL_MODELVIEW);
 
        while (!Display.isCloseRequested()) {
 
        glClear(GL_COLOR_BUFFER_BIT);
        	
        key.pollInput();
	    mouse.pollInput();
        
	    // render OpenGL here
	    
	    glColor3f(1,0,0);
	    
	    if(key.space == true){
	    	
	    	mouse.grab(true);
	    	Tri(	mouse.x +5  , windowHeight-mouse.y + 25 ,
	    			mouse.x +20 , windowHeight-mouse.y + 10 ,
	    			mouse.x     , windowHeight-mouse.y       );
	    	
	    } else {
	    	mouse.grab(false);
	    	Rectangle(mouse.x+25,mouse.y+25,50,50);	
	    }
	    
	    
	    Display.update();
	}
 
	Display.destroy();
    }
    
	//Draw a Rectangle   -x,y,width,height-
    public void Rectangle(int x,int y,int w,int h){
    	
    	glBegin(GL_QUADS);
    	glVertex2f(x  ,windowHeight-y  );
    	glVertex2f(x-w,windowHeight-y  );
    	glVertex2f(x-w,windowHeight-y+h);
    	glVertex2f(x  ,windowHeight-y+h);
    	glEnd();
    	
    }
    
    public void Tri(int x1,int y1,int x2,int y2,int x3,int y3){
    	
    	glBegin(GL_TRIANGLES);
    	glVertex2f(x1,y1);
    	glVertex2f(x2,y2);
    	glVertex2f(x3,y3);
    	glEnd();
    	
    }
	
 
    public static void main(String[] argv) {
    	T1main t1main = new T1main();
	t1main.start();
    }
}