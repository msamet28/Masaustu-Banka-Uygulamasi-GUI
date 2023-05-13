<<<<<<< HEAD

package gui.ayarlar;


import java.awt.Color;
import javax.swing.JButton;

public class ButonAyarları {
   
   private static Color originalcolor;
   
   public static void setcolor(JButton button, Color color){
       originalcolor=button.getBackground();
       button.setBackground(color);
   }
   public static void resetcolor(JButton button){
       button.setBackground(originalcolor);
   }
 
   }
=======

package gui.ayarlar;


import java.awt.Color;
import javax.swing.JButton;

public class ButonAyarları {
   
   private static Color originalcolor;
   
   public static void setcolor(JButton button, Color color){
       originalcolor=button.getBackground();
       button.setBackground(color);
   }
   public static void resetcolor(JButton button){
       button.setBackground(originalcolor);
   }
 
   }
>>>>>>> 4979eb9 (first commit)
