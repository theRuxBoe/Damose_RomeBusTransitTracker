package frontend;

import java.awt.Frame;

//import java.awt.Frame;

import javax.swing.*;

public class MapViewer {
	
	private JFrame frame;

	public void setFrame() {
		JFrame frame = new JFrame();
		this.frame = frame;
		JButton b = new JButton();
		frame.add(b);
		frame.pack();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
		System.out.println("hello frame");
		System.out.println("hello world");
	}
		
	public static void main(String[] args) {
		MapViewer a = new MapViewer();
		a.setFrame();
	
	}
		
		
}

