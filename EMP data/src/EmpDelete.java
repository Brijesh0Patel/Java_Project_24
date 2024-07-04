import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EmpDelete extends JFrame{
	
	JLabel lable1;
	JTextField field1;
	JButton button1;
	
   public EmpDelete() {
		
		setLayout(new FlowLayout());
		lable1 = new JLabel("ID");
		field1 = new JTextField(20);
		
		EmpPojo EmpPojo = new EmpPojo();

		button1 = new JButton("Submit");

		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EmpPojo.setId(Integer.parseInt(field1.getText()));
				new OperationImp().DeleteData(EmpPojo);
			}
		});

		add(lable1);
		add(field1);
		add(button1);
		

		setVisible(true);
		setSize(400, 400);

	}
   public static void main(String[] args) {
	new EmpDelete();
	
	
	
}

}
		
	


