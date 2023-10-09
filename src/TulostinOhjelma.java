
public class TulostinOhjelma {

	public static void main(String[] args) {
		// tulostetaan "hei olen tulostin ohjelma"
		System.out.println("Hei olen Tulostin-ohjelma");
		
		// tulostetaan ohjelman tekijä
		String tekija ;
		tekija = "Ville Moitus";
		System.out.print("Ohjelman tekijä: ");
		System.out.println(tekija);
		
		//määritettään ja tulostetaan luku1
		double luku1 = 5.0;
		System.out.println("Luku1-muuttujan arvo on " + luku1);
		
		//määritetään ja tulostetaan luku2 
		double luku2 = 2.0;
		 System.out.println("Luku2-muuttujan arvo on " + luku2);
		
		//tehdään kolmas muuttuja tulo
		 double tulo;
		tulo = luku1 *luku2;
		System.out.println(luku1 + " * " + luku2 + " = " + tulo);
		
		//laskutoimitukset 
		double erotus = luku1 - luku2;
		double summa = luku1 + luku2;
        double jako = (double) luku1 / luku2;
		
		
	}

}
