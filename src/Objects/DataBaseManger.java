package Objects;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


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
	
	
	private String Admin_UserName = "11";
	private String Admin_PassWord = "11";
	
	private ArrayList<EMP_INFO> emp_info = new ArrayList<EMP_INFO>();
        private ArrayList<Expensses> Expensses = new ArrayList<Expensses>();
        private ArrayList<User> Users = new ArrayList<User>();
        private ArrayList<ExpenssesTypes> ExpenssesTypes = new ArrayList<ExpenssesTypes>();

	
	
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
	
	public void Extract_Data(){
		
		
		try {
			String Select_Qury = "SELECT * FROM `Employee` ";
			
			if(connect.isClosed())
				Connect();
			
			ResultSet rs = connect.createStatement().executeQuery(Select_Qury);
			if(rs != null)
			while(rs.next()){
				EMP_INFO emp = new EMP_INFO();
				
				emp.setID(rs.getString("ID"));
				emp.setName(rs.getString("Name"));
				emp.setSection(rs.getString("Section"));
                                emp.setPhone(rs.getString("Phone"));
                                emp.setJob(rs.getString("Job"));
                                emp.setEmail(rs.getString("Email"));
				emp.setPK(rs.getInt("PK"));
				emp_info.add(emp);
			}
			else System.out.println("There is no Data");
			
                        String Select_Users = "SELECT * FROM `Users` ";
                        
                        ResultSet rsU = connect.createStatement().executeQuery(Select_Users);
			if(rsU != null)
			while(rsU.next()){

                            User user = new User();
                            
                            user.setUserName(rsU.getString("Username"));
                            user.setPassWord(rsU.getString("Password"));
                            user.setAuthorize(rsU.getInt("Authorize"));
                            user.setPK(rsU.getInt("PK"));
                            Users.add(user);
			}
			else System.out.println("There is no Expenses");
                        
                        
                        
                        String Select_E = "SELECT * FROM `E` ";
                        
                        ResultSet rsE = connect.createStatement().executeQuery(Select_E);
			if(rsE != null)
			while(rsE.next()){

                           ExpenssesTypes Ex = new ExpenssesTypes();
                           Ex.setName(rsE.getString("Name"));
                           Ex.setPK(rsE.getInt("PK"));
                           
                           ExpenssesTypes.add(Ex);

                        }
			else System.out.println("There is no Expenses");
                        
		} catch (SQLException e) {
			e.printStackTrace();
		}
                
		
	}
	
        public User getUser(int Pos){
            return Users.get(Pos);
        }
        
        public int getUserSize(){
            return Users.size();
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
        
        public int getExpenssesSize(){
            return ExpenssesTypes.size();
        }

        public ExpenssesTypes getTypes(int Pos){
            return this.ExpenssesTypes.get(Pos);
        }
        
        public void getExpenssesData(int Parent){
            
                    
            Expensses.clear();
            
                        String Select_EXP = "SELECT * FROM `Exp` WHERE `Parent` = " + Parent;
                        
                        ResultSet rsExp;
            try {
                         if(connect.isClosed())
				Connect();
                         
                rsExp = connect.createStatement().executeQuery(Select_EXP);
           
			if(rsExp != null)
			while(rsExp.next()){
				Expensses Exp = new Expensses();
				
                                Exp.setName(rsExp.getString("Name"));
                                Exp.setSerial(rsExp.getString("Siral"));
                                Exp.setNumber(rsExp.getString("Number"));
                                Exp.setCompany(rsExp.getString("Com"));
                                Exp.setOther(rsExp.getString("Other"));
                                Exp.setModel(rsExp.getString("Model"));
                                Exp.setPK(rsExp.getInt("PK"));
                                Expensses.add(Exp);
				
			}
			else System.out.println("There is no Expenses");
                        
                        connect.close();
                        
                         } catch (SQLException ex) {
                Logger.getLogger(DataBaseManger.class.getName()).log(Level.SEVERE, null, ex);
            }
                        
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
				 "ID CHARACTER ,"+
				 "Section CHARACTER," +
				 "Name CHARACTER,"+
                                 "Phone CHARACTER,"+
                                 "Job CHARACTER ,"+
                                 "Email CHARACTER,"+
                                 "PK Integer PRIMARY KEY AUTOINCREMENT );";
                 
                 String CreateE_Table = "CREATE TABLE Exp(" +  
                                 "Name CHARACTER," +
                                 "Siral CHARACTER,"+
				 "Number CHARACTER," +
				 "Com CHARACTER," +
				 "Other CHARACTER,"+
                                 "Model CHARACTER,"+
                                 "Parent Integer REFERENCES E(PK),"+
                                 "PK Integer PRIMARY KEY AUTOINCREMENT );";
		
                 String Create_User = "CREATE TABLE Users(" +  
                                 "Username CHARACTER," +
				 "Password CHARACTER,"+
                                 "Authorize TINYINT(1),"+
                                 "PK Integer PRIMARY KEY AUTOINCREMENT);";
                 
                 String Create_ExpT = "CREATE TABLE E(" +  
                                 "Name CHARACTER," +
                                 "PK Integer PRIMARY KEY AUTOINCREMENT);";
                 
		 String InsertData = "INSERT INTO Users(`Username` ,`Password` ,`Authorize` ) VALUES ('"+
		 Admin_UserName + "' , '" +
		 Admin_PassWord + "' , 0);";
		 
		 Connect();
		 
		 try {
			connect.createStatement().execute(Create_Table);
			System.out.println("Created Table");
                                                
                        connect.createStatement().execute(Create_User);
			System.out.println("Users Have Bean Inserted");
                        
			connect.createStatement().execute(InsertData);
			System.out.println("Data Have Bean Inserted");
                        
                        connect.createStatement().execute(Create_ExpT);
			System.out.println("Exp Types Have Bean Inserted");
                        
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
                                        "' , `Phone`='" + emp.getPhone() + "' ,`Job`=  '" + emp.getJob() + "' , `Email` = '"+ emp.getEmail()+
					"' , `ID`= '" + emp.getID() + "' WHERE `PK`=" + emp.getPK();
			
			connect.createStatement().execute(updateQury);
			System.out.println("Data has Bean updated");
			Close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
        
        public void UpdateUsers(User user){
            
            		try {
			if(connect.isClosed())
				Connect();
			
			String updateQury = "UPDATE `Users` SET `Username`='"+ user.getUserName() + "', `Password`='"+ user.getPassWord()+
                                        "' , `Authorize`=" + user.getAuthorize() + " WHERE `PK` = " + user.getPK() +";";
			
			connect.createStatement().execute(updateQury);
			System.out.println("Data has Bean updated");
			Close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
            
        }
        
        	public void DeleteUser(String username){
		
		try {
			if(connect.isClosed())
				Connect();
			
			String deleteQury = "DELETE FROM `Users` WHERE `Username` ='" + username+"';";
			
			connect.createStatement().execute(deleteQury);
			System.out.println("Data has Bean Deleted");
			Close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
        
	public void Delete(String id){
		
		try {
			if(connect.isClosed())
				Connect();
			
			String deleteQury = "DELETE FROM `Employee` where ID =" + id+";";
			
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
			
			String AddQury = "INSERT INTO `Employee` (`Name` , `Section` , `ID` , `Phone` , `Email` , `Job`) " +
					"VALUES ('"+ emp.getName() + "' , '" + emp.getSection() + "','" + emp.getID() +"','" + emp.getPhone() + "','" + emp.getEmail() + "',"
                                        +"'" + emp.getJob() +  "');";
			
			connect.createStatement().execute(AddQury);
			System.out.println("Data has Bean Added");
			
			Close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
        
        
        public void AddUser(User user){
		
		try {
			if(connect.isClosed())
				Connect();
			
			String AddQury = "INSERT INTO `Users` (`Username` , `Password` , `Authorize` ) " +
					"VALUES ('" + user.getUserName() +"' , '" + user.getPassWord() + "'," + user.getAuthorize() +");";
			
			connect.createStatement().execute(AddQury);
			System.out.println("Data has Bean Added");
			
			Close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
                
        public void AddExp(Expensses exp){
		
		try {
			if(connect.isClosed())
				Connect();
			
			String AddQury = "INSERT INTO `Exp` (`Name` , `Siral` , `Number` , `Com` , `Other` , `Model`  , `Parent`) " +
					"VALUES ('"+ exp.getName() + "' , '" + exp.getSerial() + "','" + exp.getNumber() +  "','"+
					exp.getCompany() + "','" + exp.getOther() +"'," +" ' " + exp.getModel() + "',' " + exp.getParent() +  "');";
			
			connect.createStatement().execute(AddQury);
			System.out.println("Expensses has Bean Added");
			
			Close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
        
        public void UpdateExp(Expensses exp){
            
            		try {
			if(connect.isClosed())
				Connect();
			
			String updateQury = "UPDATE `Exp` SET `Name`='"+ exp.getName() + "', `Number`='"+ exp.getNumber()+
					"', `Model` = '"+ exp.getModel() +"' , `Com`= '" + exp.getCompany()  +
                                        "', `Other`='" + exp.getOther() + "', `Siral` = '" +exp.getSerial() + "' WHERE PK=" + exp.getPK();
			
			connect.createStatement().execute(updateQury);
			System.out.println("Data has Bean updated");
			Close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
            
        }
        
        public void DeleteExp(int PK){
            
            		try {
			if(connect.isClosed())
				Connect();
			
			String deleteQury = "DELETE FROM `Exp` where `PK` =" +PK+";";
			
			connect.createStatement().execute(deleteQury);
			System.out.println("Data has Bean Deleted");
			Close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
            
        }
        
        public void ADDETypes(String Name){
            
                    try {
			if(connect.isClosed())
				Connect();
			
			String AddQury = "INSERT INTO `E` ( `Name` ) VALUES ('" + Name+"' );";
			
                        connect.createStatement().execute(AddQury);
			System.out.println("Data has Bean Added");
			Close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
            
        }
	
}
