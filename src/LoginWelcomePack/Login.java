package LoginWelcomePack;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
 private String  userName,password;
JTextField usT,passT;
//constructor
 public Login() {
System.out.println("Login constructor");

}
 // to set the username and the password
public void setter(String us ,String p) {
userName=us;
password=p;
}
//to get the username 
public String getUserName() {
	
	return userName;
}
// to display the information in GUI
public void jframeLogin() {
	
	setTitle("Login");//frame title
	setSize(400,400);//size
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//out 
	
	ImageIcon img=new ImageIcon("back1login.jpg");//img will be in JFrame 
	
    FlowLayout flow = new FlowLayout(FlowLayout.CENTER);//initialize flowLayout

	JPanel LoginP=new JPanel();//initialize panel with flowLay flowManger
	
	
	//user inputs
	usT =new JTextField(30);
	JLabel usL = new JLabel("UserName");
	//pass input
	
	

	
	//pass inputs
	passT = new JTextField(20);
	//String passTS=passT.getText();
	JLabel passL = new JLabel("password ");
	
	//set img
	JLabel iconL = new JLabel();
	iconL.setIcon(img);
	

	
     // login button
	JButton logB=new JButton("Login");	
	logB.setBackground(Color.cyan);//login color
	
	//add all component in panel
	LoginP.add(usL);
	LoginP.add(usT);
	LoginP.add(passL);
	LoginP.add(passT);
	LoginP.add(logB);
	LoginP.add(iconL);
	
	//add panel to frame
	add(LoginP,BorderLayout.CENTER);
	
	//when the user click the button go to actionListener method
    logB.addActionListener(this);      

	setVisible(true);//to JFrame show
	}




//Override
public void actionPerformed(ActionEvent e) {
	String usV=usT.getText();// save the UserName and change it into String
	String passV=passT.getText();// save the pass and change it into String
	
	setter(usV,passV);//pass the input to setter 
	
	System.out.println(userName);
	
	//if the condition true pass it to another class name WelcomeJF
	if(usV.equals("anna")&& passV.equals("123456")){
	WelcomeJF w1 =new WelcomeJF(usV);}
	
	
	//not true display its not true try again by JOptionPane
	else{
		JOptionPane.showMessageDialog(null,"try again , invalid login");
}
	}


}

