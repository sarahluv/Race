/*******************************************************************************
Name: Sarah Redmon
Date: 2/15/19
Instructor: Ms. Tucker
Class: SuperBug
Purpose: Child Class #4; is the Roach
*******************************************************************************
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class SuperBug extends Bug
{
	//***********************************************************************************
	//  Instance variables
	//***********************************************************************************

	private int prickles;

	//***********************************************************************************
	//  Constructors
	//***********************************************************************************

	public SuperBug(String name, ImageIcon image, int prickles)
	{
	    super(name, image, 'D');
            this.prickles = prickles;
	}


	//***********************************************************************************
	//  Accessors
	//***********************************************************************************

	public int getPrickles()
	{
	    return prickles;
	}

	//***********************************************************************************
	//  Mutators
	//***********************************************************************************

	public void setPrickles(int prickles)
	{
	    this.prickles = prickles;
	}


	//***********************************************************************************
	//  Additional Methods
	//***********************************************************************************

	//-----------------------------------------------------------
	//  toString method: Builds information about a Super bug
	//-----------------------------------------------------------
	public String toString()
	{
	    String doesItPrickle = "";
	
            if (prickles == 10) doesItPrickle = "it DOES prickle.";
		else doesItPrickle = "it does NOT prickle.";
		
            return super.toString() + "and has " + doesItPrickle;
	}

		
	//-----------------------------------------------------------
	//  Overrides Abstract method in Bug Class.  Moves the Super bug
	//  to its new location.
	//-----------------------------------------------------------
	public void move(GridPanel bugGrid)
	{
	    Random generator = new Random();
	    int num = generator.nextInt(3) + 1;
	    if (row < bugGrid.getBoardRows()) 
	    // -----------------------------------------------------
            //  Super bugs move 2 on one (pink), 0 on two (green), & move back 1 on three (blue)
            //-----------------------------------------------------
            bugGrid.addImage(null, row, column);
	    if (num == 1) {
	        row = row + 2;
	    }
	    if (num == 2) {
	        row = row + 0;
	    }
	    if (num == 3) {
	        row = row - 1;
	    }
	    bugGrid.addImage(image, row, column);
	}
}