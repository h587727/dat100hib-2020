package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oblig1Oppg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 10; i++) {
			String poeng = showInputDialog("skriv inn poengsum");
			int poengsum = Integer.parseInt(poeng);
			if (poengsum > 100 || poengsum < 0) {
				System.out.println("FEILMELDING");
				i--;
				continue;
				
			}
			char karakter = 0;
			
			if (poengsum <= 39)
				karakter = 'F';
			else if (poengsum <= 49)
				karakter = 'E';
			else if (poengsum <= 59)
				karakter = 'D';
			else if (poengsum <= 79)
				karakter = 'C';
			else if (poengsum <= 89)
				karakter = 'B';
			else if (poengsum <= 100)
				karakter = 'A';
			
			
			System.out.println(karakter);
		}
		
		
		
	}
	
	
}