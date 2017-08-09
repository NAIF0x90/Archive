package archive;

import Objects.EMP_INFO;
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
    
    public Document(String ImagePath , String FontPath)  {
     
        try{
        
                        Font ttfBase = null;
			InputStream myStream = new BufferedInputStream(new FileInputStream(FontPath));
			ttfBase = Font.createFont(Font.TRUETYPE_FONT, myStream);
			ttfReal = ttfBase.deriveFont(Font.PLAIN, 24);
   
   

        image = ImageIO.read(new File(ImagePath));

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
    

}