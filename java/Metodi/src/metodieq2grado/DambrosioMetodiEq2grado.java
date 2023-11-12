/*metodo che prende in input i coefficienti di un equazione di secondo grado e che restituisce un array di due double 
 * contenente i risultati dell'equazione.  
 */
package metodieq2grado;

import java.util.Scanner;

public class DambrosioMetodiEq2grado {
	
	static double calcolaDelta(double a, double b, double c) {
		return b * b - 4 * a * c;
	}

	static double[] calcolaRadici(double a, double b, double c) {
		double delta = calcolaDelta(a, b, c);
		
		double[] radici = new double[2];
		
		double deltaQuarti=(b/2)*(b/2) - a*c;
		double deltaQuarti1=(b/2)*(b/2) - c;

		if (delta < 0) {
			System.out.println("L'equazione non ha soluzioni reali.");
		} else if (delta == 0) {
			radici[0] = -b / (2 * a);
			System.out.println("L'equazione ha una radice reale e coincidente: " + radici[0]);
		} else {
			if(b % 2 == 0){
				radici[0] = (-b/2 + Math.sqrt(deltaQuarti)) / a;
				radici[1] = (-b/2 - Math.sqrt(deltaQuarti)) / a;
			}
			else if(a == 1 && b % 2 == 0) {
				radici[0] = (-b/2 + Math.sqrt(deltaQuarti1));
				radici[1] = (-b/2 - Math.sqrt(deltaQuarti1));
			}
			radici[0] = (-b + Math.sqrt(delta)) / (2 * a);
			radici[1] = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("L'equazione ha due radici reali: " + radici[0] + " e " + radici[1]);
		}
		return radici;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a = 0;
		while (a == 0) {
			System.out.println("Inserisci il coefficiente quadratico diverso da 0 (altrimenti è un'equazione di primo grado): ");
			a = scanner.nextDouble();
		}

		System.out.println("Inserisci il coefficiente lineare: ");
		double b = scanner.nextDouble();

		System.out.println("Inserisci il termine noto: ");
		double c = scanner.nextDouble();

		double[] radici = calcolaRadici(a, b, c);
		
		scanner.close();
	}
}
