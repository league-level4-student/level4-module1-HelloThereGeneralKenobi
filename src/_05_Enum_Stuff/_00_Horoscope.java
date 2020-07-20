package _05_Enum_Stuff;

import javax.swing.JOptionPane;


public class _00_Horoscope {
	static // 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	void enumDisplay(Zodiac zodiac) {
		if(zodiac == Zodiac.ARIES) {
			JOptionPane.showMessageDialog(null, "hello");
		}
		if(zodiac == Zodiac.TAURUS) {
			JOptionPane.showMessageDialog(null, "hello");
		}
		if(zodiac == Zodiac.GEMINI) {
			JOptionPane.showMessageDialog(null, "hello");
		}
		if(zodiac == Zodiac.CANCER) {
			JOptionPane.showMessageDialog(null, "hello");
		}
		if(zodiac == Zodiac.LEO) {
			JOptionPane.showMessageDialog(null, "hello");
		}
		if(zodiac == Zodiac.VIRGO) {
			JOptionPane.showMessageDialog(null, "hello");
		}
		if(zodiac == Zodiac.LIBRA) {
			JOptionPane.showMessageDialog(null, "hello");
		}
		if(zodiac == Zodiac.SAGITTARIUS) {
			JOptionPane.showMessageDialog(null, "hello");
		}
		if(zodiac == Zodiac.AQUARIUS) {
			JOptionPane.showMessageDialog(null, "hello");
		}
		if(zodiac == Zodiac.PISCES) {
			JOptionPane.showMessageDialog(null, "hello");
		}
	}
	
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac aries = Zodiac.ARIES;
		enumDisplay(aries);
	}
	
}
