import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JFrame_Company_Of_Supplies extends javax.swing.JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame_Company_Of_Supplies frame = new JFrame_Company_Of_Supplies();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	//This is Frame 
	//Using this Frame we may represent all graphical elements from our panel
	public JFrame_Company_Of_Supplies() {
		setResizable(false);
		setTitle("Supplies Company : Searching");
		setDefaultCloseOperation(JFrame_Company_Of_Supplies.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 335);
		contentPane = new JPanel_Company_Of_Supplies();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
}//Made by Mykyta Bieliaiev
