/*******************************************************************************
Name: Sarah Redmon
Date: 2/15/19
Instructor: Ms. Tucker
Class: simpleBug
Purpose: Child Class #1; is the Spider
*******************************************************************************
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class simpleBug extends Bug
{

	//***********************************************************************************
	//  Instance variables
	//***********************************************************************************

	private boolean stings;

	//***********************************************************************************
	//  Constructors
	//***********************************************************************************

	public simpleBug(String name, ImageIcon image,  boolean stings)
	{		super(name, image, 'D');
			this.stings = stings;
	}


	//***********************************************************************************
	//  Accessors
	//***********************************************************************************

	public boolean getStings()
	{ return stings;
	}

	//***********************************************************************************
	//  Mutators
	//***********************************************************************************

	public void setStings(boolean stings)
	{ 	this.stings = stings;
	}


	//***********************************************************************************
	//  Additional Methods
	//***********************************************************************************

	//-----------------------------------------------------------
	//  toString method: Builds information about a Simple bug
	//-----------------------------------------------------------
	public String toString()
	{	String doesItSting = "";
	
		if (stings) doesItSting = "it DOES sting.";
		else doesItSting = "it does NOT sting.";
		
		return super.toString() + "and has " + doesItSting;
	}

		
	//-----------------------------------------------------------
	//  Overrides Abstract method in Bug Class.  Moves the Simple bug
	//  to its new location.
	//-----------------------------------------------------------
	public void move(GridPanel bugGrid)
	{	Random generator = new Random();
		if (row < bugGrid.getBoardRows()) 
								
		   // -----------------------------------------------------
		   //  Simple bug mover randomly, 0-3 spaces
		   //-----------------------------------------------------
	
		 bugGrid.addImage(null, row, column);
		 row++;
		 bugGrid.addImage(image, row, column);

   }

}