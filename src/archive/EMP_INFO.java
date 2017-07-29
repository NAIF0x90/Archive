package archive;


public class EMP_INFO {

	private String Name;
	private String Section;
	private int ID;
	private double Success;
        private String Phone;
        private String Job;
        private String Email;
        private String PassWord;

        
        
	public String getPassWord() {
		return PassWord;
	}



	public void setPassWord(String passWord) {
		PassWord = passWord;
	}



	
	
	public EMP_INFO() {
		// TODO Auto-generated constructor stub
	}

	

	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getSection() {
		return Section;
	}



	public void setSection(String Section) {
		this.Section = Section;
	}



	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public double getSuccess() {
		return Success;
	}



	public void setSuccess(double success) {
		Success = success;
	}

    /**
     * @return the Phone
     */
    public String getPhone() {
        return Phone;
    }

    /**
     * @param Phone the Phone to set
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * @return the Job
     */
    public String getJob() {
        return Job;
    }

    /**
     * @param Job the Job to set
     */
    public void setJob(String Job) {
        this.Job = Job;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }




	
	
	
	
}
