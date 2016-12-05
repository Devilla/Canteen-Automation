import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class User extends JFrame implements ActionListener,WindowListener{

User f;
JLabel wel,feedbac,label1,label2,label3,label4,label5,label6,item,quant,price,label11,label12,label13,label14,label15,label16,label111,label112,label113,label114,label115,label116,total,total1;
JPanel panel;
MenuBar menuBar;
Menu fileMenu;
MenuItem miOpen;
MenuItem miClose;
MenuItem miSave;
JButton button;
JButton button2,EXIT;
JButton button3,order,clear;
JButton button4;
JButton button5;
JButton button6;
JTextField feedback;
FileWriter fw,fw2,fw3;
GridBagConstraints c = new GridBagConstraints();
int counta = 0,countb=0,countc=0,countd=0,counte=0,countf=0;
public void makeGUI()
{
	f = new User();
	try{
	fw=new FileWriter("order.txt"); 
	fw2=new FileWriter("bill.txt"); 
	fw3=new FileWriter("feed.txt");
	 }catch(Exception as){}
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	f.setUndecorated(true);
	
	panel = new JPanel(new GridBagLayout());
	feedback = new JTextField(20);
	 button = new JButton();
	 button2 = new JButton();
	 button3 = new JButton();
	 button4 = new JButton();
	 button5 = new JButton();
	 button6 = new JButton();
	 EXIT = new JButton(" FINISH ORDER");
	  order  = new JButton("TOTAL");
	   clear  = new JButton("CLEAR");
	   
   c.insets = new Insets(5,5,5,5);
	button.setFont(new Font("Tahoma", 1, 11)); 
        button.setIcon(new ImageIcon("C:\\Users\\Devender\\Documents\\NetBeansProjects\\Canteen Automation\\src\\Burger1.jpg")); 
        button.setText("Burger");
        button.setToolTipText("Click to Order");
        button.setHorizontalTextPosition(SwingConstants.CENTER);
       button.setVerticalTextPosition(SwingConstants.TOP);
	   button.addActionListener(this);

		button2.setFont(new Font("Tahoma", 1, 11)); 
        button2.setIcon(new ImageIcon("C:\\Users\\Devender\\Documents\\NetBeansProjects\\Canteen Automation\\src\\pizza1.jpg")); 
        button2.setText("Pizza");
        button2.setToolTipText("Click to Order");
        button2.setHorizontalTextPosition(SwingConstants.CENTER);
       button2.setVerticalTextPosition(SwingConstants.TOP);
	   button2.addActionListener(this);

		button3.setFont(new Font("Tahoma", 1, 11)); 
        button3.setIcon(new ImageIcon("C:\\Users\\Devender\\Documents\\NetBeansProjects\\Canteen Automation\\src\\dhokla.jpg")); 
        button3.setText("dhokla");
        button3.setToolTipText("Click to Order");
        button3.setHorizontalTextPosition(SwingConstants.CENTER);
       button3.setVerticalTextPosition(SwingConstants.TOP);
   button3.addActionListener(this);

		button4.setFont(new Font("Tahoma", 1, 11)); 
        button4.setIcon(new ImageIcon("C:\\Users\\Devender\\Documents\\NetBeansProjects\\Canteen Automation\\src\\pasta.jpg")); 
        button4.setText("Pasta");
        button4.setToolTipText("Click to order");
        button4.setHorizontalTextPosition(SwingConstants.CENTER);
       button4.setVerticalTextPosition(SwingConstants.TOP);
		button4.addActionListener(this);
	
		button5.setFont(new Font("Tahoma", 1, 11)); 
        button5.setIcon(new ImageIcon("C:\\Users\\Devender\\Documents\\NetBeansProjects\\Canteen Automation\\src\\pav bhaji.jpg")); 
        button5.setText("pav bhaji");
        button5.setToolTipText("Click to order");
        button5.setHorizontalTextPosition(SwingConstants.CENTER);
       button5.setVerticalTextPosition(SwingConstants.TOP);
	   button5.addActionListener(this);
	
	

		button6.setFont(new Font("Tahoma", 1, 11)); 
        button6.setIcon(new ImageIcon("C:\\Users\\Devender\\Documents\\NetBeansProjects\\Canteen Automation\\src\\poha.jpg")); 
        button6.setText("poha");
        button6.setToolTipText("Click to order");
        button6.setHorizontalTextPosition(SwingConstants.CENTER);
       button6.setVerticalTextPosition(SwingConstants.TOP);
	   button6.addActionListener(this);

	
   f.getContentPane().add(button);
   f.getContentPane().add(button2);
   f.getContentPane().add(button3);
   f.getContentPane().add(button4);
   f.getContentPane().add(button5);  
   f.getContentPane().add(button6);
 
 
   f.getContentPane().setLayout(new GridLayout(3,2)); 
   
EXIT.addActionListener(this);
order.addActionListener(this);
clear.addActionListener(this);
   
      c.gridx=60;
	  c.gridy=0;
   item=new JLabel(" ITEMS ");
   panel.add(item,c);
   
      c.gridx=65;
	  c.gridy=0;
   item=new JLabel(" QUANTITY ");
   panel.add(item,c);
   
      c.gridx=70;
	  c.gridy=0;
   item=new JLabel(" PRICE ");
   panel.add(item,c);
   
     c.gridx=100;
	  c.gridy=7;
   panel.add(EXIT,c);
      c.gridx=90;
	  c.gridy=7;
   panel.add(order,c);
      c.gridx=85;
	  c.gridy=7;
   panel.add(clear,c);
     feedbac=new JLabel("FEEDBACK");
	 feedbac.setFont(new Font("Tahoma", 1, 40));
	  f.add(feedbac,BorderLayout.CENTER);
   f.add(feedback,BorderLayout.SOUTH);
   
   label1=new JLabel();
   label11=new JLabel();
    label111=new JLabel();
	label2=new JLabel();
	label12=new JLabel();
	label112=new JLabel();
	label3=new JLabel();
	label13=new JLabel();
	label113=new JLabel();
	label4=new JLabel();
	label14=new JLabel();
	label114=new JLabel();
	label5=new JLabel();
	label15=new JLabel();
	label115=new JLabel();
	label6=new JLabel();
	label16=new JLabel();
	label116=new JLabel();
	total=new JLabel();
	total1=new JLabel();
	f.add(panel);
	f.setVisible(true);
	   //f.addWindowListener(this);
}

public void windowOpened(WindowEvent e) { }


  public void windowClosing(WindowEvent e)
   {
	System.exit(0);
   }

 
  public void windowClosed(WindowEvent e){ }
   
  public void windowIconified(WindowEvent e) { }

  public void windowDeiconified(WindowEvent e) { }

  public void windowActivated(WindowEvent e) { }

  public void windowDeactivated(WindowEvent e) { }

  public void windowGainedFocus(WindowEvent e) { }

  public void windowLostFocus(WindowEvent e) { }

  public void windowStateChanged(WindowEvent e) { }

public void actionPerformed(ActionEvent ae)
{
 if(ae.getSource()==EXIT)
 {		
	try{
		fw3.write("FEEDBACK : "+feedback.getText()+",");  
		fw3.close();
  		Login lo = new Login();
		lo.makeGUI();
		}catch(Exception re){}
  }
 
	if(ae.getSource()==button)
	{ 
	  c.gridx=60;
	  c.gridy=1;
label1.setText("Burger");
   panel.add(label1,c);
   counta++;
     c.gridx=65;
	  c.gridy=1;
   label11.setText(Integer.toString(counta));
   panel.add(label11,c);
        c.gridx=70;
	  c.gridy=1;
   label111.setText(Integer.toString(counta*25));
   panel.add(label111,c);
   	try{    
                if(counta>1){
 
	fw=new FileWriter("order.txt"); 
	fw2=new FileWriter("bill.txt"); 
	 

                }  
		fw.write(label1.getText()+" "+label11.getText()+",");  
		fw2.write(label1.getText()+" "+label11.getText()+" "+label111.getText()+",");
		}
		catch(Exception sa){}
   	f.add(panel);
	f.setVisible(true);
	}
	if(ae.getSource()==button2)
	{ 
 	  c.gridx=60;
	  c.gridy=2;
   label2.setText("Pizza");
      panel.add(label2,c);  
	  countb++;
     c.gridx=65;
	  c.gridy=2;
   label12.setText(Integer.toString(countb));
   panel.add(label12,c);
   c.gridx=70;
	  c.gridy=2;
   label112.setText(Integer.toString(countb*50));
   panel.add(label112,c);
   	try{
		              if(countb>1){
 
	fw=new FileWriter("order.txt"); 
	fw2=new FileWriter("bill.txt"); 
	

                } 
		fw.write(label2.getText()+" "+label12.getText()+",");
		fw2.write(label2.getText()+" "+label12.getText()+" "+label112.getText()+",");
		}
	catch(Exception sa){}
    f.add(panel);
	f.setVisible(true);
	}
	if(ae.getSource()==button3)
	{ 
	  
	  c.gridx=60;
	  c.gridy=3;
   label3.setText("Dhokla");
   panel.add(label3,c);
      countc++;
     c.gridx=65;
	  c.gridy=3;
   label13.setText(Integer.toString(countc));
   panel.add(label13,c);
   c.gridx=70;
	  c.gridy=3;
   label113.setText(Integer.toString(countc*15));
   panel.add(label113,c);
   	try{
              if(countc>1){
 
	fw=new FileWriter("order.txt"); 
	fw2=new FileWriter("bill.txt"); 
	 

                } 		
		fw.write(label3.getText()+"	"+label13.getText()+",");
		fw2.write(label3.getText()+" "+label13.getText()+"	"+label113.getText()+",");  
		}
		catch(Exception sa){}
   f.add(panel);
	f.setVisible(true);
	}
	if(ae.getSource()==button4)
	{ 
    c.gridx=60;
	c.gridy=4;
	label4.setText("Pasta");
	panel.add(label4,c);
    countd++;
     c.gridx=65;
	  c.gridy=4;
   label14.setText(Integer.toString(countd));
   panel.add(label14,c);
   c.gridx=70;
	  c.gridy=4;
   label114.setText(Integer.toString(countd*30));
   panel.add(label114,c);
   	try{
              if(countd>1){
 
	fw=new FileWriter("order.txt"); 
	fw2=new FileWriter("bill.txt"); 
	 

                } 		
		fw.write(label4.getText()+" "+label14.getText()+",");  
		fw2.write(label4.getText()+"  "+label14.getText()+"	"+label114.getText()+",");  
		}
		catch(Exception sa){}
	 f.add(panel);
	f.setVisible(true);
	}
	if(ae.getSource()==button5)
	{ 
    c.gridx=60;
	  c.gridy=5;
  label5.setText("Pav");
    panel.add(label5,c);
	   counte++;
     c.gridx=65;
	  c.gridy=5;
   label15.setText(Integer.toString(counte));
   panel.add(label15,c);
   c.gridx=70;
	  c.gridy=5;
   label115.setText(Integer.toString(counte*40));
   panel.add(label115,c);
   	try{
              if(counte>1){
 
	fw=new FileWriter("order.txt"); 
	fw2=new FileWriter("bill.txt"); 
	 

                }             
		 fw.write(label5.getText()+" "+label15.getText()+",");  
		 fw2.write(label5.getText()+"  "+label15.getText()+" "+label115.getText()+",");  
		}
		catch(Exception sa){}
	f.add(panel);
	f.setVisible(true);
	}
	if(ae.getSource()==button6)
	{  
    c.gridx=60;
	c.gridy=6;
  label6.setText("Poha");
   panel.add(label6,c);
      countf++;
     c.gridx=65;
	  c.gridy=6;
   label16.setText(Integer.toString(countf));
   panel.add(label16,c);
   c.gridx=70;
	  c.gridy=6;
   label116.setText(Integer.toString(countf*10));
   panel.add(label116,c);
   
   	try{
              if(countf>1){
 
	fw=new FileWriter("order.txt"); 
	fw2=new FileWriter("bill.txt"); 
	 

                } 
		fw.write(label6.getText()+" "+label16.getText()+","); 
		fw2.write(label6.getText()+" "+label16.getText()+" "+label116.getText()+",");
		
		}
		catch(Exception sa){}
	f.add(panel);
	f.setVisible(true);

	}
	if(ae.getSource()==order)
	{
		c.gridx=60;
	  c.gridy=7;
   total1.setText("TOTAL : ");
   panel.add(total1,c);
	   c.gridx=65;
	  c.gridy=7;
   total.setText(Integer.toString(countf*10+counte*40+countd*30+countc*15+countb*50+counta*25));
   
   panel.add(total,c);
   try{
   fw2.write(total1.getText()+" "+total.getText()+",");
   fw.close();
	fw2.close();
	}catch(Exception er){}
	f.add(panel);
	f.setVisible(true);
	}
	if(ae.getSource()==clear)
	{   
              try{
	fw=new FileWriter("order.txt"); 
	fw2=new FileWriter("bill.txt"); 
        
	 
	 }catch(Exception as){}
		panel.remove(label1);
		panel.remove(label11);
		panel.remove(label111);
		panel.remove(label2);
		panel.remove(label12);
		panel.remove(label112);
		panel.remove(label3);
		panel.remove(label13);
		panel.remove(label113);
		panel.remove(label4);
		panel.remove(label14);
		panel.remove(label114);
		panel.remove(label5);
		panel.remove(label15);
		panel.remove(label115);
		panel.remove(label6);
		panel.remove(label16);
		panel.remove(label116);
		panel.remove(total);
		panel.remove(total1);
		counta=0;
		countb=0;
		countc=0;
		countd=0;
		counte=0;
		countf=0;
	f.add(panel);
	f.setVisible(true);
	}
}
public static void main(String s[])
{
	User user = new User();
	user.makeGUI();
}
}