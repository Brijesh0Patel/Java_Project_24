import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.mysql.jdbc.ResultSetRow;

public class LoginUI extends JFrame {

	JLabel jLabel1, jLabel2;
	JTextField jfield1, jfield2;
	JButton button1, button2;

	public LoginUI() {
		
		setLayout(new FlowLayout());
		jLabel1 = new JLabel("Username");
		jLabel2 = new JLabel("Password");
		jfield1 = new JTextField(20);
		jfield2 = new JTextField(20);	
		
		button1 = new JButton("submit");
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		
				try {
					ResultSet resultSet = GetConnection.getConnection().prepareStatement("select * from patel")
							.executeQuery();
					resultSet.next();
					String u = resultSet.getString(1);
					String p = resultSet.getString(2);
					
					if (jfield1.getText().equals(u) && jfield2.getText().equals(p)) {
						System.out.println("you are loged in...!");
						new HomeUI();
						
					}
					else {
						System.out.println("Error....!");
					}
						
					
					
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
				
							
			}
		});
		button2 = new JButton("reset");		
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("reset");
				
			}
		});

		add(jLabel1);
		add(jfield1);
		add(jLabel2);
		add(jfield2);
		
		add(button1);
		add(button2);	
		
		setVisible(true);
		setSize(400, 400);
		
	}

	public static void main(String[] args) {
		new LoginUI();
	}

}
