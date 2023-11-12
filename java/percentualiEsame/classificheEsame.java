/*In un concorso pubblico ogni candidato deve affrontare due prove, una scritta e una orale. Accedono
*alla prova orale i candidati che hanno ottenuto un punteggio sufficiente nella prova scritta. Caricare in
*un vettore i nominativi e i punteggi della prova scritta e stampare un elenco alfabetico riportandovi
*nominativo, punteggio, IDONEO/NON IDONEO. Caricare in un ulteriore vettore i punteggi della prova
*orale dei soli candidati idonei all'orale. Stilare la graduatoria definitiva per punteggio (media delle due
*prove), dal più alto al più basso. */


package percentualiEsame;

import java.util.Scanner;

public class classificheEsame {
	
	public static void caricaVetNomi(String vetNomi[],int n,Scanner sc) {
		for(int i=0;i<n;i++) {
			vetNomi[i]=sc.nextLine();
		}
	}
	
	public static void caricaVetPunteggi(int vetPs[],int n,Scanner sc) {
		for(int i=0;i<n;i++) {
			vetPs[i]=sc.nextInt();
		}
	}
	public static int controlloIdonei(int vetPs[],String nomiPs[],String nominativiIdonei[],int punteggiOraleIdonei[],int n,Scanner sc) {
		int i,c=0;
		for( i=0;i<n;i++) {
			if(vetPs[i]>=60 && vetPs[i]<=100) {
				System.out.print("inserisci il punteggio orale per " + nomiPs[i] + " : ");
				int punteggioOrale = sc.nextInt();
				nominativiIdonei[i] = nomiPs[i];
	            punteggiOraleIdonei[i] = punteggioOrale;
	            c++;
			}
		}
		return c;
	}

	public static void mediaProve(int vetPs[],int punteggiOraleIdonei[],String nominativiIdonei[],double punteggiTotali[],int dim) {
        for (int i = 0; i < dim; i++) {
            punteggiTotali[i] = (vetPs[i] + punteggiOraleIdonei[i] ) / 2.0;
        }
        for (int i = 0; i < dim - 1; i++) {
            for (int j = i + 1; j < dim; j++) {
                if (punteggiTotali[i] < punteggiTotali[j]) {
                    // Scambia punteggiTotali
                    double temp = punteggiTotali[i];
                    punteggiTotali[i] = punteggiTotali[j];
                    punteggiTotali[j] = temp;

                    // Scambia nominativiIdonei
                    String tempNominativo = nominativiIdonei[i];
                    nominativiIdonei[i] = nominativiIdonei[j];
                    nominativiIdonei[j] = tempNominativo;
                }
            }
        }
	}
	
	public static void stampaElenco(String vetNomi[],int vetPs[],int n) {
		System.out.println("Elenco alfabetico con IDONEO/NON IDONEO:");
        for (int i = 0; i < n; i++) {
            boolean idoneo = vetPs[i] >= 60;
            String stato = idoneo ? "IDONEO" : "NON IDONEO";
            System.out.println(vetNomi[i] + ", " + vetPs[i] + ", " + stato);
        }
	}
	
	public static void stampaGradDefinitiva(int dim,String nominativiIdonei[],double punteggiTotali[]) {
		System.out.println("\nGraduatoria definitiva per punteggio:");
        for (int i = 0; i < dim; i++) {
            System.out.println(nominativiIdonei[i] + ", " + punteggiTotali[i]);
        }
	}

	
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci il numero di quanti candidati sono presenti al concorso : ");
		int n = sc.nextInt();
	
		System.out.println("Inserisci i nominativi dei candidati : ");
		String[] vetCand = new String[n];
		sc.nextLine();
		caricaVetNomi(vetCand,n,sc);
		
		System.out.println("Inserisci il voto di ogni candidato alle prove scritte : ");
		int[] vetScritte = new int[n];
		caricaVetPunteggi(vetScritte,n,sc);
		
		String[] nominativiIdonei = new String[n];
        int[] punteggiOraleIdonei = new int[n];
        
        int app = controlloIdonei(vetScritte,vetCand,nominativiIdonei,punteggiOraleIdonei,n,sc);
        double[] punteggiTotali = new double[app];
        mediaProve(vetScritte,punteggiOraleIdonei,nominativiIdonei,punteggiTotali,app);
        
        stampaElenco(vetCand,vetScritte,n);
        
        stampaGradDefinitiva(app,nominativiIdonei,punteggiTotali);
        
		
		sc.close();
	}

}
