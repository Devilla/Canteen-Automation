import java.io.File;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Chef extends JFrame implements ActionListener{
	JButton EXIT;
JPanel panel;
JLabel label,label1,label2,label3,label4,label5,label6,label7;
JLabel background;
FileReader fr;
int i,j,c=0;
String s="",p="",q="",r="",t="",u="";
public void makeGUI()
{
	   try
	   {
       FileReader fr = new FileReader("order.txt"); 
       char [] a = new char[50];
	   fr.read(a);
	   for(i=0;i<50;i++)
	   {
	   if(a[i]!=',')
       s=s+a[i];
	   else
	   {
	   c=i;
	   break;
	   }
       }
		for(j=c+1;j<50;j++)
		{	
		if(a[j]!=',')
			p=p+a[j];
	   else
	   {c=j;
	   break;}
	    }
	for(j=c+1;j<50;j++)
		{	
		if(a[j]!=',')
			q=q+a[j];
	   else
	   {c=j;
	   break;}
	    }
		for(j=c+1;j<50;j++)
		{	
		if(a[j]!=',')
			r=r+a[j];
	   else
	   {c=j;
	   break;}
	    }
	for(j=c+1;j<50;j++)
		{	
		if(a[j]!=',')
			t=t+a[j];
	   else
	   {c=j;
	   break;}
		}
	for(j=c+1;j<50;j++)
		{	
		if(a[j]!=',')
			u=u+a[j];
	   else
	   {c=j;
	   break;}
		}
	}catch(Exception asa){}
     background = new JLabel((new ImageIcon("C:\\Users\\Devender\\Documents\\NetBeansProjects\\Canteen Automation\\src\\Chef.jpg")));
	  panel=new JPanel(new GridBagLayout());
	 
	   GridBagConstraints c = new GridBagConstraints();
	    c.gridx=500;
	    c.gridy=0;
	   panel.add(background,c);
	     
	JFrame f = new Chef();
	label = new JLabel("WELCOME CHEF");
	label.setFont(new Font("Tahoma", 1, 20));
	
	f.add(label,BorderLayout.NORTH);
	
	c.insets = new Insets(20,20,20,20);
	c.gridx=60;
	c.gridy=7;
	
		
	label1 = new JLabel();
	label1.setText("ORDERS");
	label1.setFont(new Font("Tahoma", 1, 18));
	panel.add(label1,c);
	
	c.gridx=60;
	c.gridy=8;
	label2 = new JLabel();
	label2.setText(s);
	panel.add(label2,c);
	
		c.gridx=60;
	c.gridy=9;
	label3 = new JLabel();
	label3.setText(p);
	panel.add(label3,c);
	
	c.gridx=60;
	c.gridy=10;
	label4 = new JLabel();
	label4.setText(q);
	panel.add(label4,c);
	
	c.gridx=60;
	c.gridy=11;
	label5 = new JLabel();
	label5.setText(r);
	panel.add(label5,c);
	
	c.gridx=60;
	c.gridy=12;
	label6 = new JLabel();
	label6.setText(t);
	panel.add(label6,c);
	f.add(panel);
	
	c.gridx=60;
	c.gridy=13;
	label7 = new JLabel();
	label7.setText(u);
	panel.add(label7,c);
	f.add(panel);
	
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	f.setUndecorated(true);
	f.getContentPane().setBackground(Color.GREEN);
	EXIT =new JButton("LOGOUT");
		
		c.gridx=60;
	c.gridy=14;
		EXIT.setBackground(Color.YELLOW);
		EXIT.setForeground(Color.BLACK);
		EXIT.addActionListener(this);
		 panel.add(EXIT,c);
		 panel.setOpaque(false);

	f.setVisible(true);
	
	
	
}
	
public static void main(String a[])
{
	Chef f = new Chef();
	f.makeGUI();
}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==EXIT)
	{
		Login lo = new Login();
		lo.makeGUI();
	}
}
}
