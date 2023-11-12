package calcolocateti;

import java.util.Scanner;

public class  dambrosioCalcoloCatetiIpotenusa {
	
	public static double ipotenusa(float cat1,float cat2) {
		double ipotenusa;
		ipotenusa = Math.sqrt(cat1*cat1 + cat2*cat2);
		return ipotenusa;
	}
	
	public static double cateto(float cat1,float ipotenusa) {
		double cateto2;
		cateto2 = Math.sqrt(ipotenusa*ipotenusa - cat1*cat1);
		return cateto2;
	}
	
	public static void main(String[] args) {
		Scanner scFloat = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		int scelta;
		do{
		    
	    	System.out.println("Cosa vuoi calcolare ? 1)ipotenusa dati due cateti / 2) cateto data ipotenusa e cateto ");
	    	int n = scInt.nextInt();
		
	    	if(n==1) {
		    	System.out.println("Inserisci il cateto 1 : ");
		    	float cateto1 = scFloat.nextFloat();

		    	System.out.println("Inserisci il cateto 2 : ");
		    	float cateto2 = scFloat.nextFloat();
			
		    	double calcoloIpotenusa = ipotenusa(cateto1,cateto2);
			    System.out.println("L'ipotenusa vale : " + calcoloIpotenusa);
	    	}
	    	if(n==2) {
		    	System.out.println("Inserisci il cateto  : ");
		    	float cateto1 = scFloat.nextFloat();

		    	System.out.println("Inserisci l'ipotenusa : ");
		    	float ipotenusa = scFloat.nextFloat();
			
			    double calcoloCateto2 = cateto(cateto1,ipotenusa);
			    System.out.println("Il cateto vale : " + calcoloCateto2);
	    	}
	    	
		    System.out.println("Vuoi continuare ? 1)si 2)no ");
	    	scelta = scInt.nextInt();
	    	
		}while(scelta==1);
		
		System.out.println("Grazie per aver utlizzato il programma ! ");
		
		scInt.close();
		scFloat.close();
		
	}

}