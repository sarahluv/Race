/*******************************************************************************
Name: Sarah Redmon
Date: 2/15/19
Instructor: Ms. Tucker
Class: Crawler
Purpose: Child Class #3; is the Centipede
*******************************************************************************
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class Crawler extends Bug
{
	//***********************************************************************************
	//  Instance variables
	//***********************************************************************************

	private int legs;

	//***********************************************************************************
	//  Constructors
	//***********************************************************************************

	public Crawler(String name, ImageIcon image, int legs)
	{
	    super(name, image, 'D');
            this.legs = legs;
	}


	//***********************************************************************************
	//  Accessors
	//***********************************************************************************

	public int getLegs()
	{
	    return legs;
	}

	//***********************************************************************************
	//  Mutators
	//***********************************************************************************

	public void setLegs(int  legs)
	{
	    this.legs = legs;
	}


	//***********************************************************************************
	//  Additional Methods
	//***********************************************************************************

	//-----------------------------------------------------------
	//  toString method: Builds information about a Crawler bug
	//-----------------------------------------------------------
	public String toString()
	{
	    String doesItCrawl = "";
	
            if (legs == 100) doesItCrawl = "it DOES crawl.";
		else doesItCrawl = "it does NOT crawl.";
		
            return super.toString() + "and has " + doesItCrawl;
	}

		
	//-----------------------------------------------------------
	//  Overrides Abstract method in Bug Class.  Moves the Crawler
	//  to its new location.
	//-----------------------------------------------------------
	public void move(GridPanel bugGrid)
	{
	    Random generator = new Random();
	    int num = generator.nextInt(3) + 1;
	    if (row < bugGrid.getBoardRows()) 
	    // -----------------------------------------------------
            //  Crawlers move 1 on one (pink), 2 on two (green), & move back 1 on three (blue)
            //-----------------------------------------------------
            bugGrid.addImage(null, row, column);
	    if (num == 1) {
	        row = row + 1;
	    }
	    if (num == 2) {
	        row = row + 2;
	    }
	    if (num == 3) {
	        row = row - 1;
	    }
	    bugGrid.addImage(image, row, column);
	}
}