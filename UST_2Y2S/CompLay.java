import java.awt.*;
public class CompLay extends Frame{
  public static void main(String argv[]){
     CompLay cl = new CompLay();
  }
  CompLay(){
     Panel p = new Panel();
     p.setBackground(Color.pink);
     p.add(new Button("One"));
     p.add(new Button("Two"));
     p.add(new Button("Three"));
     add("South",p);
     setLayout(new FlowLayout());
     setSize(300,300);
     setVisible(true);
  }
}
