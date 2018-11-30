package learn.java.lambda;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerOldWay {

	public static void main(String[] args) {
		
		Frame frame = new Frame("ActionListener before java8");
		
		Button b = new Button("Click Me!");
		b.setBounds(50, 100, 80, 50);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello World");
			}
		});
		frame.add(b);
	    
	    frame.setSize(200,200);  
	    frame.setLayout(null);  
	    frame.setVisible(true);
	}

}
