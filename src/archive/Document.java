package archive;

import Objects.EMP_INFO;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;



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

    
    public Document(String ImagePath , String FontPath)  {
     
        try{
        
   Font ttfBase = null;
		try {
			InputStream myStream = new BufferedInputStream(new FileInputStream(FontPath));
			ttfBase = Font.createFont(Font.TRUETYPE_FONT, myStream);
			ttfReal = ttfBase.deriveFont(Font.PLAIN, 24);
		} catch (Exception ex) {
	        ex.printStackTrace();
	        System.err.println("Font not loaded.");
	    }
   
   

    image = ImageIO.read(new File(ImagePath));

        g = image.getGraphics();
        g.setColor(Color.BLACK);
        g.setFont(ttfReal.deriveFont(50f));

        }catch(Exception e){
            e.printStackTrace();
        }
    
    }

    
    public void PrintEmployeeInfo(EMP_INFO emp){
        try {
            
            System.out.println(emp.getName());
            
    
        TEXTPOSITON_W = (image.getWidth() / 2 );
        TEXTPOSITON_H = (image.getHeight()/ 2 ) / 2;
         
        int Sepr = 100;
        TEXTPOSITON_H += Sepr;
        g.drawString("اسم الموظف : " , TEXTPOSITON_W, TEXTPOSITON_H);
        g.drawString(emp.getName() ,        TEXTPOSITON_W, TEXTPOSITON_H);
        TEXTPOSITON_H += Sepr;
        g.drawString("هوية الموظف : ", TEXTPOSITON_W, TEXTPOSITON_H);
        g.drawString(emp.getID() + "",      TEXTPOSITON_W, TEXTPOSITON_H);
        TEXTPOSITON_H += Sepr;
        g.drawString( "\t المسمى الوظيفي :  \t" + emp.getJob() , TEXTPOSITON_W, TEXTPOSITON_H);
        TEXTPOSITON_H += Sepr;
        g.drawString(  "\t القسم :  \t" +    emp.getSection(),   TEXTPOSITON_W, TEXTPOSITON_H);
        TEXTPOSITON_H += Sepr;
        g.drawString(  " البريد الالكتروني : " + emp.getEmail(),  TEXTPOSITON_W, TEXTPOSITON_H);
        TEXTPOSITON_H += Sepr;
        g.drawString( "رقم الجوال : " + emp.getPhone() ,         TEXTPOSITON_W, TEXTPOSITON_H);        
        g.dispose();
        ImageIO.write(image, "png", new File("C:\\Users\\NAIF\\Documents\\ArchiveStored\\test.png"));
        
        System.out.println("Document Have Bean Printed");

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
    
    
    
    
}