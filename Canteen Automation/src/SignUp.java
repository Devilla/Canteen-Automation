import java.awt.FlowLayout;
import java.*;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


class SignUp extends JFrame implements ActionListener{

	JTextField t ;
	JTextField t1 ;
	JTextField t2,t3;
	JLabel Details;
	JLabel label;
	JFrame f;
	FileWriter fw;
        
	JButton submit;
        JButton EXIT ;
	
	public void makeGUI()
	{
	f = new JFrame("SignUp");
	label = new JLabel("WELCOME NEW USER !");
	label.setFont(new Font("Tahoma", 1, 20));
 setLocationRelativeTo(null);
	
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try{
	fw=new FileWriter("abc.txt"); 
	 }catch(Exception as){}
	 
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	f.setUndecorated(true);
	f.getContentPane().setBackground(Color.orange);
	
	JPanel panel = new JPanel(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
	
	
	c.insets = new Insets(20,20,20,20);
	
	
    JLabel name = new JLabel("Name",SwingConstants.LEFT);
	JLabel email = new JLabel("Email",SwingConstants.LEFT);
	JLabel uname = new JLabel("Username",SwingConstants.LEFT);
	JLabel pass1 = new JLabel("Password",SwingConstants.LEFT);
	JLabel pass2 = new JLabel("Renter Password",SwingConstants.LEFT);
	
	name.setHorizontalAlignment(SwingConstants.LEFT);
	name.setVerticalAlignment(SwingConstants.TOP);
	email.setHorizontalAlignment(SwingConstants.LEFT);
	email.setVerticalAlignment(SwingConstants.TOP);
	uname.setHorizontalAlignment(SwingConstants.LEFT);
	uname.setVerticalAlignment(SwingConstants.TOP);
	pass1.setHorizontalAlignment(SwingConstants.LEFT);
	pass1.setVerticalAlignment(SwingConstants.TOP);
	pass2.setHorizontalAlignment(SwingConstants.LEFT);
	pass2.setVerticalAlignment(SwingConstants.TOP);
	
    Font font = new Font("Serif",Font.BOLD,24);
	
	name.setFont(font);
	email.setFont(font);
	uname.setFont(font);
	pass1.setFont(font);
	pass2.setFont(font);
	
	t = new JTextField(8);
	t1 = new JPasswordField(8);
	t2 = new JTextField(8);
	t3 = new JPasswordField(8);
	
	submit = new JButton("SIGN UP!");
         EXIT = new JButton("Back!");
        EXIT.addActionListener(this);
        submit.setPreferredSize(new Dimension(90,40));
	submit.addActionListener(this);
c.gridx =0;
	c.gridy=0;
	panel.add(label,c);
	c.gridx =0;
	c.gridy=1;
	panel.add(name,c);
	
	c.gridx =1;
	c.gridy=1;
    panel.add(t,c);
	
	c.gridx =0;
	c.gridy=2;
		panel.add(email,c);
	
	c.gridx =1;
	c.gridy=2;
	    panel.add(t2,c);

	
	c.gridx =0;
	c.gridy=3;
panel.add(pass1,c);
	c.gridx =1;
	c.gridy=3;
	panel.add(t1,c);
	
	c.gridx =0;
	c.gridy=4;
panel.add(pass2,c);
	c.gridx =1;
	c.gridy=4;
	panel.add(t3,c);
	
	c.gridx =1;
	c.gridy=5;
	panel.add(submit,c);
        
	c.gridx =1;
	c.gridy=6;
	panel.add(EXIT,c);
	panel.setOpaque(false);
    f.getContentPane().add(panel,BorderLayout.NORTH);
	
	f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
            if(e.getSource()==submit)
            {
                try{    
               
		String name = t.getText();
		String pass = t1.getText(); 
		String email = t2.getText();
		fw.write(name+","+pass+","+email);  
		fw.close();
                JOptionPane.showMessageDialog(this,"Success","REGISTERED",JOptionPane.INFORMATION_MESSAGE);
		Login lo = new Login();
		lo.makeGUI();
                }
		
		catch(Exception sa){}
            }
            if(e.getSource()==EXIT)
            {
                Login lo = new Login();
		lo.makeGUI();
            }
            }
        
  public static void main(String[] args) 
  {
    try {
		SignUp s = new SignUp();
		s.makeGUI();

    } catch (Exception evt) {}
  }
}
