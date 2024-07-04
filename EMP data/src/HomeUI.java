import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class HomeUI extends JFrame {

	JMenuBar bar;
	JMenu Menu1, Menu2, Menu3;
	JMenuItem item1, item2, item3, item4, item5, item6;

	public HomeUI() {

		setLayout(new FlowLayout());

		bar = new JMenuBar();
		setBounds(0, 0, 400, 30);

		Menu1 = new JMenu("emp");
		Menu2 = new JMenu("Manager");
		Menu3 = new JMenu("staff");

		item1 = new JMenuItem("InsertEmp");
		item1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new EmpInsertUi();
				
			}
		});

		item2 = new JMenuItem("Update emp");
		item2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new EmpInsertUi();
				
			}
		});
		
		item3 = new JMenuItem("delete emp");
		item3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new EmpDelete();
			}
		});
		item4 = new JMenuItem("show emp");
		item4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new EmpInsertUi();
			}
		});
		item5 = new JMenuItem("InsertManager");
		item5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new EmpInsertUi();
			}
		});
		item6 = new JMenuItem("Insert staff");
		item6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new EmpInsertUi();
				
			}
		});

		add(bar);

		Menu1.add(item1);
		Menu1.add(item2);
		Menu1.add(item3);
		Menu1.add(item4);

		Menu2.add(item5);
		Menu3.add(item6);

		bar.add(Menu1);
		bar.add(Menu2);
		bar.add(Menu3);

		setVisible(true);
		setSize(400, 400);

	}

	public static void main(String[] args) {
		new HomeUI();
	}

}