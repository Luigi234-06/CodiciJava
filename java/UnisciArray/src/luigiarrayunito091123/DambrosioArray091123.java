/*Obiettivo: Scrivere un programma Java che consenta all'utente di inserire due array di numeri, quindi unisca gli array e visualizzi l'array risultante senza ordinarlo, utilizzando metodi.
Istruzioni:Crea un programma Java chiamato "UnisciArray" che includa un metodo main.
Nel metodo main, inizia con un messaggio di benvenuto e chiedi all'utente di inserire la lunghezza di due array di numeri. Leggi queste lunghezze da input e memorizzale in due variabili.
Crea un metodo chiamato leggiArrayDaInput(int lunghezza) che prenda un intero lunghezza come argomento e restituisca un array di numeri letti dall'utente.
Crea un metodo chiamato unisciArray(int[] array1, int[] arra2) che prenda due array di numeri come argomenti, li unisca in un unico array e restituisca l'array risultante.	
Nel metodo main, chiama il metodo leggiArrayDaInput due volte per ottenere due array di numeri dall'utente.	
Chiama il metodo unisciArray passando i due array ottenuti dall'utente.	
Visualizza l'array risultante dopo l'unione	
Gestisci eventuali errori o input non valido in modo appropriato.
*/

package luigiarrayunito091123;

import java.util.Scanner;

public class DambrosioArray091123 {
	
	public static int[] LeggiNumeriDaInput(Scanner sc,int lunghezza ) {
		int[] v = new int[lunghezza];
		for(int i=0;i<lunghezza;i++) {
			v[i] = sc.nextInt();
		}
		System.out.println("---------");
		return v;
	}
	
	public static int[] unisciArray(int[] v1,int[] v2) {
		int dimArray1=v1.length;
		int dimArray2=v2.length;
		int dimensioneArrayUnito=dimArray1+dimArray2;
		int [] arrayUnito = new int[dimensioneArrayUnito];
		for(int i=0;i<dimArray1;i++) {
			arrayUnito[i] = v1[i];
		}
		int i = dimArray1,y=0;
		while(i<dimensioneArrayUnito && y<dimArray2) {
			arrayUnito[i] = v2[y];
			i++;
			y++;
		}
		return arrayUnito;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
			int dim1,dim2;
			System.out.println("Inserisci le lunghezze di due array : ");
			dim1 = sc.nextInt();
			dim2 = sc.nextInt();
			System.out.println("--------");
		
			while(dim1<=0 || dim2<=0) {
				System.out.println("Input non valido,inserisci nuovamente i dati : ");
				if(dim1<=0) {
					dim1=sc.nextInt();
				}
				else dim2=sc.nextInt();
			}
			
			int[] v1 = LeggiNumeriDaInput(sc,dim1);
			int[] v2 = LeggiNumeriDaInput(sc,dim2);
			
			int dimTotale = v1.length + v2.length;
			
			int[] arrayUnito = unisciArray(v1,v2);
			System.out.println("Array unito : ");
			for(int i=0;i<dimTotale;i++) {
				System.out.print(arrayUnito[i] + ";");
			}
			
		}catch(Exception e) {
			System.out.println("Input non valido.");
		}finally {
			sc.close();
		}
		
	}

}
