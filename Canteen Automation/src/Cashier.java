import java.io.File;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Cashier extends JFrame implements ActionListener{
	JButton EXIT;
JPanel panel;
JLabel label ,label21,label1,label2,label3,label4,label5,label6,label7,label212,label31,label41,label51,label61,label71,labela;
JLabel background;
FileReader fr;
int i,j,c=0;
String s="",p="",q="",r="",t="",u="",ss="",pp="",qq="",rr="",tt="",uu="";
public void makeGUI()
{

  try
	   {
       FileReader fr = new FileReader("bill.txt"); 
       char [] a = new char[500];
	   fr.read(a);
	   for(i=0;i<500;i++)
	   {
	   if(a[i]!=',')
       s=s+a[i];
	   else
	   {
	   c=i;
	   break;
	   }
       }
		for(j=c+1;j<500;j++)
		{	
		if(a[j]!=',')
			p=p+a[j];
	   else
	   {c=j;
	   break;}
	    }
	for(j=c+1;j<500;j++)
		{	
		if(a[j]!=',')
			q=q+a[j];
	   else
	   {c=j;
	   break;}
	    }
		for(j=c+1;j<500;j++)
		{	
		if(a[j]!=',')
			r=r+a[j];
	   else
	   {c=j;
	   break;
	   }
	    }
	for(j=c+1;j<500;j++)
		{	
		if(a[j]!=',')
			t=t+a[j];
	   else
	   {c=j;
	   break;}
		}
	for(j=c+1;j<500;j++)
		{	
		if(a[j]!=',')
			u=u+a[j];
	   else
	   {c=j;
	   break;}
		}
	for(j=c+1;j<500;j++)
		{	
		if(a[j]!=',')
			ss=ss+a[j];
	   else
	   {c=j;
	   break;}
		}
	for(j=c+1;j<500;j++)
		{	
		if(a[j]!=',')
			pp=pp+a[j];
	   else
	   {c=j;
	   break;}
	    }
	for(j=c+1;j<500;j++)
		{	
		if(a[j]!=',')
			qq=qq+a[j];
	   else
	   {c=j;
	   break;}
	    }
		for(j=c+1;j<500;j++)
		{	
		if(a[j]!=',')
			rr=rr+a[j];
	   else
	   {c=j;
	   break;}
	    }
	for(j=c+1;j<500;j++)
		{	
		if(a[j]!=',')
			tt=tt+a[j];
	   else
	   {c=j;
	   break;}
		}
	for(j=c+1;j<500;j++)
		{	
		if(a[j]!=',')
			uu=uu+a[j];
	   else
	   {c=j;
	   break;}
		}
	}catch(Exception asa){}
     
	  panel=new JPanel(new GridBagLayout());
	 
	   GridBagConstraints c = new GridBagConstraints();
	  
	     
	JFrame f = new Chef();
	label = new JLabel("WELCOME CASHIER");
	label.setFont(new Font("Tahoma", 1, 20));
	background = new JLabel((new ImageIcon("C:\\Users\\Devender\\Documents\\NetBeansProjects\\Canteen Automation\\src\\cashier.jpg")),SwingConstants.RIGHT);
	f.add(label,BorderLayout.NORTH);
	f.add(background,BorderLayout.EAST);
	
	c.insets = new Insets(20,20,20,20);
	
		c.gridx=60;
	c.gridy=6;
		
	labela = new JLabel();
	labela.setText("ORDERS");
	labela.setFont(new Font("Tahoma", 1, 20));
	panel.add(labela,c);
	c.gridx=60;
	c.gridy=7;
		
	label1 = new JLabel();
	label1.setText("ITEM   QUANTITY  PRICE  ");
	label1.setFont(new Font("Tahoma", 1, 18));
	panel.add(label1,c);

	
	c.gridx=60;
	c.gridy=8;
	label2 = new JLabel();
	label2.setText(s);
	label2.setFont(new Font("Tahoma", 1, 16));
	panel.add(label2,c);
	
		c.gridx=60;
	c.gridy=9;
	label3 = new JLabel();
	label3.setText(p);
	label3.setFont(new Font("Tahoma", 1, 16));
	panel.add(label3,c);
	
	c.gridx=60;
	c.gridy=10;
	label4 = new JLabel();
	label4.setText(q);
	label4.setFont(new Font("Tahoma", 1, 16));
	panel.add(label4,c);
	
	c.gridx=60;
	c.gridy=11;
	label5 = new JLabel();
	label5.setText(r);
	label5.setFont(new Font("Tahoma", 1, 16));
	panel.add(label5,c);
	
	c.gridx=60;
	c.gridy=12;
	label6 = new JLabel();
	label6.setText(t);
	label6.setFont(new Font("Tahoma", 1, 16));
	panel.add(label6,c);
	f.add(panel);
	if(u!=""){
	c.gridx=60;
	c.gridy=13;
	label7 = new JLabel();
	label7.setText(u);
	label7.setFont(new Font("Tahoma", 1, 16));
	panel.add(label7,c);
	f.add(panel);}

	if(pp!=""){
	c.gridx=60;
	c.gridy=15;
	label31 = new JLabel();
	label31.setFont(new Font("Tahoma", 1, 16));
	label31.setText(pp);
	panel.add(label31,c);}
	if(qq!=""){
	c.gridx=60;
	c.gridy=16;
	label41 = new JLabel();
	label41.setText(qq);
	label41.setFont(new Font("Tahoma", 1, 16));
	panel.add(label41,c);}
	if(rr!=""){
	c.gridx=60;
	c.gridy=17;
	label51 = new JLabel();
	label51.setText(rr);
	label51.setFont(new Font("Tahoma", 1, 16));
	panel.add(label51,c);}
	
        if(tt!=""){
	c.gridx=60;
	c.gridy=18;
	label61 = new JLabel();
	label61.setText(tt);
	panel.add(label61,c);
	f.add(panel);}
	if(uu!="")
        {
	c.gridx=60;
	c.gridy=19;
	label71 = new JLabel();
	label71.setText(uu);
	panel.add(label71,c);
	f.add(panel);
        }
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	f.setUndecorated(true);
	f.getContentPane().setBackground(Color.YELLOW);
	EXIT =new JButton("LOGOUT");
		
		c.gridx=60;
	c.gridy=20;
		EXIT.setBackground(Color.ORANGE);
		EXIT.setForeground(Color.BLACK);
		EXIT.addActionListener(this);
		 panel.add(EXIT,c);
		 panel.setOpaque(false);
	f.setVisible(true);
}
	
public static void main(String a[])
{
	Cashier f = new Cashier();
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
