import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPanel_Company_Of_Supplies extends JPanel {
	private JTextField TextField_For_ID;
	private JTextField TextField_For_Name;


	public JPanel_Company_Of_Supplies() {
		setLayout(null);
		//Here we have all graphical elements which we will use in our application
		//Creating ScrollPane
		JScrollPane ScrollPane_For_TextArea = new JScrollPane();
		ScrollPane_For_TextArea.setBounds(10, 154, 430, 135);
		add(ScrollPane_For_TextArea);
		
		//Creating TextArea And adding it to created ScrollPane
		JTextArea TextArea_For_Result = new JTextArea("");
		ScrollPane_For_TextArea.setViewportView(TextArea_For_Result);
		TextArea_For_Result.setWrapStyleWord(true);
		TextArea_For_Result.setEditable(false);
		
		//Creating Label for small title
		JLabel lblSuppliesSearching = new JLabel("Supplies Searching");
		lblSuppliesSearching.setBounds(10, 11, 352, 14);
		add(lblSuppliesSearching);
		
		//Creating TextField for inputting Id of product
		TextField_For_ID = new JTextField();
		TextField_For_ID.setBounds(10, 36, 163, 20);
		add(TextField_For_ID);
		TextField_For_ID.setColumns(10);
		
		//Creating TextField for inputting Name of product
		TextField_For_Name = new JTextField();
		TextField_For_Name.setBounds(10, 67, 163, 20);
		add(TextField_For_Name);
		TextField_For_Name.setColumns(10);
		
		//Creating Lable for first TextField (Id)
		JLabel Lanel_For_ID = new JLabel("Id of required equipment ");
		Lanel_For_ID.setBounds(183, 36, 189, 14);
		add(Lanel_For_ID);
		
		//Creating Lable for second TextField (Name)
		JLabel lblNameOfRequired = new JLabel("Name of required equipment");
		lblNameOfRequired.setBounds(183, 70, 179, 14);
		add(lblNameOfRequired);
		
		//Creating button for searching
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int Id;
				String Name;
				
				//Checking the parameters inside both TextFields
				if (TextField_For_ID.getText().length() == 0)
				{
					Id = 0;
				}
				else
				{
				    Id = Integer.parseInt(TextField_For_ID.getText());
				}
				
				
				if (TextField_For_Name.getText().length() == 0)
				{
					Name = "";
				}
				else
				{
					Name = TextField_For_Name.getText();
				}
				
				//Starting controller and searching process
				Controller_Company_of_Supplies Search_For_Result = new Controller_Company_of_Supplies();
				try {
					String Result = Search_For_Result.Search(Id, Name);
					TextArea_For_Result.setText(Result);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnSearch.setBounds(70, 109, 89, 23);
		add(btnSearch);
		
		//Creating button for calling Help page
		JButton btnHelp = new JButton("Help");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Help_Page_JFrame_Company_Of_Supplies frame = new Help_Page_JFrame_Company_Of_Supplies();
				frame.setVisible(true);
			}
		});
		btnHelp.setBounds(306, 109, 89, 23);
		add(btnHelp);
		
		//Creating button for cleaning TextArea or results of searching
		JButton btnClear = new JButton("Clean");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextArea_For_Result.setText(null);
			}
		});
		btnClear.setBounds(190, 109, 89, 23);
		add(btnClear);

	}
}//Made by Mykyta Bieliaiev
