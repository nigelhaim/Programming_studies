//Demonstration of event handling
import java.awt.*;
import java.awt.event.*;
public void MyWc extends Frame implements WindowListener{
   public static void main(String argv[]){
      MyWc mwc = new MyWc();
   }
   public void windowClosing(WindowEvent we){
      System.exit(0);
   }//End of windowClosing
   public void MyWc(){
      setSize(300,300);
      setVisible(true);
   }
}//End of class