package yasu11.t1;

import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.glClear;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import yasu11.t1.input.KeyboardInput;
import yasu11.t1.input.MouseInput;
import yasu11.t1.util.CHANNEL;
import yasu11.t1.util.glUtil;
 


public class T1main{

	
	private int windowWidth = 800;
	private int windowHeight = 600;
	
	private MouseInput mouse;
	private KeyboardInput key;
	
	private int clr = 0x0;
	
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
	    
	    clrChange();
	    
	    glUtil.setColor(clr);
	    
	    if(key.space == true){
	    	
	    	mouse.grab(true);
	    	glUtil.Tri(	mouse.x +5  , mouse.y - 25 ,
	    			mouse.x +20 , mouse.y - 10 ,
	    			mouse.x     , mouse.y       );
	    	
	    } else {
	    	mouse.grab(false);
	    	glUtil.Rectangle(mouse.x+25,mouse.y+25,50,50);	
	    }
	    
	    
	    Display.update();
	}
 
	Display.destroy();
    }
    
private int counter = 0;
	
	public void clrChange(){
		
		counter ++;
		
		if (counter>4){
		
		counter = 0;
			
		int i = 0x01;
		
		//Console Output RBG
		System.out.println( glUtil.getChannel(clr, CHANNEL.RED) + " " + glUtil.getChannel(clr, CHANNEL.GREEN) + " " + glUtil.getChannel(clr, CHANNEL.BLUE));
		
		
		if(key.a == true && (glUtil.getChannel(clr, CHANNEL.RED) + i) <= 0xff){
		clr += i << 16;
		}
		if(key.s == true && (glUtil.getChannel(clr, CHANNEL.GREEN) + i) <= (0xff)){
		clr += i << 8;
		}
		if(key.d == true && (glUtil.getChannel(clr, CHANNEL.BLUE) + i) <= (0xff)){
		clr += i;
		}
		
		if(key.r == true){
			clr = 0x0;
		}}
	}
	
	
	
	
 
    public static void main(String[] argv) {
    	T1main t1main = new T1main();
	t1main.start();
    }
}