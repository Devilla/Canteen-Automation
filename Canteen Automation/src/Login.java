import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  

class Login extends JFrame implements ActionListener
 {
  JButton SUBMIT,EXIT,SIGNUP;
  JPanel panel;
  JLabel label1,label2,background,label3;

  final JTextField  text1,text2;
 
   Login()
	{
		
		
		background = new JLabel((new ImageIcon("C:\\Users\\Devender\\Documents\\NetBeansProjects\\Canteen Automation\\src\\Canteen.jpg")));
		label1 = new JLabel();

		label1.setText("Username : ");
		
		text1 = new JTextField(15);
 
		label2 = new JLabel();
		label2.setText("Password : ");
		
		label3 =new JLabel();
		text2 = new JPasswordField(15);
  
		SUBMIT=new JButton("SUBMIT");
		EXIT =new JButton("EXIT");
		SIGNUP=new JButton("SIGNUP");
		
		
		SUBMIT.setBackground(Color.GREEN);
		SUBMIT.setForeground(Color.BLACK);
	
		EXIT.setBackground(Color.GREEN);
		EXIT.setForeground(Color.BLACK);
		
		SIGNUP.setBackground(Color.GREEN);
		SIGNUP.setForeground(Color.BLACK);
	   panel=new JPanel(new GridBagLayout());
	   GridBagConstraints c = new GridBagConstraints();
	  

	  c.insets = new Insets(10,10,10,10);
	  c.gridx=0;
	  c.gridy=0;
	  c.anchor = GridBagConstraints.WEST;
       panel.add(background,c);
	   
	   c.gridx=1;
	   c.gridy=1;
	   panel.add(label1,c);
	   c.gridx=2;
	   c.gridy=1;
	   panel.add(text1,c);
	   c.gridx=1;
	   c.gridy=2;
	   panel.add(label2,c);
	   c.gridx=2;
	   c.gridy=2;	   
	   panel.add(text2,c);
	   c.gridx=1;
	   c.gridy=5;
	   panel.add(SUBMIT,c);
	   c.gridx=0;
	   c.gridy=5;	   
	   panel.add(EXIT,c);
	   c.gridx=51;
	   c.gridy=5;
	   panel.add(SIGNUP,c);
	   
	   add(panel);
	   SUBMIT.addActionListener(this);
	   EXIT.addActionListener(this);
	   SIGNUP.addActionListener(this);

	   panel.setOpaque(false);
	}
	public void makeGUI()
   {
   try
   {
   Login frame=new Login();
   
   frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
 frame.setUndecorated(true);
 
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.getContentPane().setBackground(Color.orange);
     frame.setVisible(true);
   }
   catch(Exception e)
   {JOptionPane.showMessageDialog(null, e.getMessage());}
   }
	
	public void actionPerformed(ActionEvent ae)
   {
       
       if(ae.getSource()==EXIT)
       {
           System.exit(0);
       }
		if(ae.getSource()==SUBMIT)
	{	int c=0,i,j;
		String s="",p="";
	   String value1=text1.getText();
	   String value2=text2.getText();
	  try{
      FileReader fr = new FileReader("abc.txt"); 
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
	   break;
       }
		
	    System.out.println(s);
		 System.out.println(p);
      fr.close();
	 
	}
    catch(Exception ad){}
	   if (value1.equals(s) && value2.equals(p))
	   {
			User user = new User();
			user.makeGUI();
	   }
	   else if (value1.equals("CHEF") && value2.equals("12345"))
	   {
		Chef f = new Chef();
		f.makeGUI();
	   }
	   else if (value1.equals("CASHIER") && value2.equals("12345"))
	   {
		Cashier f = new Cashier();
		f.makeGUI();
	   }
	   else
	   {
			System.out.println("enter the valid username and password");
			JOptionPane.showMessageDialog(this,"Incorrect login or password","Error",JOptionPane.ERROR_MESSAGE);
	   }
	   
	}
	else if(ae.getSource()==SIGNUP)
	{
			System.out.println("Signup reached!");
			SignUp s = new SignUp();
			s.makeGUI();
	}
	}
}


 