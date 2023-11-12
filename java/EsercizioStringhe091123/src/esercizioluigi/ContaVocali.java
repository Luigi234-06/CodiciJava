/*
 * Obiettivo: Scrivere un programma Java che permetta all'utente di inserire una frase, quindi calcoli e visualizzi il numero di vocali presenti nella frase utilizzando metodi.
Istruzioni:	
Crea un programma Java chiamato "ContaVocali" che includa un metodo main.
Nel metodo main, inizia con un messaggio di benvenuto e chiedi all'utente di inserire una frase. Leggi la frase da input e memorizzala in una variabile di tipo String.	
Crea un metodo chiamato contaVocali(String frase) che prenda una stringa frase come argomento e restituisca il numero di vocali presenti nella frase. Considera sia vocali minuscole che maiuscole.
Nel metodo main, chiama il metodo contaVocali per ottenere il numero di vocali nella frase inserita dall'utente.	
Visualizza il risultato del conteggio delle vocali a schermo.	
Gestisci eventuali errori o input non valido in modo appropriato.
Questa traccia ti permetterà di praticare la manipolazione di stringhe e la creazione di metodi per eseguire operazioni specifiche
*/
package esercizioluigi;

import java.util.Scanner;

public class ContaVocali {
	
	public static int ContaVocaliStringa(String frase) {
		int dimensione = frase.length(),c=0;
		for(int i=0;i<dimensione;i++) {
			if(frase.charAt(i)== 'a'|| frase.charAt(i)=='A'||
			   frase.charAt(i)== 'e'|| frase.charAt(i)=='E'||
			   frase.charAt(i)== 'i'|| frase.charAt(i)=='I'||
			   frase.charAt(i)== 'o'|| frase.charAt(i)=='O'||
			   frase.charAt(i)== 'u'|| frase.charAt(i)=='U') {
			
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Inserisci una frase : ");
			String frase = sc.nextLine();
		
			System.out.println("Numero vocali maiuscole/minuscole presenti nella frase : " + ContaVocaliStringa(frase));

		}catch(Exception e) {
			System.out.println("Non e' possibile contare quante vocali ci sono.");
		}finally {
			sc.close();
		}
	}
}
