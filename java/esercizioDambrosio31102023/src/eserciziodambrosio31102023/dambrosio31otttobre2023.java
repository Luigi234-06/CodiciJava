/*Scrivere un programma che chiede all'utente array interi,il main invoca un metodo che restituisce la 
 * media pesata rispetto alla posizione dell'array.
 * 
*/
package eserciziodambrosio31102023;

import java.util.Scanner;

public class dambrosio31otttobre2023 {
	
	 static double mediaPesata(int[] vet) {
		 double sommaProdotti=0;
		 double sommaPesi=0;
		 
		 for(int i=0;i<vet.length;i++) {
			 sommaProdotti+=vet[i]*i;
			 sommaPesi+=i;
		 }
		 
		 double mediaPonderata = sommaProdotti/sommaPesi;
		 
		 return mediaPonderata;
	 }
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanti elementi vuoi inserire nell'array ? : ");
		int dimensione = sc.nextInt();
		
		int[] vet = new int[dimensione];
		
		for(int i=0;i<vet.length;i++) {
			vet[i]=sc.nextInt();
		}
		
		double mediaPonderata = mediaPesata(vet);
		
		System.out.println("La media pesata e' : " + mediaPonderata);
		
		sc.close();
	}

}
