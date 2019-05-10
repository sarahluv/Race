/*******************************************************************************
Name: Sarah Redmon
Date: 2/15/19
Instructor: Ms. Tucker
Class: Bug
Purpose: Abstract class of the panel (parent class)
*******************************************************************************
*/

import java.awt.*;
import javax.swing.*;
abstract public class Bug
{

	//***********************************************************************************
	//  Instance variables.  Notice the protected access modifier so that child classes
	//  can directly update the parent data.  
	// 
	//  This is to illustrate it is possible.  A more secure methods is make the items
	//  private and use mutators to update the data even from the child classes.
	//***********************************************************************************
	protected String name;
	protected char direction;
	protected ImageIcon image = new ImageIcon();
	protected int row, column;


	//--------------------------------------------------------------------
	//  Constructor with 3 parameters: Name of bug, image, and direction
	//--------------------------------------------------------------------
	
	public Bug (String name, ImageIcon image, char direction)
	{
		this.name = name;
		this.image = image;
		if (direction == 'D' || direction == 'U' || direction == 'L'  || direction == 'R' )
			this.direction = direction;
		else
			this.direction = '-';
		this.row = 01;
		this.column = 01;
	}
	
	//--------------------------------------------------------------------
	//  Default Constructor - No parameters.  Default values are used for
	//                        instance data.
	//--------------------------------------------------------------------
	public Bug ()
		{	this.name = "";
			this.image = null;
			this.direction = '-';
			this.row = 0;
			this.column = 0;
	}

   	//***********************************************************************************
	//  Accessors
	//***********************************************************************************

	public String getName()
		{ return name; }

	public ImageIcon getImage()
		{ return image; }

	public char getDirection()
		{ return direction; }

	public int getRow()
		{ return row; }

	public int getColumn()
		{ return column; }

	//***********************************************************************************
	//  Mutators
	//***********************************************************************************

	public void setName(String name)
		{	this.name = name;		}

	public void setImage(ImageIcon image)
		{	this.image = image;		}

	public void setDirection(char direction)
		{	if (direction == 'D' || direction == 'U' || direction == 'L'  || direction == 'R' )
				this.direction = direction;
			else
				this.direction = '-';		}


	public void setRow(int row)
		{	if (row >= 0) this.row = row;
			else row= 0;
		}

	public void setColumn(int column)
		{ 	if (column >= 0) this.column = column;
			else column= 0; 
		}

	
		
	//***********************************************************************************
	//  Additional Methods
	//***********************************************************************************

	//-----------------------------------------------------------------------------------------
	//  toString method: Builds information about a Bug
	//-----------------------------------------------------------------------------------------
		
 	public String toString()
	{
		return ("Name: " + name +  "\tPoints: " + direction +  "\nPosition: "+ row + "," + column + "\n");
	}

	//------------------------------------------------------------------------------------------
	//  The following is an abstract method.  A child class will need to override this method.
	//-----------------------------------------------------------------------------------------
	
	public  abstract void move(GridPanel bugGrid);

}

