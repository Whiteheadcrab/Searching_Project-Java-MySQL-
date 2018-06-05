import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Help_Page_JPanel_Company_Of_Supplies extends JPanel {


	public Help_Page_JPanel_Company_Of_Supplies() {
		setLayout(null);
		
		//Main part of this page is information
		//I divided it into several parts for more suitable view and for quick searching of mistakes , instead of putting everything in one string
		String First_Message = "Good time of day .\n We glad that you chose our application as a tool for categorizing and maintaining the your supplies and storage \n\n" ;
		String Second_Message = "Our application allow you to use search ability according to your information about required product \n\n";
		String Third_Message = "First kind type of searching \nFirst type is more detailed , because in it programm will use Name and Id of product \n\n";
		String Fourth_Message = "Second type of searching \nSecond type is connected with using only one parameter : either Name , or Id. \n\n";
		String Fifth_Message = "Third type of searching \nThird type is showing all product which our application store in database. For this you just need to push button Search without putting any parameters. \n\n";
		String Sixth_Message = "Also , you have button Clean if you don't want to be disturbed from the results of searching which don't need already. \n\n";
		String Seventh_Message = "I hope that our application will help you with your supplies. Best Regards,Developer";
		//Here we unit them into one string 
		String Full_Message = First_Message+Second_Message+Third_Message+Fourth_Message+Fifth_Message+Sixth_Message+Seventh_Message;
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 430, 278);
		add(scrollPane);
		
		//And represent it 
		JTextArea textArea = new JTextArea(Full_Message);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);

	}
}//Made by Mykyta Bieliaiev
