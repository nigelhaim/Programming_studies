import java.awt.*;

public class MyColorCalculator{
	private Frame f;
	private Panel p; 

	//Containers
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

		f.add(pr);
		f.add(pg);
		f.add(pb);
		f.add(pa);
		f.add(bp);
		f.add(cp);

		f.setLayout(new GridLayout(6,2));
		f.setSize(400,350);
		
		f.setVisible(true);
	}

	public static void main(String args[]) {
		MyColorCalculator cc = new MyColorCalculator();
		cc.startApp();
	}
}