import java.io.*;
import javax.swing.*;
import java.awt.*;

class Splash extends JFrame implements Runnable
{

public void run()
{
	try{
		Frame frame = new Frame();
		frame.add(new JLabel((new ImageIcon("C:\\Users\\Devender\\Documents\\NetBeansProjects\\Canteen Automation\\src\\Canteen.jpg"))));
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

public static void main(String a[])
{
	
	
	try{
	Splash s= new Splash();
	s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	s.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	s.add(new JLabel(new ImageIcon("C:\\Users\\Devender\\Documents\\NetBeansProjects\\Canteen Automation\\src\\Food.jpg")));
	s.setUndecorated(true);
	s.setVisible(true);
    Thread thread = new Thread(s);
	thread.start();
	thread.sleep(2000);
	s.dispose();
	Login login = new Login();
	login.makeGUI();
		}
		catch(Exception e)
		{System.out.println("Error");}
}
}