package yasu11.t1.util;

import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.GL_TRIANGLES;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glColor3f;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glVertex2f;

public class glUtil {
	
	//Draw a Rectangle   -x,y,width,height-
    public void Rectangle(int x,int y,int w,int h){
    	
    	glBegin(GL_QUADS);
    	glVertex2f(x  , y  );
    	glVertex2f(x-w, y  );
    	glVertex2f(x-w, y-h);
    	glVertex2f(x  , y-h);
    	glEnd();
    	
    }
    
    public void Tri(int x1,int y1,int x2,int y2,int x3,int y3){
    	
    	glBegin(GL_TRIANGLES);
    	glVertex2f(x1,y1);
    	glVertex2f(x2,y2);
    	glVertex2f(x3,y3);
    	glEnd();
    	
    }
	
    public void setColor(int col){
    	
    	int cr,cg,cb;   // R G B    	

    	cr = (col & 0xff0000) >> 4;
    	cg = (col & 0x00ff00) >> 2;
    	cb = (col & 0x0000ff);
    	
    	
    	glColor3f(cr/255,cg/255,cb/255);
    	
    	
    }
}
