/*******************************************************************************
Name: Sarah Redmon
Date: 2/15/19
Instructor: Ms. Tucker
Class: BorderPanel
Purpose: Gives the logic of the movements and declaring the winners
*******************************************************************************
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class BorderPanel extends JPanel
{
   //-----------------------------------------------------------------
   //  Panel instance data items. 
   //-----------------------------------------------------------------

   private JPanel buttonPanel = new JPanel();
   private JButton startButton = new JButton("Start the Game");
   private JButton stopButton = new JButton("Stop the Game");
   private JButton moveButton = new JButton("Move the Bugs");
   private ButtonListener listener = new ButtonListener();
   private GridPanel bugGrid;
   private String winner, winnerText;
   private JLabel winnersLabel = new JLabel("WINNER: ");
   
   private final ImageIcon flyerImage = new ImageIcon("Flyer.png");
   private final ImageIcon crawlerImage = new ImageIcon("Crawler.png");
   private final ImageIcon bigCrawlerImage = new ImageIcon("BigCrawler.png");
   private final ImageIcon superBugImage = new ImageIcon("SuperBug.png");
   private final static int BOARD_ROWS = 20;
   private final static int BOARD_COLUMNS = 10;
   
   // ---------------------------------------------------------------------
   //  STUDENTS:  INSTANTIATE CHILD BUG CLASSES BELOW THIS COMMENT
   //----------------------------------------------------------------------
   private simpleBug spider;
   private Flyer fly1, fly2, fly3;
   private Crawler centipede1, centipede2, centipede3;
   private SuperBug roach1, roach2, roach3;  
    
   //---------------------------------------------------------------------
   //  Panel constructor 
   //----------------------------------------------------------------------
   public BorderPanel()

   {
      bugGrid = new GridPanel(BOARD_ROWS, BOARD_COLUMNS);

      //--------------------------------------------------
      // Create a simple panel for the three buttons
      //--------------------------------------------------
      stopButton.addActionListener(listener);
      startButton.addActionListener(listener);
      moveButton.addActionListener(listener);
      buttonPanel.add(startButton);
      buttonPanel.add(stopButton);
      buttonPanel.add(moveButton);

      //--------------------------------------------------
      // Use a BorderLayout for the game
      //--------------------------------------------------

      setLayout(new BorderLayout());
      setBackground(Color.green);

      //--------------------------------------------------
      // Add the buttonPanel and the grid to the
      // BorderPanel
      //--------------------------------------------------
      add(buttonPanel, BorderLayout.NORTH);
      add(bugGrid, BorderLayout.CENTER);
      add(winnersLabel, BorderLayout.SOUTH);
   }


   //--------------------------------------------------
   // Listener for the panel buttons
   //--------------------------------------------------
   private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if (event.getSource() == stopButton) {
                System.exit (0);    }

            if (event.getSource() == startButton) {
    
        
              //------------------------------------------------------------
              // A simple bug is instantiated and placed on the board.
              //------------------------------------------------------------
            
                spider = new simpleBug("Spider", crawlerImage, true);
                spider.setRow(0);
                spider.setColumn(0);
                bugGrid.addImage(crawlerImage,spider.getRow(), spider.getColumn());

              //------------------------------------------------------------
              // STUDENTS:  Create 9 more bugs of various types and place 
              //            on the board.  Make sure you add only bugs 
              //            from the classes you create. Place those statements
              //            below this comment.
              //------------------------------------------------------------
                fly1 = new Flyer("Fly 1", flyerImage, 'D');
                fly1.setRow(0);
                fly1.setColumn(1);
                bugGrid.addImage(flyerImage,fly1.getRow(), fly1.getColumn());

                fly2 = new Flyer("Fly 2", flyerImage, 'D');
                fly2.setRow(0);
                fly2.setColumn(2);
                bugGrid.addImage(flyerImage,fly2.getRow(), fly2.getColumn());

                fly3 = new Flyer("Fly 3", flyerImage, 'D');
                fly3.setRow(0);
                fly3.setColumn(3);
                bugGrid.addImage(flyerImage,fly3.getRow(), fly3.getColumn());

                centipede1 = new Crawler("Centipede 1", bigCrawlerImage, 'D');
                centipede1.setRow(0);
                centipede1.setColumn(4);
                bugGrid.addImage(bigCrawlerImage,centipede1.getRow(), centipede1.getColumn());

                centipede2 = new Crawler("Centipede 2", bigCrawlerImage, 'D');
                centipede2.setRow(0);
                centipede2.setColumn(5);
                bugGrid.addImage(bigCrawlerImage,centipede2.getRow(), centipede2.getColumn());

                centipede3 = new Crawler("Centipede 3", bigCrawlerImage, 'D');
                centipede3.setRow(0);
                centipede3.setColumn(6);
                bugGrid.addImage(bigCrawlerImage,centipede3.getRow(), centipede3.getColumn());

                roach1 = new SuperBug("Roach 1", superBugImage, 'D');
                roach1.setRow(0);
                roach1.setColumn(7);
                bugGrid.addImage(superBugImage,roach1.getRow(), roach1.getColumn());

                roach2 = new SuperBug("Roach 2", superBugImage, 'D');
                roach2.setRow(0);
                roach2.setColumn(8);
                bugGrid.addImage(superBugImage,roach2.getRow(), roach2.getColumn());

                roach3 = new SuperBug("Roach 3", superBugImage, 1);
                roach3.setRow(0);
                roach3.setColumn(9);
                bugGrid.addImage(superBugImage,roach3.getRow(), roach3.getColumn());
            } // end of code for start buttonPanel
            
            
            

            if (event.getSource() == moveButton) {
              //------------------------------------------------------------
              // Sample of moving a simple bug.
              //------------------------------------------------------------
                spider.move(bugGrid);
                if (spider.getRow() >= bugGrid.getBoardRows()) {
                    System.out.println("Spider crossed the finish line");
                    winner = "zero";
                }
    
              //------------------------------------------------------------
              // STUDENTS:  Write code to move your 9 bugs below this comment.
              //
              //-Sets bug to send out message once it crosses the line
              //-Assigns it to a string
              //-Displays winner from a switch statement
              //------------------------------------------------------------
                fly1.move(bugGrid);
                if (fly1.getRow() >= bugGrid.getBoardRows()) {
                    System.out.println("Fly 1 crossed the finish line");
                    winner = "one";
                }

                fly2.move(bugGrid);
                if (fly2.getRow() >= bugGrid.getBoardRows()) {
                    System.out.println("Fly 2 crossed the finish line");
                    winner = "two";
                }

                fly3.move(bugGrid);
                if (fly3.getRow() >= bugGrid.getBoardRows()) {
                    System.out.println("Fly 3 crossed the finish line");
                    winner = "three";
                }

                centipede1.move(bugGrid);
                if (centipede1.getRow() >= bugGrid.getBoardRows()) {
                    System.out.println("Centipede 1 crossed the finish line");
                    winner = "four";
                }
                
                centipede2.move(bugGrid);
                if (centipede2.getRow() >= bugGrid.getBoardRows()) {
                    System.out.println("Centipede 2 crossed the finish line");
                    winner = "five";
                }

                centipede3.move(bugGrid);
                if (centipede3.getRow() >= bugGrid.getBoardRows()) {
                    System.out.println("Centipede 3 crossed the finish line");
                    winner = "six";
                }

                roach1.move(bugGrid);
                if (roach1.getRow() >= bugGrid.getBoardRows()) {
                    System.out.println("Roach 1 crossed the finish line");
                    winner = "seven";
                }
                
                roach2.move(bugGrid);
                if (roach2.getRow() >= bugGrid.getBoardRows()) {
                    System.out.println("Roach 2 crossed the finish line");
                    winner = "eight";
                }

                roach3.move(bugGrid);
                if (roach3.getRow() >= bugGrid.getBoardRows()) {
                    System.out.println("Roach 3 crossed the finish line");
                    winner = "nine";
                }
                
                switch (winner) {
                    case "zero":
                    winnerText = "Spider";
                    break;
                    
                    case "one":
                    winnerText = "Fly 1";
                    break;

                    case "two":
                    winnerText = "Fly 2";
                    break;

                    case "three":
                    winnerText = "Fly 3";
                    break;
                    
                    case "four":
                    winnerText = "Centipede 1";
                    break;

                    case "five":
                    winnerText = "Centipede 2";
                    break;

                    case "six":
                    winnerText = "Centipede 3";
                    break;
                    
                    case "seven":
                    winnerText = "Roach 1";
                    break;

                    case "eight":
                    winnerText = "Roach 2";
                    break;
                    
                    default:
                    winnerText = "Roach 3";
                    break;
                }
                
                winnersLabel.setText("WINNER: " + winnerText);
            }
        }
    }
}