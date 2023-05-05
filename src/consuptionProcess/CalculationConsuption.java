package consuptionProcess;

import javax.swing.JOptionPane;

public class CalculationConsuption {
	private double ConsuptionVal,salary,water,elect,internet,trans;
	 public CalculationConsuption(){//constructor to set the salary and bills
		double s=Double.parseDouble(JOptionPane.showInputDialog("Enter your salary"));// to input the salary
		double w=Double.parseDouble(JOptionPane.showInputDialog("Enter your water bill"));//to input the water bill
		double e=Double.parseDouble(JOptionPane.showInputDialog("Enter your electricty bill"));//to input the electricity bill
		double i=Double.parseDouble(JOptionPane.showInputDialog("Enter your Internet bill"));//to input the Internet bill
		double t=Double.parseDouble(JOptionPane.showInputDialog("Enter your transportation bill"));//to input the transportation bill
		salary=s;//to set the salary as the input in dialog
		water=w;//to set the water bill as the input in dialog
		elect=e;//to set the electricty bill  as the input in dialog
		internet=i;//to set the Internet  bill as the input in dialog
		trans =t;//to set the transportation  bill as the input in dialog
		
		if(check()){//call check method to make sure that the bills and salary not in -
		ConsuptionVal();//to call ConsuptionVal method
		
		if(ConsuptionVal>0) //if it ConsuptionVal in positive print in dialogBox advice
			JOptionPane.showMessageDialog(null,"You can use your extra money "
					+ "and put it in the bank and use it to do a small project or use "
					+ "it to develop an insurance plan"
					);

			
		
		else if(ConsuptionVal==0) //if it ConsuptionVal is 0 print in dialogBox advice		
		JOptionPane.showMessageDialog(null,"you spend all your salary , you should reduece your expenses");

		else//if it ConsuptionVal is - print in dialogBox advice	
			JOptionPane.showMessageDialog(null,"you spend all your sallary ,You are in debt and "
					+ "you must reset your monthly budget"
					);	
	}}
	//this method calculate ConsuptionVal 
	public double ConsuptionVal() {
		ConsuptionVal= (salary-(water+elect+internet+trans));
		return ConsuptionVal;
	}
	//this will make sure that all values is positive
	public boolean check() {
		if(salary<0||water<0||elect<0||internet<0||trans<0) {
			JOptionPane.showMessageDialog(null,"Please Enter again , you cannot set a bill or your salay in negative ");//Message will output if the values in negative 
	
			return false;//to not complete the calculation if there is negative val
			}
		return true;

		}

	
	}

