package yasu11.t1.util;

import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.GL_TRIANGLES;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glColor3f;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glVertex2f;

public final class glUtil {
	
	
	
	//Draw a Rectangle   -x,y,width,height-
    public static void Rectangle(int x,int y,int w,int h){
    	
    	glBegin(GL_QUADS);
    	glVertex2f(x  , y  );
    	glVertex2f(x-w, y  );
    	glVertex2f(x-w, y-h);
    	glVertex2f(x  , y-h);
    	glEnd();
    	
    }
    
    public static void Tri(int x1,int y1,int x2,int y2,int x3,int y3){
    	
    	glBegin(GL_TRIANGLES);
    	glVertex2f(x1,y1);
    	glVertex2f(x2,y2);
    	glVertex2f(x3,y3);
    	glEnd();
    	
    }
	
    public static void setColor(int col){
    	
    	int cr,cg,cb;   // R G B    	

    	cr = (col & 0xff0000) >> 16;
    	cg = (col & 0x00ff00) >> 8;
    	cb = (col & 0x0000ff) ;
    	
    	
    	glColor3f((float)cr/0xff,(float)cg/0xff,(float)cb/0xff);
    	
    	
    }
    
    // Max   16777215
    // Max R G B  255 255 255
    
public static int getChannel(int col, CHANNEL channel){
    	
		if(channel == CHANNEL.RED)
		{
    	return (col & 0xff0000) >> 16;
    	}
		else if(channel == CHANNEL.GREEN)
		{
    	return (col & 0x00ff00) >> 8;
    	}
		else if(channel == CHANNEL.BLUE)
		{
    	return (col & 0x0000ff) ;
		}
		else {System.out.println("Invalid or no CHANNEL");}
    	
    	return 0;
    }


}
