import java.sql.*;


public class Controller_Company_of_Supplies {
	public static String Search(int Id , String Name) throws Exception
	{
		ResultSet Result_Set;
		//This type of data , i mean "ResultSet" we will use as a container for results of sorting data from out MySQL database
		String Result=null;
		//We make our variable "Result" equals to null to initialize for this class
		if (Id == 0)
		{
			if (Name.equals(""))
			{ 
				//In our application we have several ways of searching
				//Here i want to represent way of showing all products in database
				//For this way user should to input nothing , just press button "Search"
				
				try
				{
					 Connection Connection_to_DB = DriverManager.getConnection("jdbc:mysql://localhost:3306/supplies_inc_database?autoReconnect=true&useSSL=false","DBdev","1615DB7");			 
					 
					 Statement New_statement = Connection_to_DB.createStatement();
					 //Here we created connection with database by adres "localhost" using port 3306 
					 //And using account DBdev with password 1615DB7
					 //Additional parameter in connection allowed to skip using SSL and automatically reconnect to our database 
					 
				     Result_Set = New_statement.executeQuery("select * from equipment_storage");
				     
				     Result = "";
				     
				     while(Result_Set.next())
				     {
				    	 Result += Result_Set.getString("Name_Equipment_Storage")+"    Amount : "+ String.valueOf(Result_Set.getInt("Amount_Equipment_Storage"))+"    Location : "+Result_Set.getString("Location_Equipment_Storagecol")+"\n";
				     }
				}
				catch(Exception e)
				{
					e.printStackTrace();
					Result = "Error , please check your data";
				}
				return Result;
			}
			else
			{
				try
				{
					 //Here we may see the way of searching using only name of product
					 //Without id
					 Connection Connection_to_DB = DriverManager.getConnection("jdbc:mysql://localhost:3306/supplies_inc_database?autoReconnect=true&useSSL=false","DBdev","1615DB7");			 
					 
					 Statement New_statement = Connection_to_DB.createStatement();
					 
				     Result_Set = New_statement.executeQuery("select * from equipment_storage where Name_Equipment_Storage = "+Name);
				     
				     Result = "";
				     
				     while(Result_Set.next())
				     {
				    	 Result += Result_Set.getString("Name_Equipment_Storage")+"    Amount : "+ String.valueOf(Result_Set.getInt("Amount_Equipment_Storage"))+"    Location : "+Result_Set.getString("Location_Equipment_Storagecol")+"\n";
				     }
				}
				catch(Exception e)
				{
					e.printStackTrace();
					Result = "Error , please check your data";
				}
				
				if (Result == "")
				{
					Result = "There is no any results of searching. Please check your input data";
				}
				return Result;
			}
		}
		else
		{
			if  (Name.equals(""))
			{
				try
				{
					 //Searching by using only id
					 Connection Connection_to_DB = DriverManager.getConnection("jdbc:mysql://localhost:3306/supplies_inc_database?autoReconnect=true&useSSL=false","DBdev","1615DB7");			 
					 
					 Statement New_statement = Connection_to_DB.createStatement();
					 
				     Result_Set = New_statement.executeQuery("select * from equipment_storage where Id_Equipment_Storage = "+Id);
				     
				     Result = "";
				     
				     while(Result_Set.next())
				     {
				    	 Result += Result_Set.getString("Name_Equipment_Storage")+"    Amount : "+ String.valueOf(Result_Set.getInt("Amount_Equipment_Storage"))+"    Location : "+Result_Set.getString("Location_Equipment_Storagecol")+"\n";
				     }
				}
				catch(Exception e)
				{
					e.printStackTrace();
					Result = "Error , please check your data";
				}
				if (Result == "")
				{
					Result = "There is no any results of searching. Please check your input data";
				}
				return Result;
			}
			else
			{
				try
				{
					 //Searching using both id and name of product
					 Connection Connection_to_DB = DriverManager.getConnection("jdbc:mysql://localhost:3306/supplies_inc_database?autoReconnect=true&useSSL=false","DBdev","1615DB7");			 
					 
					 Statement New_statement = Connection_to_DB.createStatement();
					 
				     Result_Set = New_statement.executeQuery("select * from equipment_storage where Id_Equipment_Storage = "+Id);
				     
				     Result = "";
				     
				     while(Result_Set.next())
				     {
				    	 if (Name.equals(Result_Set.getString("Name_Equipment_Storage")))
				    	 {
				    	 Result += Result_Set.getString("Name_Equipment_Storage")+"    Amount : "+ String.valueOf(Result_Set.getInt("Amount_Equipment_Storage"))+"    Location : "+Result_Set.getString("Location_Equipment_Storagecol")+"\n";
				    	 }
				     }
				}
				catch(Exception e)
				{
					e.printStackTrace();
					Result = "Error , please check your data";
				}
				if (Result == "")
				{
					Result = "There is no any results of searching. Please check your input data";
				}
				return Result;
			}
		}
		
	}

}//Made by Mykyta Bieliaiev
