package exoCyril;

import java.util.Scanner;

public class saisieRayon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int rayon = 0;
	System.out.println("Veuillez saisir un rayon : ");
	
	Scanner entreeRayon = new Scanner(System.in);
	rayon = Integer.parseInt(entreeRayon.nextLine());
	
	double perimetreCalcule = 2 * Math.PI * rayon;
	
	System.out.println("Le périmètre du cercle est de : " + perimetreCalcule);

	}

}
