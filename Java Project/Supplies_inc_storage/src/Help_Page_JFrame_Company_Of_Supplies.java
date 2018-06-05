import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Help_Page_JFrame_Company_Of_Supplies extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help_Page_JFrame_Company_Of_Supplies frame = new Help_Page_JFrame_Company_Of_Supplies();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//Here we created new JFrame for Help page
//This page will contain several advises for users and some additional information
//Difference from another one consist of "DISPOSE_ON_CLOSE" instead of "EXIT_ON_CLOSE"
//This will allowed us to lose Help page without exiting from all application	
	public Help_Page_JFrame_Company_Of_Supplies() {
		setResizable(false);
		setTitle("Help Page");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 469, 332);
		contentPane = new Help_Page_JPanel_Company_Of_Supplies();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}//Made by Mykyta Bieliaiev
