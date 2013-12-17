package controler;

import java.awt.Toolkit;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LogIn_controller   implements Controller{
	
	private String username;
	private String password;
	private HashMap <String,Integer> loggedIn=new  HashMap <String,Integer>();
	private Toolkit toolkit;
	private Timer timer;
	
	public LogIn_controller(String username,String password){
		this.username=username;
		this.password=password;
		loggedIn.put(this.username,0);
		toolkit = Toolkit.getDefaultToolkit();
	    timer = new Timer();
	    timer.schedule(new RemindTask(), 10 * 1000);
		
	}
	
	class RemindTask extends TimerTask {
	    public void run() {
	      System.out.println("Time's up!");
	      toolkit.beep();
	      //timer.cancel(); //Not necessary because we call System.exit
	      System.exit(0); //Stops the AWT thread (and everything else)
	    }
	  }
	
	public void checkValidity(){
		 
		  if(username.equals("gal") && password.equals("1234")){
			  showSeccussesMsg("LogIn was seccessfully acomplished");
			  loggedIn.put(this.username,1);
		  }
		  
		  if(!password.equals("1234") && username.equals("gal"))
			showWarningMsg("Invalid password");
		
		  if(!username.equals("gal") && password.equals("1234"))
			showWarningMsg("Invalid username");
		  
		  if(!username.equals("gal") && !password.equals("1234"))
			  showWarningMsg("Invalid username and password");
	  
	 
			
	}
	
	public void showWarningMsg(String msg){
		JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame,msg,"Warning",JOptionPane.WARNING_MESSAGE);
	} 
	
	public void showSeccussesMsg(String msg){
		JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame,msg,"",JOptionPane.PLAIN_MESSAGE);
	}
}
