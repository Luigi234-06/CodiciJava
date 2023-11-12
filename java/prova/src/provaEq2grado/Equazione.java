package provaEq2grado;

import java.util.Scanner;





public class Equazione {

	static int CalcoloDelta(int a,int b,int c) {
		
		int delta ;
		
		delta = b*b-4*a*c;
		
		return delta;
	}
	
	static void CalcoloRadici(int a,int b,int c) {
		
		int deltaInvocato = CalcoloDelta(a,b,c);
		
		if(deltaInvocato < 0) {
			System.out.println("La soluzione non ammette soluzioni nei numeri reali.");
		}
		else if(deltaInvocato == 0) {
			int x = -b/(2*a);
			System.out.println("Le soluzioni sono reali e coincidenti : " + x );
		}
		else {
			double x1 = -b + Math.sqrt(deltaInvocato)/(2*a);
			
			double x2 = -b- Math.sqrt(deltaInvocato)/(2*a);
			
			System.out.println("L'Equazione ammette due soluzioni reali differenti : " + x1 +" e " + x2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Inserisci il coefficiente quadratico : ");
		int a = sc.nextInt();
		
		System.out.println("Inserisci il coefficiente lineare : ");
		int b = sc.nextInt();
		
		System.out.println("Inserisci il termine noto : ");
		int c = sc.nextInt();
		
		sc.close();
		
		CalcoloRadici(a,b,c);

	}

}
