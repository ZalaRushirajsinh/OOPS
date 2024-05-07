import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyActionListener implements ItemListener
{
	MyFrame mf;
	
	MyActionListener(MyFrame m)
	{
		this.mf = m;
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getStateChanged()==e ,SELECTED)
		{
			System.out.println(e.getItem().toString() +"IS SELECTED");
		}
		else
		{
			System.out.println(e.getItem().toString() +"IS DESELECTED");
		}
		System.out.println(e.getItem().toString()+ ":" +e.getStateChanged());
		System.out.println(e.SELECTED + ":" +e.DESELECTED);
		
	}
}