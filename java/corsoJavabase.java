/*input e output con java
*per l'input bisogna importare la libreria e posizionare il cursore
mentre l'output è molto più semplice,come in c++ basta digitare solo una funzione già impostata.*/

import java.util.Scanner;
import java.util.ArrayList;

public class corsoJavabase {

	public static void main(String[] args) {
		
		System.out.print("Benvenuti ");//istruzione di output,equivale al "cout" in c++.
		System.out.println("a tutti!");// "ln" oppure "/n" creano una nuova riga andando a capo.

		Scanner scanner = new Scanner(System.in);//creazione oggetto "scanner".
		//istruzioni di input.
		System.out.println("Quale è il tuo nome ?");
		String nome = scanner.nextLine();//con questa funzione si crea una prossima riga e va messa direttamente solo se cìè una stringa,rappresenta il dato scritto dall'utente.

		System.out.println("Quale è il tuo cognome ?");
		String cognome = scanner.nextLine();

		System.out.println("Quale è la tua età ?");
		int eta = scanner.nextInt();//dipende dal tipo di dato,ma poi bisogna comunque scrivere la funzione che crea la prossima riga.
		scanner.nextLine();

		System.out.println("In che città vivi ?");
		String citta = scanner.nextLine();

		System.out.println("Ciao "+ nome + " "+ cognome);
		System.out.println("Hai "+ eta + " anni");
		System.out.println("Vivi a "+ citta);

		//classe Math per operazioni più complesse :
		System.out.println(Math.PI);
		System.out.println(Math.abs(-9));
		System.out.println(Math.min(2,7));//tra due numeri
		System.out.println(Math.max(2,7));//tra due numeri
		System.out.println(Math.sqrt(64));
		System.out.println(Math.pow(2,3));

		System.out.println(11==10);//comparazione:da come risposta un risultato booleano(true/false).

		//selezione,condizioni con IF
		//IF
		boolean online=true;
		if(online){//true
			System.out.println("è online");
		}
		//oppure false,con il costrutto "else"(non ci va nessuna condizione).
		else{
			System.out.println("non è online");
		}
		//quando la stessa condizione va verificata più volte si usa il costrutto "else if"(ci possiamo rimettere le condizioni).
		String n = "marco";

		if(n == "marco"){
			System.out.println("è marco");
		}
		else if(n == "luca"){
			System.out.println("è luca");
		}
		else{
			System.out.println(" è qualcun altro");
		}
		/*IF annidati(if dentro altri if),li usiamo se abbiamo più condizioni legate una con l'altra e abbiamo bisogno di step separati,
		*altrimenti possiamo usare i connettivi logici se non abbiamo bisogno di step separati.*/
		int num = 4;
		if(num<10){
			System.out.println("è minore di 10");
			if(num % 2 == 0){
				System.out.println("è pari");
			}else{
				System.out.println("è dispari");
			}
		}else{
			System.out.println("è maggiore di 10");
		}
		//oppure usiamo i connettivi logici
		if(num < 10 && num % 2 == 0){
			System.out.println("il numero è minore di 10 ed è pari");
		}
		//ternary operator,è un modo abbreviato di scrivere una IF 
		String x =  3 > 10 ? "ciao" : "buongiorno";
		System.out.println(x);

		//costrutto switch,al posto di usare tante IF innescate una con l'altra
		String nome2 = "luca";
		switch(nome2){
			case "luca":
				System.out.println("ciao luca ");
				break;
			case "marco":
				System.out.println("ciao marco ");
				break;
			case "edoardo":
				System.out.println("ciao edoardo ");
				break;
			default://se non è nessuna delle casistiche appena elencate 
				System.out.println("ciao chiunque tu sia");
		}
		
		//CICLI ITERATIVI(while,do-while e for):servono per ripetere,finchè la condizione è verificata,determinate righe di codice.
		//WHILE
		int i=0;
		while(i<5){
			System.out.println(i);
			i++;
		}
	//DO-WHILE:il codice viene eseguito almeno una volta
		do{
			System.out.println(i);
			i++;
		}while(i<5);
	//FOR:ciclo di iterazione enumerativa,si usa quando sappiamo quanti sono i cicli massimi da fare
		for(i=0;i<5;i++){
			System.out.println(i);
		}
		//versione differente della FOR:foreach,si usa con gli array
		int [] numeri = {10,20,30,40,50};
		for(int numero : numeri){
			System.out.println(numero);
		}

		//break:stoppa il codice,lo rompe.
		//continue:stoppa il codice solo dove lo vogliamo noi,e sicuramente sarà la condizione per cui si è verificato.

		//GLI ARRAY MONODIMENSIONALI "vettori"
		int array[];  //dichiarare array
		int[] array1; //dichiarare array
		int[] numbers = new int[3];//inizializzare un array
		int[] number = {1,2,3,4};//inizializzazione e assegnazione valori
		//usando la funzione lenght(numeri.lenght) recupero la lunghezza del mio array 

		//GLI ARRAY MULTIDIMENSIONALI 2D "matrici"
		String [][] classi = new String[3][3];//dichiarazione e inizializzazione
		//oppure:
		String[][] classis = {
							{"Luca","Giovanni","Marco"},
							{"Anna","Pasquale","Luigi"},
							{"ludo","enzo","enza"}
						  };
		//visualizzazione con il "for" normale
		for(int classe=0;classe < 3;classe++){
			System.out.println();
			for(int studente=0;studente < 3;studente++){
				System.out.println(classis[classe][studente] + " ");
			}
		}
		//con il foreach:
		
		for(String classe : classi){    //ERRORE RIGUARDARE
			System.out.println();
			for(String studente : classe){
				System.out.print(studente + " ");
			}
		}

		/*METODI(funzioni) DELLE STRINGHE 
		*String nome = "Leonardo";

		*1.equals():da come risultato un booleano,ci dice se una stringa è uguale oppure no ad un'altra.
		*boolean risultato = nome.equals("Leonardo");->da come risultato true(Leonardo!=leonardo:case sensitive);

		*2.equalsIgnoreCase():uguale alla prima ma non si basa sulla tipologia case sensitive(Leonardo=leonardo);

		*3.lenght():mostra la lunghezza di una stringa("Leonardo"->8);
		*int risultato=nome.lenght();->da come risultato 8;

		*4.charAt():ci ritorna il carattere in una specifica posizione dell'array di stringhe.
		*char risultato=nome.charAt(7);da come risultato 'o';
 
		*5.indexOf():è l'esatto contrario,ci dice un carattere in che posizione si trova.
		*int risultato=nome.indexOf("a");->da come risultato 4.

		*6.isEmpty():ci dice se la stringa che abbiamo è vuota oppure no.
		*boolean risultato=nome.isEmpty();-> da come risultato "false".

		*7.toUpperCase():da come risultato la stringa di partenza con un diverso case(tutto maiuscolo).
		*String risultato=nome.toUpperCase();->=LEONARDO.

		*8.toLowerCase():uguale al precedente,ma il case è invertito(tutto minuscolo).
		*String risultato=nome.toLowerCase();->=leonardo.

		*9.trim():ci permette di togliere gli spazi avanti e indietro ad una stringa e ritorna sempre una stringa.
		*String nome="       Leonardo        ";
		*String risultato=nome.trim;->"Leonardo";

		*10.replace():torna una stringa,sostituisce un carattere della stringa con uno nuovo.
		*String risultato=nome.replace('o','w');->ho sostituito la 'o' con la 'w'->="Lewnardw";*/

	//Wrapper Class:ci permettono di trasformare i tipi di dato primitivi in reference(sono più lenti ma vengono associate a dei metodi),
	//anche se il s.o,grazie ad alcune proprietà di java,alla fine li intende in modo uguale.Non sono nient'altro che primitive che vengono
	//impacchettate come reference(per subire dei vantaggi),ma poi alla fine vengono spacchettate di nuovo come primitive.
	//boolean->Boolean:sono gli stessi valori gestiti da due tipi di dato diversi
	//int->Integer
	//char->Character
	//double->Double

	//ARRAY LIST:sono degli array ridimensionabili,a cui possiamo sia aggiungere che togliere celle,ma accettano solo reference.
	//aggiungere elementi:add();
	//mandare a schermo elementi:get();
	//modificare elementi:set();
	//rimuovere elementi:remove();
	//eliminare tutti gli elementi:clear();
	
	//Vettori:
	ArrayList<String> persone = new ArrayList<String>();//creare la lista
	persone.add("Luca");
	persone.add("Marco");
	persone.add("Anna");
	persone.set(2,"Paola");
	persone.remove(0);
	persone.clear();
	for(int a=0;a<persone.size();a++){//size():becca la dimensione dell'arraylist
		System.out.println(persone.get(a));
	}

	//Matrici(arrayList di arrayList):
	ArrayList<ArrayList<String>> classiss = new ArrayList<String>(); //ERRORE RIGUARDARE
	
	ArrayList<String> classe1 = new ArrayList<String>();
	classe1.add("Luca");
	classe1.add("Marco");
	
	ArrayList<String> classe2 = new ArrayList<String>();
	classe2.add("anna");
	classe2.add("orazio");//creazione di 2 arrayList monodimensionali
	
	classiss.add(classe1);
	classiss.add(classe2);

	for(i=0;i<classiss.size();i++){
		System.out.println();
		for(int j=0;j<classiss.get(i).size();j++){
			System.out.print(classiss.get(i).get(j) + " ");
		}
	}

	//METODI=FUNZIONI scritte nelle classi(dato che java è un linguaggio orientato agli oggetti)
	//Blocchi di codice che possiamo richiamare(nel main) quando ci servono che svolgono un determinato compito
	//se la funzione è nel main : 
	//static void rrrrrr(){};lo static riprende il main(static void main());
	//richiami delle funzioni overloaded :
	int doppionInt = addizione(2,3);
	int triploInt = addizione(3,2,1);
	double doppioDouble = addizione(3.2,7.3);
	System.out.print(doppioInt);
	}
	//OVERLOADED METHODS:metodi con lo stesso nome ma usati in modo diverso,cioè:stesso nome ma con parametri diversi,sono tipo le wrapper classes
	static int addizione (int a,int b){
		int risultato=a+b;
		return risultato;
	}
	static int addizione (int a,int b,int c){//overloaded(int c)
		int risultato=a+b+c;
		return risultato;
	}
	static double addizione (double a,double b){
		int risultato=a+b;
		return risultato;
	}	

}