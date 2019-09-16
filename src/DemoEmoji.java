/* Author:  <YOU>
   Date:    9/2019
   Class:   DemoEmoji.java
   Purpose: Create an emoji that explores Graphics class methods
 */ 

import java.awt.*;       // Using AWT's Graphics and Color
import java.awt.event.*; // Using AWT event classes and listener interfaces
import javax.swing.*;    // Using Swing's components and containers
 
/** Custom Drawing Code Template */
// A Swing application extends javax.swing.JFrame
public class DemoEmoji extends JFrame 
{
   // Define constants to set window dimensions
   public static final int CANVAS_WIDTH  = 500;
   public static final int CANVAS_HEIGHT = 500;
 
   // Declare an instance of the drawing canvas,
   // which is an inner class called DrawCanvas extending javax.swing.JPanel.
   private DrawCanvas canvas;
 
   // Constructor to set up the GUI components and event handlers
   public DemoEmoji() 
   {
      canvas = new DrawCanvas();    // Construct the drawing canvas
      canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
 
      // Set the Drawing JPanel as the JFrame's content-pane
      Container cp = getContentPane();
      cp.add(canvas);
      // or "setContentPane(canvas);"
 
      setDefaultCloseOperation(EXIT_ON_CLOSE);   // Handle the CLOSE button
      pack();              // Either pack() the components; or setSize()
      setTitle("Demo Emoji");  // "super" JFrame sets the title
      setVisible(true);    // "super" JFrame show
   }
 
   /**
    * Define inner class DrawCanvas, which is a JPanel used for custom 
    * drawing.
    */
   private class DrawCanvas extends JPanel 
   {
      // Override paintComponent to perform your own painting
      @Override
      public void paintComponent(Graphics g) 
      {
         super.paintComponent(g);     

         // set background color
         setBackground(Color.ORANGE);
         
         // change color to flesh tone and display face
         g.setColor(new Color(221,160,221));
         g.fillOval(100,100,300,300);          
                                             
         // display whites of eyes                           
         g.setColor(Color.BLACK);
         g.fillOval(170,210,40,60);  
         g.fillOval(290,210,40,60);

         // display nose
         g.setColor(new Color(81, 45, 14));
         g.drawArc(220,280,60,40,0,180);  
                                              
         // display mouth
         g.setColor(Color.BLACK);
         g.fillArc(190, 280, 120, 80, 0, -180);


          // display teeth
          g.setColor(Color.WHITE);
          g.fillRect(225, 320, 20, 20);
          g.fillRect(255, 320, 20, 20);

          // display bowtie
          g.setColor(new Color(5, 12, 33));
          int[] xPointsBowtie = new int[] {170, 330, 330, 170};
          int[] yPointsBowtie = new int[] {380, 450, 380, 450};
          g.fillPolygon(xPointsBowtie, yPointsBowtie, 4);

          // display bowtie "knot"
          g.setColor(Color.LIGHT_GRAY);
          g.fillRect(240, 400, 20, 30);
         
         // display Emoji title text
         g.drawString("Meet Clarence!",5,30);
      }

   }
 
   // The entry main method
   public static void main(String[] args) 
   {
      // Run the GUI codes on the Event-Dispatching thread for thread safety
      SwingUtilities.invokeLater(new Runnable() 
      {
         @Override
         public void run() 
         {
            new DemoEmoji(); // Let the constructor do the job
         }
      });
   }
}