//package Framework_1.CumberDesign;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//import io.cucumber.java.lu.a.as;
//
//public class Jdbc {
//	
//	
//	static String query ="";
//	static long count = 0;
//	public static void main(String[] args) throws SQLException {
//	Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/newschema","root","Anil@1993");
//	Statement stmt = connection.createStatement();
////	query = "select count(*) from Emp_Data"; 
////	ResultSet set =stmt.executeQuery(query);
////	
////	set.next();
////    count = set.getInt(1);
////	
////	
////	System.out.println(count);
//
//	Jdbc jdbc=new Jdbc();
//	jdbc.Create_Table("Loginpage_Test_Data",2);
//	
//	System.out.println(query);
//	
//	
//	
//	}
//   public void Create_Table(String table_name,int no_of_Column) {
//	   
//	   String tname=table_name; 
//	   int colNo = no_of_Column;
//	   
//	   
//	   //String[] columnDataType= new String[colNo];
//	  // ArrayList<String> columnDataType= new ArrayList<String>();
//	   
//	   System.out.println("How many column do you want to add?");
//	   
//	   Scanner scanner =new Scanner(System.in);
//	   colNo=scanner.nextInt();
//	   //System.out.println(colNo); 
//	   String[] columnName= new String[colNo];
//	   System.out.println("Enter Column Name and Data Type eg.Usernames varchar(255)");
//	   
//	   for(int i=0;i<colNo;i++) {
//		   
//		columnName[i]=scanner.next();
//		
//		   
//	   
//	   }
//		   
//		
//	     //System.out.println("end"); 
//	   	   
//	  String tempString=Arrays.toString(columnName);
//	  
//	  
//	  
//	  
//			   query = "CREATE TABLE " +tname + "("
//					   + tempString.replace("\\[$]\\", "") + ")";
//			
//
//	   }
//   
//		   
//	   
//	   
//	   
//	   
//	   
//	   
//	   
//	   
//	   
//   
//   
//   public void Update_Table_Entry(String table_name) {
//	   
//	   String tname=table_name; 
//	   
//	   String query = "CREATE TABLE tname ( "
//			   + "First_Name VARCHAR(255), "
//			   + "Last_Name VARCHAR(255), "
//			   + "Date_Of_Birth Date, "
//			   + "Place_Of_Birth VARCHAR(255), "
//			   + "Country VARCHAR(255))";
//	   
//			   
//		   }
//		public void Delete_Table_Entry(String table_name) {
//			   
//			   String tname=table_name; 
//			   
//			   String query = "CREATE TABLE tname ( "
//					   + "First_Name VARCHAR(255), "
//					   + "Last_Name VARCHAR(255), "
//					   + "Date_Of_Birth Date, "
//					   + "Place_Of_Birth VARCHAR(255), "
//					   + "Country VARCHAR(255))";
//			   
//			   
//		}
//		public void delete_Table(String table_name) {
//			   
//			   
//		}
//
//}
