package archive;

import java.io.InputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAIF
 */
public class ResourcLoader {
    
    
    private final InputStream Font = getClass().getResourceAsStream("/res/m.ttf");
    private final InputStream Doc = getClass().getResourceAsStream("/res/doc.png");
    private final String Icon = getClass().getResource("/res/icon.png").getPath();
    private final String Background = getClass().getResource("/res/home.jpg").getPath();
    /**
     * @return the Font
     */
    public InputStream getFont() {
        return Font;
    }

    /**
     * @return the Icon
     */
    public String getIcon() {
        return Icon;
    }

    /**
     * @return the Doc
     */
    public InputStream getDoc() {
        return Doc;
    }

    /**
     * @return the Background
     */
    public String getBackground() {
        return Background;
    }



    
    
}
