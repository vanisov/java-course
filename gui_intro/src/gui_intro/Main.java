package gui_intro;

import javax.swing.JOptionPane;
// Need to import the JOptionPane to use GUI features

public class Main {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		// To show input GUI, we use .showInputDevice();
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are " + age + " years old!");
		
				
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (in feet)"));
		JOptionPane.showMessageDialog(null, "You are " + height + " feet tall!");
		//Works with any data type, just need to parse to the correct type. Few examples above ^
	}

}
