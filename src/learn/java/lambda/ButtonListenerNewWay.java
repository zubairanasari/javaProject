package learn.java.lambda;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionListener;

public class ButtonListenerNewWay {

	public static void main(String[] args) {
		Frame frame = new Frame("ActionListener before java8");
		
		Button b = new Button("Click Me!");
		b.setBounds(50, 100, 80, 50);
		
		/*b.addActionListener( e -> {
				System.out.println("Hello World");
			});*/
		
		ActionListener al = e -> System.out.println("Hello World!");
		b.addActionListener(al);
		
		frame.add(b);
	    
	    frame.setSize(200,200);  
	    frame.setLayout(null);  
	    frame.setVisible(true);
	}

}
