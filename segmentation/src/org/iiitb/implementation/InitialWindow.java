package org.iiitb.implementation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;



public class InitialWindow extends JFrame implements ActionListener {
	
	int m;
	JLabel jl1;
	JLabel jl2;
	JLabel jl3;
	JTextField jt1;
	JButton jb1;
	
	
	public InitialWindow() {
		
		  setLocation(0,0);
		  setSize(400,300);	
		  setTitle("Initial Screen");
		  setDefaultCloseOperation(EXIT_ON_CLOSE);
		  setLayout(null);
		  
		  jl1 = new JLabel("<html><body style='width: 10% px'> Enter The Size of Physical Memory (In bits) :</html>");
		  jl1.setBounds(30,60,200,50);
		  // change
		  jl2 = new JLabel("<html><body style='width: 10% px'> <font color=red> NOTE :</html>"); 
		  jl2.setBounds(25, 120, 50, 40);
		  
		  jl3 = new JLabel("<html><body style='width: 10% px'> If you enter 10 then The Size of Physical Memory 2^10 = 1024 Bytes </html>");  
		  jl3.setBounds(80, 123, 300, 50);
		  
		  jt1 = new JTextField();
		  jt1.setBounds(250,75,80,30);
		  
		  jb1 = new JButton("Submit");
		  jb1.setBounds(160,200,100,30);
		  add(jl1);
		  add(jl2);
		  add(jl3);
		  add(jt1);
		  add(jb1);
		  
		  jb1.addActionListener(this);
		 
		 jt1.setText("");
		  
		  setVisible(true);
		  
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Object o = e.getSource();
		
		if(o == jb1) {
			
			
			try {
				
				m = Integer.parseInt(jt1.getText());
				 if(jt1.getText().equals("") || m<5 || m>32) {			// change
					 
					 JOptionPane.showMessageDialog(null, "<html> <font color=red> Invalid Value!! </font></html>");
				 }
				 
				 else {
					 
					 this.setVisible(false);
					 
						this.dispose();
						long memorySize = m;
						MainWindow mw = new MainWindow(memorySize);
						
				 }
			} catch(Exception ex){
				JOptionPane.showMessageDialog(null, "<html> <font color=red> Invalid Value!! </font></html>");
				
			}
			
		}
		
	}
	
	 public static void main(String args[]) {

			Connection con;
			try {
				con = MySqlConnection.getConnection();
				String myQuery;
				PreparedStatement query;

				myQuery = "delete from Process";
				query = con.prepareStatement(myQuery);
				query.executeUpdate();
				con.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		
		 new InitialWindow();
   	 }
}