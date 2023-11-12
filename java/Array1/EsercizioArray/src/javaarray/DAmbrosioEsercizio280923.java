package javaarray;
import java.util.*;

public class DAmbrosioEsercizio280923 {

	
	
	public static void caricaVet(int v[],int n,Scanner sc) {
		for(int i=0;i<n;i++) {
			v[i] = sc.nextInt();
		}
		
	}
	
	public static void vediVet(int v[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(v[i] + " ; ");
		}
		System.out.println();
	}
	
	public static void elementiDuplicati(int v[],int n) {
		for(int i = 0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(v[i]==v[j]) {
					System.out.println("I numeri duplicati sono : " + v[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci la dimensione dell'array : ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		caricaVet(vet,n,sc);
		vediVet(vet,n);
		
		elementiDuplicati(vet,n);
		
		

	}
	
}
