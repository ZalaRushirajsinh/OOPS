import java.awt.event.*;
import javax.swing.*;

class Login implements ActionListener
{
	JFrame f;
	JLabel u,p,str;
	JTextField u1;
	JPasswordField p1;
	JButton 1,r;
	JCheckBox c;
	Login()
	
	{
		f=new JFrame();
		f.setSize(300,300);
		f.setvisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		u = new JLabel("USERNAME");
		p = new JLabel("PASSWORD");
		u1 = new JTextField(20);
		p1 = new JPasswordField(20);
		l = new JButton("LOGIN");
		r = new JButton("RESET");
		c = new JCheckBox("SHOW PASSWORD");
		str = new JLabel("UNIVERSITY FEES COLLECTION SYSTEM");
		
		str.setBounds(50,80,400,100);
		u.setBounds(50,150,100,30);
		u1.setBounds(155,150,100,30);
		p.setBounds(50,190,100,30);
		p1.setBounds(155,190,100,30);
		c.setBounds(55,220,200,100);
		l.setBounds(50,320,100,30);
		r.setBounds(155,320,100,30);
		
		f.add(u);
		f.add(p);
		f.add(u1);
		f.add(p1);
		f.add(l);
		f.add(r);
		f.add(c);
		f.add(str);
		
		l.addActionListener(this);
		r.addActionListener(this);
		c.addActionListener(this);	
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==1)
		{	
			if(u1.getText().equalsIgnoreCase("rushi") && p1.getText().equalsIgnoreCase("PQR"))
			{
				JOptionPane.showMessageDialog(f,"LOGIN SUCCESSFUL");
			}
			else
				JOptionPane.showMessageDialog(f,"WRONG PASSWORD,TRY AGAIN.");
		}
		if(e.getSource()==r)
		{
			u1.setText("");
			p1.setText("");
		}
		if(e.getSource()==c)
		{
			if(c.isSelected())
				p1.setEchoChar('\u0000');
			else 
				p1.setEchoChar('*');
		}
	}
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable())
	}
}
