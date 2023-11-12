/*classe triangolo rettangolo:attributi c1,c2,i
 * metodi:perimetro,area,setCateto1,setCateto2,setIpotenusa.
*/
package dambrosioesercizio0711234;

import java.util.Scanner;

public class DambrosioEsercizio071123 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double c1,c2,i;
		try {
				System.out.println("Inserisci il cateto 1 : ");
				c1 = sc.nextDouble();
			
				System.out.println("Inserisci il cateto 2 : ");
				c2 = sc.nextDouble();

				System.out.println("Inserisci l'ipotenusa : ");
				i = sc.nextDouble();
			
				TriangoloRettangolo t = new TriangoloRettangolo();
		
				t.setCateto1(c1);
				t.setCateto2(c2) ;
				t.setIpotenusa(i);
				t.calcola();
				
				System.out.println("Area triangolo rettangolo : " + t.calcolaArea());
				System.out.println("Perimetro triangolo rettangolo : " + t.calcolaPerimetro());
		
		}catch(Exception e ){
			System.out.println("Non posso calcolare ne l'area e ne il perimetro.");
		}finally {
			sc.close();
		}
		
	}

}
