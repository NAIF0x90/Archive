package archive;

import Objects.EMP_INFO;
import Objects.Expensses;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;



/**
 *
 * @author NAIF
 */
public class Document {

    
    private Graphics g;
    private BufferedImage image;
    private int TEXTPOSITON_W;
    private int TEXTPOSITON_H;
    private Font ttfReal = null;
    private String N = "اسم الموظف : " ,  J = "المسمى الوظيفي : " , P = "رقم الجوال : ", ID = "هوية الموظف : ", E = "البريد الالكتروني : ", S = "القسم : "; 
    
    private String EN = "المصروف : " , ES = "الرقم التسلسلي : " , EO = "المتبقي : " , ENU = "العدد الكلي : " , EC = "الشركة : " , EM  = "الموديل : " ;
    
    private ResourcLoader res;
    
    public Document(ResourcLoader res)  {
     
        this.res = res;
        
        try{
        
                        Font ttfBase = null;
			InputStream myStream = new BufferedInputStream(this.res.getFont());
			ttfBase = Font.createFont(Font.TRUETYPE_FONT, myStream);
			ttfReal = ttfBase.deriveFont(Font.PLAIN, 24);
   
   

        image = ImageIO.read(this.res.getDoc());

        g = image.getGraphics();
        g.setColor(Color.BLACK);
        g.setFont(ttfReal.deriveFont(45f));
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }

    
    public void PrintEmployeeInfo(EMP_INFO emp){
        try {
            
            
        TEXTPOSITON_W = 1500;
        TEXTPOSITON_H = (image.getHeight()/ 2 ) / 2;
         

        int Sepr = 100;
        TEXTPOSITON_H += Sepr;
            
        N = N + emp.getName();
        P = P + emp.getPhone();
        J = J + emp.getJob();
        E = E + emp.getEmail();
        S = S + emp.getSection();
        ID= ID + emp.getID();


        //25
        g.drawString(N ,  TEXTPOSITON_W - g.getFontMetrics().stringWidth(N), TEXTPOSITON_H);
        TEXTPOSITON_H += Sepr;
        g.drawString(ID, TEXTPOSITON_W - g.getFontMetrics().stringWidth(ID), TEXTPOSITON_H);
        TEXTPOSITON_H += Sepr;
        g.drawString(J , TEXTPOSITON_W - g.getFontMetrics().stringWidth(J), TEXTPOSITON_H);
        TEXTPOSITON_H += Sepr;
        g.drawString(S,  TEXTPOSITON_W - g.getFontMetrics().stringWidth(S), TEXTPOSITON_H);
        TEXTPOSITON_H += Sepr;
        g.drawString(E,  TEXTPOSITON_W - g.getFontMetrics().stringWidth(E), TEXTPOSITON_H);
        TEXTPOSITON_H += Sepr;
        g.drawString(P , TEXTPOSITON_W - g.getFontMetrics().stringWidth(P), TEXTPOSITON_H);        
        g.dispose();
        
        new Thread(new PrintActionListener(image)).start();         
        System.out.println("Document Have Bean Printed");

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
    
    public void PrintExpensses(Expensses exp){
        
        
          try {
            
            
        TEXTPOSITON_W = 1500;
        TEXTPOSITON_H = (image.getHeight()/ 2 ) / 2;
         

        EN = EN + exp.getName();
        ES = ES + exp.getSerial();
        EC = EC + exp.getCompany();
        EM = EM + exp.getModel();
        EO = EO + exp.getOther();
        ENU = ENU + exp.getNumber();

        int Sepr = 100;
        TEXTPOSITON_H += Sepr;

        g.drawString(EN ,  TEXTPOSITON_W - g.getFontMetrics().stringWidth(EN), TEXTPOSITON_H);
        TEXTPOSITON_H += Sepr;
        g.drawString(EC, TEXTPOSITON_W - g.getFontMetrics().stringWidth(EC), TEXTPOSITON_H);
        TEXTPOSITON_H += Sepr;
        g.drawString(EM , TEXTPOSITON_W - g.getFontMetrics().stringWidth(EM), TEXTPOSITON_H);
        TEXTPOSITON_H += Sepr;
        g.drawString(ENU,  TEXTPOSITON_W - g.getFontMetrics().stringWidth(ENU), TEXTPOSITON_H);
        TEXTPOSITON_H += Sepr;
        g.drawString(EO,  TEXTPOSITON_W - g.getFontMetrics().stringWidth(EO), TEXTPOSITON_H);
        TEXTPOSITON_H += Sepr;
        g.drawString(ES , TEXTPOSITON_W - g.getFontMetrics().stringWidth(ES), TEXTPOSITON_H);        
        g.dispose();
        
        new Thread(new PrintActionListener(image)).start();         
        System.out.println("Document Have Bean Printed");

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }
    

}