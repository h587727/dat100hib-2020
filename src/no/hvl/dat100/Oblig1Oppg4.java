package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class Oblig1Oppg4 {

	public static void main(String[] args) {
		
		String inntekt = showInputDialog("skriv inn din bruttoinntekt");
		int inntekt1 = Integer.parseInt(inntekt);
		double skatt = 0;
		
		if (inntekt1 <= 164100)
			skatt = 0;
		else if (inntekt1 <= 230950)
			skatt = 0.0093 * inntekt1;
		else if (inntekt1 <= 580650)
			skatt = 0.0241 * inntekt1;
		else if (inntekt1 <= 934050)
			skatt = 0.1152 * inntekt1;
		else if (inntekt1 >= 934051)
			skatt = 0.1452 * inntekt1;
		System.out.println(skatt);
			
		
	}
	
	
	
}