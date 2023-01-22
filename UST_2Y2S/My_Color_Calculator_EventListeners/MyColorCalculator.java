import java.awt.*;
import java.awt.event.*;

public class MyColorCalculator implements ActionListener
{
	//Containers
	private Frame f;
	private Panel p; 

	private Panel pr, pg, pb, pa, bp, cp; 		
	
	//Components
	private Label r, g, b, a;
	private TextField tr, tg, tb, ta;
	private Button comp, clear;
	
	public MyColorCalculator(){
		//Container
		f = new Frame("My Color Calculator");

		//Panels for textfields
		pr = new Panel();
		pr.setLayout(new BorderLayout());

		pg = new Panel();
		pg.setLayout(new BorderLayout());
		
		pb = new Panel();
		pb.setLayout(new BorderLayout());

		pa = new Panel();
		pa.setLayout(new BorderLayout());

		//Panels for buttons
		bp = new Panel();
		bp.setLayout(new FlowLayout());

		//Panel for the changeable color
		cp = new Panel();

		//Label Components
		r = new Label("Red");
		g = new Label("Green");
		b = new Label("Blue");
		a = new Label("Alpha");

		//Textfield components
		tr = new TextField("0", 15);
		tg = new TextField("0", 15);
		tb = new TextField("0", 15);
		ta = new TextField("0", 15);

		//Button components
		comp = new Button("Compute");
		clear = new Button("Clear");
	}
	public void startApp(){

		//Red
		pr.add(r, BorderLayout.WEST);
		pr.add(tr, BorderLayout.EAST);

		//Green
		pg.add(g, BorderLayout.WEST);
		pg.add(tg, BorderLayout.EAST);

		//Blue
		pb.add(b, BorderLayout.WEST);
		pb.add(tb, BorderLayout.EAST);

		//Alpha
		pa.add(a, BorderLayout.WEST);
		pa.add(ta, BorderLayout.EAST);

		//Buttons
		bp.add(comp);
		bp.add(clear);

		cp.setSize(200,200);
		//Color c = new Color(0, 0, 0, 0);
		//cp.setBackground(c);

		f.add(pr);
		f.add(pg);
		f.add(pb);
		f.add(pa);
		f.add(bp);
		f.add(cp);

		f.setLayout(new GridLayout(6,2));
		f.setSize(400,350);
		
		f.setVisible(true);

		//listeners to the buttons
		comp.addActionListener(this);
		clear.addActionListener(this);

		f.addWindowListener(new CloseProgram());
	}

	public void actionPerformed(ActionEvent e){
		cp.removeAll();
		System.out.println("Button Clicked");
		Object source = e.getSource();
		int red_value = 0, blue_value = 0, green_value = 0, alpha_value = 0;
		
		if(source == comp){
			try{
				if(tr.getText() != null && tg.getText() != null && tb.getText() != null && ta.getText() != null){
					red_value = Integer.parseInt(tr.getText());
					green_value = Integer.parseInt(tg.getText());
					blue_value = Integer.parseInt(tb.getText());
					alpha_value = Integer.parseInt(ta.getText());
					
					System.out.println("The value for red is:" + red_value);
					System.out.println("The value for green is:" + green_value);
					System.out.println("The value for blue is:" + blue_value);
					System.out.println("The value for alpha is:" + alpha_value);
					
					Color c = new Color(red_value, green_value, blue_value, alpha_value);
					cp.setBackground(c);
				}
			}

			catch(NumberFormatException num){
				String s = "Please input an integer";
				System.out.println(s);
				Label l = new Label(s);
				cp.add(l);
			}
			catch(IllegalArgumentException iae){
				String s = "Values 0 - 255 only";
				System.out.println(s);
				Label l = new Label(s);
				cp.add(l);
			}
			catch(Exception ex){
				String s = "An exception";
				System.out.println(s);
				Label l = new Label(s);
				cp.add(l);
			}
		}
		else if(source == clear){
			tr.setText("0");
			tg.setText("0");
			tb.setText("0");
			ta.setText("0");
			//Color c = new Color(0, 0, 0, 0);
			//cp.setBackground(c);
		}
		else{
			//Do Nothing
		}
		
	}
	private class CloseProgram extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}

	public static void main(String args[]) {
		MyColorCalculator cc = new MyColorCalculator();
		cc.startApp();
	}
}