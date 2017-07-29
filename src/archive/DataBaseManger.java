package archive;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DataBaseManger {

	/** to check and create data base if not exist 	**
	* 	to insert data 								**
	* 	to update data
	* 	to del data
	* 	to calclute number of employee
	**/

	private Connection connect;
	
	
	private final String  PcUserName =  System.getProperty("user.name");
	private final String Directory = "C:\\Users\\"+ PcUserName + "\\Documents\\ArchiveStored\\";
	private final String URL = "jdbc:sqlite:" + Directory + "database.db";
	
	
	private String Admin_UserName = "123456789";
	private String Admin_PassWord = "123456789";
	
	private ArrayList<EMP_INFO> emp_info = new ArrayList<EMP_INFO>();
        private ArrayList<Expensses> Expensses = new ArrayList<Expensses>();

	
	
	public DataBaseManger() {
		
		File_Exist();
		Connect();
		Extract_Data();
		
	}

	public void Connect (){
		
		try {
			connect = DriverManager.getConnection(URL);
			System.out.println("Connection established");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	private void Extract_Data(){
		
		
		try {
			String Select_Qury = "SELECT * FROM `Employee` ";
			
			if(connect.isClosed())
				Connect();
			
			ResultSet rs = connect.createStatement().executeQuery(Select_Qury);
			if(rs != null)
			while(rs.next()){
				EMP_INFO emp = new EMP_INFO();
				
				emp.setID(rs.getInt("ID"));
				emp.setName(rs.getString("Name"));
				emp.setSection(rs.getString("Section"));
				emp.setSuccess(rs.getDouble("Success"));
				emp.setPassWord(rs.getString("PassWord"));
                                emp.setPhone(rs.getString("Phone"));
                                emp.setJob(rs.getString("Job"));
				
				emp_info.add(emp);
			}
			else System.out.println("There is no Data");
			
                        String Select_EXP = "SELECT * FROM `Exp` ";
                        
                        ResultSet rsExp = connect.createStatement().executeQuery(Select_EXP);
			if(rsExp != null)
			while(rsExp.next()){
				Expensses Exp = new Expensses();
				
                                Exp.setName(rsExp.getString("Name"));
                                Exp.setSerial(rsExp.getString("Siral"));
                                Exp.setNumber(rsExp.getString("Number"));
                                Exp.setCompany(rsExp.getString("Com"));
                                Exp.setOther(rsExp.getString("Other"));
                                Exp.setModel(rsExp.getString("Model"));
                                
                                Expensses.add(Exp);
				
			}
			else System.out.println("There is no Expenses");
			
                        
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public EMP_INFO getinfo(int Pos){
		return emp_info.get(Pos);
	}
        
        public Expensses getExp(int pos){
            return Expensses.get(pos);
        }
	
	public int getSize(){
		return emp_info.size();
	}
	
        public int getExpSize(){
            return Expensses.size();
        }
	
	public void Close(){
		try {
			connect.close();
			System.out.println("The Connection has bean closed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void File_Exist(){
		
		File f = new File(URL);
		if(!f.exists() && !f.isDirectory()) { 

			  new File(Directory).mkdir();
			  
		      File file = new File(Directory + "database.db");
		      
		      try {
				if (file.createNewFile()){
				    System.out.println("File is created!");
				    CreateTable();
				  }else{
				    System.out.println("File already exists.");
				  }
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} 

		
	}
	
	private void CreateTable(){
		
		
		 String Create_Table = "CREATE TABLE Employee(" +  
				 "Ecount int AUTO_INCREMENT,"+
				 "ID int PRIMARY KEY,"+
				 "PASSWORD CHARACTER," +
				 "Section CHARACTER," +
				 "Success CHARACTER," +
				 "Name CHARACTER,"+
                                 "Phone CHARACTER,"+
                                 "Job CHARACTER ,"+
                                 "Email CHARACTER);";
                 
                 String CreateE_Table = "CREATE TABLE Exp(" +  
				 "Ecount int AUTO_INCREMENT,"+
                                 "Name CHARACTER," +
                                 "Siral CHARACTER,"+
				 "Number CHARACTER," +
				 "Com CHARACTER," +
				 "Other CHARACTER,"+
                                 "Model CHARACTER );";
		
		 String InsertData = "INSERT INTO Employee(`ID` ,`PASSWORD` ) VALUES ('"+
		 Admin_UserName + "' , '" +
		 Admin_PassWord + "');";
		 
		 Connect();
		 
		 try {
			connect.createStatement().execute(Create_Table);
			System.out.println("Created Table");
			
			connect.createStatement().execute(InsertData);
			System.out.println("Data Have Bean Inserted");
                        
                        connect.createStatement().execute(CreateE_Table);
			System.out.println("Expensses Have Bean Inserted");
                        
			
			Close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		 
		
	}
	
	public void UpdateUser(EMP_INFO emp){
		
		try {
			if(connect.isClosed())
				Connect();
			
			String updateQury = "UPDATE `Employee` SET `Name`='"+ emp.getName() + "', `Section`='"+ emp.getSection()+
					"', `PassWord` = '"+ emp.getPassWord() +"' , `Success`= " + emp.getSuccess()  +
					" WHERE id=" + emp.getID();
			
			connect.createStatement().execute(updateQury);
			System.out.println("Data has Bean updated");
			Close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void Delete(int id){
		
		try {
			if(connect.isClosed())
				Connect();
			
			String deleteQury = "DELETE * FROM `Employee` where ID =" + id+";";
			
			connect.createStatement().execute(deleteQury);
			System.out.println("Data has Bean Deleted");
			Close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void AddUser(EMP_INFO emp){
		
		
		try {
			if(connect.isClosed())
				Connect();
			
			String AddQury = "INSERT INTO `Employee` (`Name` , `Section` , `PassWord` , `Success` , `ID` , `Phone` , `Email`) " +
					"VALUES ('"+ emp.getName() + "' , '" + emp.getSection() + "','" + emp.getPassWord() +  "','"+
					emp.getSuccess() + "','" + emp.getID() +"','" + emp.getPhone() + "','" + emp.getEmail() + "');";
			
			connect.createStatement().execute(AddQury);
			System.out.println("Data has Bean Added");
			
			Close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void Print(){
		
		for(int i =0; i < emp_info.size(); i++){
			
			emp_info.get(i).getID();
			System.out.println("EMP ID : " + emp_info.get(i).getID() + "\t EMP Name :" +
			emp_info.get(i).getName() + "\t EMP PASSWORD :  "+ emp_info.get(i).getPassWord() + "\t EMP SECTION : "
			+ emp_info.get(i).getSection() + "\t Success : " + emp_info.get(i).getSuccess());
			
		}
		
	}
        
        
        public void AddExp(Expensses exp){
		
		
		try {
			if(connect.isClosed())
				Connect();
			
			String AddQury = "INSERT INTO `Exp` (`Name` , `Siral` , `Number` , `Com` , `Other` , `Model` ) " +
					"VALUES ('"+ exp.getName() + "' , '" + exp.getSerial() + "','" + exp.getNumber() +  "','"+
					exp.getCompany() + "','" + exp.getOther() +"'," +" ' " + exp.getModel() + "');";
			
			connect.createStatement().execute(AddQury);
			System.out.println("Expensses has Bean Added");
			
			Close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
        
        
        
        
	
}
