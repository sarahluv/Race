/*******************************************************************************
Name: Sarah Redmon
Date: 2/15/19
Instructor: Ms. Tucker
Class: BugsDriver
Purpose: Main driver of the GUI; creates the GUI
*******************************************************************************
*/

/*------------------------------------------------------------------------------
    FEEDBACK FROM INSTRUCTOR:
    INHERITANCE - Make sure you validate the new parameters for the child 
    constructors.  Make sure the bugs do not back off the board (row < 0).  
    That is why you were getting run time errors. The remaining 
    portions are very good.

    POLYMORPHISM - Nice illustration of polymorphism when you move the bugs.
------------------------------------------------------------------------------*/

import javax.swing.*;

public class BugsDriver
{
   //-----------------------------------------------------------------
   //  Sets up a frame containing a tabbed pane. The panel on each
   //  tab demonstrates a different layout manager.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Move the Bugs");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      BorderPanel bugsGame = new BorderPanel();


      frame.getContentPane().add(bugsGame);

      frame.pack();
      frame.setVisible(true);
   }
}
