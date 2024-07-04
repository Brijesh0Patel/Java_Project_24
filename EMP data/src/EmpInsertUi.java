import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.mysql.jdbc.Field;

public class EmpInsertUi extends JFrame {
	
	JLabel jLabel1,jLabel2;
	JTextField jTextField1,jTextField2;
	JButton jButton1,jButton2;
	
	public EmpInsertUi() {
		
		setLayout(new FlowLayout());
		
		jLabel1 = new JLabel("ID");
		jLabel2 = new JLabel("name");
		
		jTextField1 = new JTextField(20);
		jTextField2 = new JTextField(20);
		
		EmpPojo EmpPojo = new EmpPojo();

		jButton1 = new JButton("Submit");

		jButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EmpPojo.setId(Integer.parseInt(jTextField1.getText()));
				EmpPojo.setName(jTextField2.getText());
				
				//new OperationImp().InsertData(EmpPojo);
				new OperationImp().UpdateData(EmpPojo);
			}
		});
		
		jButton2 = new JButton("Reset");
		add(jLabel1);
		add(jTextField1);
		add(jLabel2);
		add(jTextField2);
		add(jButton1);
		add(jButton2);
		

		setVisible(true);
		setSize(400, 400);

	}

}
		
		
		
	
	
