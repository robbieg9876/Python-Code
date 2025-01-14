package GUI;
//********************************************************************
//QuoteOptions.java       Java Foundations
//
//Demonstrates the use of radio buttons.
//********************************************************************

import javax.swing.JFrame;

public class QuoteOptions
{
//-----------------------------------------------------------------
//  Creates and presents the program frame.
//-----------------------------------------------------------------
public static void main(String[] args)
{
  JFrame frame = new JFrame("Quote Options");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  frame.getContentPane().add(new QuoteOptionsPanel());

  frame.pack();
  frame.setVisible(true);
}
}
