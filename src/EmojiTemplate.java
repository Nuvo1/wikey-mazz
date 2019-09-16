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
public class EmojiTemplate extends JFrame
{
    // Define constants to set window dimensions
    public static final int CANVAS_WIDTH  = 500;
    public static final int CANVAS_HEIGHT = 500;

    // Declare an instance of the drawing canvas,
    // which is an inner class called DrawCanvas extending javax.swing.JPanel.
    private DrawCanvas canvas;

    // Constructor to set up the GUI components and event handlers
    public EmojiTemplate()
    {
        canvas = new DrawCanvas();    // Construct the drawing canvas
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

        // Set the Drawing JPanel as the JFrame's content-pane
        Container cp = getContentPane();
        cp.add(canvas);
        // or "setContentPane(canvas);"

        setDefaultCloseOperation(EXIT_ON_CLOSE);   // Handle the CLOSE button
        pack();              // Either pack() the components; or setSize()
        setTitle("My Emoji");  // "super" JFrame sets the title
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
            /*
            Add your emoji code here
             */

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
                new EmojiTemplate(); // Let the constructor do the job
            }
        });
    }
}