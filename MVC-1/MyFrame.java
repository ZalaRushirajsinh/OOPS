package p1;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame extends Frame
{
	Checkbox c1,c2,c3;
	Font
	MyActionListener ml = new MyActionListener(this);
	MyFrame()
	{
		super("My Test Application");
		setLayout(null);
		setBounds(0,0,1260,1000);
		
		c1 = new Checkbox("ICT");
		c2 = new Checkbox("OOP");
		c3 = new Checkbox("IWT");
		
		add(c1);
		add(c2);
		add(c3);
		
		c1.setbounds(100,100,400,100);
		c2.setbounds(100,300,400,100);
		c3.setbounds(100,500,400,100);
		
		f1 = new Font("TIMES",Font.BOLD,20);
		
		c1.setFont(f1)
		c2.setFont(f1)
		c3.setFont(f1)
		
		c1.addItemListener(ml);
		c2.addItemListener(ml);
		c3.addItemListener(ml);


		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
	}
	public static void main(String args[])
	{
	
	}
}