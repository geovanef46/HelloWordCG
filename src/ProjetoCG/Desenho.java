/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoCG;




import com.jogamp.newt.event.MouseEvent;
import com.jogamp.newt.event.MouseListener;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.glu.GLU;
import java.awt.Point;
import java.util.Vector;


public class Desenho implements GLEventListener, MouseListener{
Window window = new Window();
float[] arrayCoord;
GLAutoDrawable Drawable;
   GLU glu = new GLU();
   static final int screenWidth = 500;         // width of the screen window in pixels
   static final int screenHeight = 500;
   private Vector<Point> points;
   private int mode;

    public Desenho() {
      super();
      points = new Vector<Point>();
      mode = GL2.GL_LINE_STRIP;
    }
   
   
   public void display(GLAutoDrawable drawable) {
       
      final GL2 gl = drawable.getGL().getGL2();
      
       gl.glColor3f(0, 0, 0);// setColorLines
       Drawable = drawable;
    
       window.iniciaPlanoXY(gl);//desenha o planoXY
      
       gl.glBegin (GL2.GL_LINES);

   if(window.clicked){
       arrayCoord = window.repassaCoordenadas();
   gl.glVertex3f( arrayCoord[0], arrayCoord[1], arrayCoord[2]);
   }

   gl.glEnd();
         //gl.glPointSize(10f);
      gl.glBegin (GL2.GL_POINTS);
      gl.glVertex3f(0.5f,0.5f, 0);
      gl.glEnd();
      
////  Triangulo
//         //drawing the base
//      gl.glBegin (GL2.GL_LINES);
//      gl.glVertex3f(-0.50f, -0.50f, 0);
//      gl.glVertex3f(0.50f, -0.50f, 0);
//      gl.glEnd();
//   
//      //drawing the right edge
//      gl.glBegin (GL2.GL_LINES);
//      gl.glVertex3f(0f, 0.50f, 0);
//      gl.glVertex3f(-0.50f, -0.50f, 0);
//      gl.glEnd();
//   
//      //drawing the lft edge
//      gl.glBegin (GL2.GL_LINES);
//      gl.glVertex3f(0f, 0.50f, 0);
//      gl.glVertex3f(0.50f, -0.50f, 0);
//      gl.glEnd();
//      gl.glFlush();

   }
            
 
   public void dispose(GLAutoDrawable arg0) {
     
   }
  
   public void init(GLAutoDrawable arg0) {
       GL gl = arg0.getGL().getGL2();
      gl.glClearColor(1.0f,1.0f,1.0f,0.0f);
      gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
   }
	
   public static void main(String[] args) {
      
      
      Desenho l = new Desenho();
      
      l.window.gLCanvas.addGLEventListener(l);
      if(l.window.clicked){
          l.display(l.Drawable);
      }
      l.window.setVisible(true);
      
   }//end of main

public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
	// TODO Auto-generated method stub
	
}

    @Override
    public void mouseClicked(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseWheelMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}