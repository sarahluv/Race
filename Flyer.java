/*******************************************************************************
Name: Sarah Redmon
Date: 2/15/19
Instructor: Ms. Tucker
Class: Flyer
Purpose: Child Class #2; is the Fly
*******************************************************************************
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class Flyer extends Bug
{
	//***********************************************************************************
	//  Instance variables
	//***********************************************************************************

	private int wings;

	//***********************************************************************************
	//  Constructors
	//***********************************************************************************

	public Flyer(String name, ImageIcon image, int wings)
	{
	    super(name, image, 'D');
            this.wings = wings;
	}


	//***********************************************************************************
	//  Accessors
	//***********************************************************************************

	public int getWings()
	{
	    return wings;
	}

	//***********************************************************************************
	//  Mutators
	//***********************************************************************************

	public void setWings(int wings)
	{
	    this.wings = wings;
	}


	//***********************************************************************************
	//  Additional Methods
	//***********************************************************************************

	//-----------------------------------------------------------
	//  toString method: Builds information about a Flyer bug
	//-----------------------------------------------------------
	public String toString()
	{
	    String doesItFly = "";
	
            if (wings == 2) doesItFly = "it DOES fly.";
		else doesItFly = "it does NOT fly.";
		
            return super.toString() + "and has " + doesItFly;
	}

		
	//-----------------------------------------------------------
	//  Overrides Abstract method in Bug Class.  Moves the Flyer
	//  to its new location.
	//-----------------------------------------------------------
	public void move(GridPanel bugGrid)
	{
	    Random generator = new Random();
	    int num = generator.nextInt(3) + 1;
	    if (row < bugGrid.getBoardRows()) 
	    // -----------------------------------------------------
            //  Flyers move 2 on one (pink), back 1 on two (green), & move 1 on three (blue)
            //-----------------------------------------------------
            bugGrid.addImage(null, row, column);
	    if (num == 1) {
	        row = row + 2;
	    }
	    if (num == 2) {
	        row = row - 1;
	    }
	    if (num == 3) {
	        row = row + 1;
	    }
	    bugGrid.addImage(image, row, column);
	}
}