package GUI;
	//********************************************************************
	//PushCounterPanel.java       Java Foundations
	//
	//Demonstrates a graphical user interface and an event listener.
	//********************************************************************

	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

	public class exitExample extends JPanel
	{
	private JButton push;

	//-----------------------------------------------------------------
	//  Constructor: Sets up the GUI.
	//-----------------------------------------------------------------
	public exitExample()
	{

	  push = new JButton("exit");
	  push.addActionListener(new ButtonListener());
	     add(push);
	  

	     setBackground(Color.cyan);
	     setPreferredSize(new Dimension(300, 40));
	  }

	  //*****************************************************************
	  //  Represents a listener for button push (action) events.
	  //*****************************************************************
	  private class ButtonListener implements ActionListener
	  {
	     //--------------------------------------------------------------
	     //  Updates the counter and label when the button is pushed.
	     //--------------------------------------------------------------
	     public void actionPerformed(ActionEvent event)
	     {
	       System.exit(0);
	     }
	  }
	}	
