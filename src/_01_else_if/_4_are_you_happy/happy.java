package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class happy {
public static void main(String[] args) {
	String happy = JOptionPane.showInputDialog("ARE YOU HAPPY?");
	if (happy.equalsIgnoreCase("YES")) {
		JOptionPane.showMessageDialog(null, "KEEP DOING WHATEVER YOU ARE DOING");
	}
	else if (happy.equalsIgnoreCase("NO")) {
		String answer = JOptionPane.showInputDialog("DO YOU WANT TO BE HAPPY?");
	if (answer.equalsIgnoreCase("YES")) {
	JOptionPane.showMessageDialog(null, "CHANGE SOMETHING");
	}
	else {
		JOptionPane.showMessageDialog(null, "KEEP DOING WHATEVER YOU ARE DOING");
	}
	}
	
}
}
