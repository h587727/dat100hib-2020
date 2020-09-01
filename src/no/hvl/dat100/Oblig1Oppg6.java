package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
public class Oblig1Oppg6 {
public static void main(String[] args) {
/*Lag et program som leser inn et heltall n > 0, beregner verdien n! (n fakultet) og skriver verdien til n! der n! = 1*2*3*…*(n-1)*n.*/
	
	
	int n = Integer.parseInt(showInputDialog("skriv inn hele tall (n"));
	int resultat = 1;
	for (int i = 1; i <= n; i++) {
		 resultat *= i;
		 
	}

		showMessageDialog (null," n! = " + resultat);
		
	}
	
	

}
