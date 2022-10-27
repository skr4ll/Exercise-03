/** Hausaufgabe 3 von Philipp */

public class Exercise03 {
	
	
	public static void main(String[] args) {		
		
		//2 double Werte multiplizieren und durch 7 teilen
		System.out.println("\n\n\t1. Aufgabe (Floatprodukt durch 7 teilen):\n\n\tErgebnis von 3.01 * 7.02 / 7 liefert als int:  " + func1(3.01,7.02) + "\n\n");
				
		//Wieivel ist vom Jahr bereits vergangen?
		//System.out.println("\nFolgender Anteil des Jahres vergangen:  " + dayOfYear(30,6) + "\n"); //MEIN TEST = 0.5
		System.out.println("\t2. Aufgabe (Anteil des Jahres): \n\n\tAm 01. Januar ist folgender Anteil des Jahres vergangen:  " + dayOfYear(1,1));	// liefert 0.00277778
		System.out.println("\tAm 15. Juli ist folgender Anteil des Jahres vergangen:  " + dayOfYear(15,7));	// liefert 0.54166667
		System.out.println("\tAm 30. Dezember ist folgender Anteil des Jahres vergangen:  " + dayOfYear(30,12) + "\n\n");	// liefert 1.0
		
		//Ist Zahl ungerade?
		System.out.println("\t3. Aufgabe (Ist Zahl ungerade?):\n\n\tZahl 3 ist ungerade =  " + isOdd(3));
		System.out.println("\tZahl 4 ist ungerade =  " + isOdd(4));
		System.out.println("\tZahl -3 ist ungerade =  " + isOdd(-3));
		System.out.println("\tZahl -4 ist ungerade =  " + isOdd(-4) + "\n");
							
	}

	//2 double Werte multiplizieren und durch 7 teilen

	static int func1(double a, double b){
		int ergebnis = (int) (a * b / 7);
		
	return ergebnis;
	}
	
//Wieviel ist vom Jahr bereits vergangen?
	
	static float dayOfYear(int tag, int monat) {
		float vergangeneTage = (monat * 30) - (30 - tag);
		float anteil = vergangeneTage / 360;
		
	return anteil;
	} 
	
	//Ist Zahl ungerade?
	
		static boolean isOdd(int a) {
			boolean check = a % 2 > 0 || a % 2 < 0;	
			
		return check;
		}
}