package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		
		switch(choice) {
		case "Monday": 
			System.out.println("why, who hurt you");
			break;
		case "Tuesday": 
			System.out.println("interesting choice");
			break;
		case "Wensday": 
			System.out.println("weird choice");
			break;
		case "Thursday": 
			System.out.println("alright, respectable");
			break;
		case "Friday": 
			System.out.println("TGIF!");
			break;
		case "Saturday": 
			System.out.println("Saturdays are for the boys!");
			break;
		case "Sunday": 
			System.out.println("Lazy sunday");
			break;
		default: 
			System.out.println("Something went wrong :(");
			break;
		}
		
	}
}
