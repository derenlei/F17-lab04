package edu.ucsb.cs56.drawings.derenlei.advanced;

import javax.swing.JFrame;

/** A viewer class to see a picture I drew with
 *  simple Java graphics object, namely Ellipse2D.Double
 *
 * @author Deren Lei
 * @version for UCSB CS56, F17
 */

public class MultiPictureViewer
{
   public static void main(String[] args)
   {
       int whichPicture = 1;

       // If user passed a command line argument,
       // get which picture we want to display from the user

       if (args.length== 1) {
	   whichPicture = Integer.parseInt(args[0]);
       }

       JFrame frame = new JFrame();

       // Set the size to whatever size you like (width, height)
       // For projects you turn in, lets not get any bigger than 640,480

       frame.setSize(640,480); // @@@ MODIFY THIS LINE IF YOU LIKE

       // Set your own title
       frame.setTitle("Deren's First Drawing"); // @@@ MODIFY THIS LINE

       // Always do this so that the red X (or red circle) works
       // to close the window.

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // Instantiate your drawing as a "component"

       MultiPictureComponent component =
	   new MultiPictureComponent(whichPicture);

      // Always add your component to the frame
      // and then make the window visible

      frame.add(component);
      frame.setVisible(true);
   }
}
