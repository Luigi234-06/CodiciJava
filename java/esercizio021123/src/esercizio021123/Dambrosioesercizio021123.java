/*Scrivere un programma Java che consenta all'utente di inserire una serie di numeri, quindi calcoli la somma e 
 * il prodotto di questi numeri utilizzando metodi.

Istruzioni:

1. Crea un programma Java chiamato "Calcolatore" che includa un metodo `main`.

2. Nel metodo `main`, inizia con un messaggio di benvenuto e chiedi all'utente quanti numeri desidera sommare e moltiplicare. 
Leggi questo numero da input e memorizzalo in una variabile.

3. Crea un metodo chiamato `leggiNumeriDaInput(int n)` che prenda un intero `n` come argomento. 
Questo metodo dovrà leggere `n` numeri interi inseriti dall'utente e restituirli come un array di interi.

4. Crea un metodo chiamato `calcolaSomma(int[] numeri)` che prenda un array di numeri come argomento e 
calcoli la somma di tutti i numeri nell'array. Restituisci il risultato.

5. Crea un metodo chiamato `calcolaProdotto(int[] numeri)` che prenda un array di numeri come 
argomento e calcoli il prodotto di tutti i numeri nell'array. Restituisci il risultato.

6. Nel metodo `main`, chiama il metodo `leggiNumeriDaInput` per ottenere la serie di numeri dall'utente.

7. Utilizza i metodi `calcolaSomma` e `calcolaProdotto` per calcolare la somma e il prodotto dei numeri inseriti.

8. Visualizza i risultati della somma e del prodotto a schermo.

Assicurati di gestire errori o input non valido in modo adeguato, ad esempio se l'utente inserisce dati non numerici. 
E incoraggia la buona pratica nella struttura del codice, come l'uso di commenti per spiegare il funzionamento dei metodi.

*/
package esercizio021123;

import java.util.Scanner;

public class Dambrosioesercizio021123 {
	
	public static int[] leggereNumeriDaInput(int n,Scanner sc) {//metodo che prende in input i numeri inseriti dall'utente
		int[] vet = new int[n];
		for(int i=0;i<n;i++) {
			vet[i]=sc.nextInt();
		}
		return vet;
	}
	
	public static int calcolaSomma(int[] numeri) {//metodo che,una volta passati i numeri contenuti nel vettore,ne calcola la somma.
		int somma=0;
		for(int i=0;i<numeri.length;i++) {
			somma+=numeri[i];
		}
		return somma;
	}
	
	public static int calcolaProdotto(int[] numeri) {//metodo che,una volta passati i numeri contenuti nel vettore,ne calcola il prodotto.
		int prodotto=1;
		for(int i=0;i<numeri.length;i++) {
			prodotto*=numeri[i];
		}
		return prodotto;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,flag=0;
		
		try {
			System.out.println("Quanti numeri desidera sommare e moltiplicare ?  ");
			n = sc.nextInt();
		
			while(n<=0){
				System.out.println("input non valido,reinserisci la dimensione :  ");
				n = sc.nextInt();
			}
		
			int[] vet1 = leggereNumeriDaInput(n,sc);
		
			int s = calcolaSomma(vet1);
			System.out.println("Somma di tutti i numeri dell'array : " + s);
		
			int p = calcolaProdotto(vet1);
			System.out.println("Prodotto di tutti i numeri dell'array : " + p);
		}catch(Exception e) {
			System.out.println("Errore:inserisci un valore intero.");
		}finally {
			sc.close();
		}
		
	}

}
