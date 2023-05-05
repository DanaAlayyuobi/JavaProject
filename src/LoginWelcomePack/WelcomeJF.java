package LoginWelcomePack;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import consuptionProcess.CalculationConsuption;
public class WelcomeJF extends Login implements ActionListener  {	
	JButton startB;//Declaration JButton need
	JLabel wl;//Declaration JLabel need
	JPanel welcomePanel;//Declaration JPanel need
	 
    public WelcomeJF(String us){//constructor will display Welcome JFrame
	setSize(336, 336);
	setTitle("Welcome");
	setDefaultCloseOperation(EXIT_ON_CLOSE);  
	
	ImageIcon img=new ImageIcon("true.jpg");
	
    JLabel LImg=new JLabel() ;
    LImg.setIcon(img);//set the image in Label  
    
 
    wl=new JLabel("Welcome "+us);//label will display welcome + userName 
   

	startB=new JButton("Start");//Start Button 
	startB.setBackground(Color.GREEN);//color the start button
	
	 welcomePanel=new JPanel(new FlowLayout());//initialization  new Panel 
	 welcomePanel.add(wl);//add the Label in the welcomePanel
	 
	
	 add(LImg);// add imageLabel to JFrame
	 add(welcomePanel,BorderLayout.NORTH);//add the Welcome Panel to JFrame(North)
	 add(startB,BorderLayout.SOUTH);//add the button in JFrame(South) 
	 
	 // Start Button go to addActionListener method
	 startB.addActionListener(this);
	 
	 setVisible(true);//to show the JFrame
	
	
}
    //will go to Calculation Class
public void actionPerformed(ActionEvent e) {
	CalculationConsuption c1=new CalculationConsuption();
	
}
}
