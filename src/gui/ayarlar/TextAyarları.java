package gui.ayarlar;

import java.awt.Color;
import javax.swing.JTextField;

public class TextAyarları {

    private static String original;
    private static Color originalcolor;

    public static void FocusGained(JTextField text, String org) {

        originalcolor = text.getForeground();
        original = org;

        if (text.getText().trim().equals(original)) {
            text.setText("");
        } 
        text.setForeground(Color.BLACK);
        

    }

    public static void FocusLost(JTextField text, String org) {

        original = org;
        if (text.getText().trim().equals("")) {
            text.setText(original);
        } 
        text.setForeground(originalcolor);
    }

}
