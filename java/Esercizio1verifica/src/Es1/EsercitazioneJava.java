package Es1;

import java.util.Scanner;

public class EsercitazioneJava {
	
	public static void caricaVet(int v[]) {
		Scanner sc = new Scanner (System.in);
		for(int i=0;i<10;i++) {
			v[i] = sc.nextInt();
		}
		sc.close();
	}
	
	public static void vediVet(int v[]) {
		for(int i=0;i<10;i++) {
			System.out.print(v[i] + " ; ");
		}
		System.out.println();
	}
	
	public static int piccoMax(int v[]) {
		int appValoreMax = v[0],appIndiceMax=0;
		for(int y = 1; y < 9; y++) {
			if(v[y]>appValoreMax) {
				appValoreMax = v[y];
				appIndiceMax = y;
			}
		}
		return appIndiceMax;
	}
	
	public static int piccoMin(int v[]) {
		int j = piccoMax(v);
		int appValoreMin = v[0],appIndiceMin = 0;
		for(int i = 1;i < j;i++) {
			if(v[i]<appValoreMin) {
				appValoreMin = v[i];
				appIndiceMin = i;
			}
		}
		return appIndiceMin;
	}
	
	public static int profittoMax(int v[]) {
		int i = piccoMin(v);
		int j = piccoMax(v);
		
		int maxGuadagno = v[j]-v[i];
		
		return maxGuadagno;
	}

	public static void main(String[] args) {
		
		
		System.out.println("Ora inserisci 10 stime dei prezzi del grano ;");
		
		int vettore[] = new int[10];
		
		caricaVet(vettore);
		vediVet(vettore);
		
		int profitto = profittoMax(vettore);
		System.out.println("Il massimo guadagno realizzato dal distributore e' di " + profitto + " euro");
		
	}

}
