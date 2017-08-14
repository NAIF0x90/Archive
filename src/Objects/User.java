/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author NAIF
 */
public class User {
 
        private String UserName;
        private String PassWord;
        private int Authorize;
        private int PK;

    /**
     * @return the UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * @return the PassWord
     */
    public String getPassWord() {
        return PassWord;
    }

    /**
     * @param PassWord the PassWord to set
     */
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    /**
     * @return the Authorize
     */
    public int getAuthorize() {
        return Authorize;
    }

    /**
     * @param Authorize the Authorize to set
     */
    public void setAuthorize(int Authorize) {
        this.Authorize = Authorize;
    }

    /**
     * @return the PK
     */
    public int getPK() {
        return PK;
    }

    /**
     * @param PK the PK to set
     */
    public void setPK(int PK) {
        this.PK = PK;
    }
    
    
}
