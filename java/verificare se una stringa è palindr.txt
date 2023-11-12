//verificare se una stringa è palindroma;

package esercizioverifica;


import java.util.Scanner;

public class DambrosioRecupero {
	
	public static void riempiStringa(char v[],Scanner sc,int n ) {
		System.out.println();
		for(int i =0;i<n;i++) {
			v[i]=sc.next().charAt(0);
		}
	}
	
	public static void vediStringa(char v[],int n) {
		for(int i =0;i<n;i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println();
	}
	
	public static boolean controlloPalindromo(char v[],int n) {
		boolean flag = true;
		
		int i = 0;
		while(i < n ){
		    if(v[i] != v[n-1-i]){
		        flag = false;
		    }
		    
		    i++;
		}
		return flag;
		
		
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("quanti caratteri vuoi inserire ? ");
		int n = sc.nextInt();
		
		char[] vet = new char[n];
		
		System.out.println("Riempi il vettore di caratteri : ");
		
		riempiStringa(vet,sc,n);
		vediStringa(vet,n);
		
		boolean p;
		p=controlloPalindromo(vet,n);
		if(p==true) {
			System.out.println("La stringa e' palindroma.");
		}
		else {
			System.out.println("La stringa non e' palindroma.");
		}

	}
	sc.close();

}