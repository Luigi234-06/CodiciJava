/*Creare una classe Contatto che contenga, sotto forma di attributi, i dati relativi ad un
generico contatto (prevedere almeno cognome, nome, indirizzo, città, telefono fisso e cellulare) e
che abbia i seguenti metodi:
 metodi di default;
 metodo leggiContatto(...)
 metodo stampa Contatto(...) */

package es1adoggetti;

import java.util.Scanner;

public class Contatto {//identità del dominio
	//attributi della classe
     String cognome="";
     String nome="";
     String indirizzo="";
     String citta="";
     String telefonoFisso="";
     String cellulare="";

   /* Costruttore di default
    public Contatto() {
        cognome = "";
        nome = "";
        indirizzo = "";
        citta = "";
        telefonoFisso = "";
        cellulare = "";
    }*/
    
    // Metodo per leggere i dati del contatto
    public void leggiContatto(int n) {
        Scanner scanner = new Scanner(System.in);
        
        int c=0;
        
        while(c<n) {
        	
        	System.out.print("Inserisci il cognome: ");
        	cognome = scanner.nextLine();

        	System.out.print("Inserisci il nome: ");
        	nome = scanner.nextLine();

        	System.out.print("Inserisci l'indirizzo: ");
        	indirizzo = scanner.nextLine();

        	System.out.print("Inserisci la citta': ");
        	citta = scanner.nextLine();

        	System.out.print("Inserisci il telefono fisso: ");
        	telefonoFisso = scanner.nextLine();

        	System.out.print("Inserisci il cellulare: ");
        	cellulare = scanner.nextLine();
        	
        	c++;
        	System.out.println("--------------");
        	
        }

        	
        	scanner.close();
        	
    }
  
    

    // Metodo per stampare i dati del contatto
    public void stampaContatto(int n) {
    	int c=0;
    	
    	while(c<n){    		
    		System.out.println("Cognome: " + cognome);
    		System.out.println("Nome: " + nome);
    		System.out.println("Indirizzo: " + indirizzo);
    		System.out.println("Citta': " + citta);
    		System.out.println("Telefono Fisso: " + telefonoFisso);
    		System.out.println("Cellulare: " + cellulare);
    		System.out.println("--------------");
    		c++;
            
    	}
    }

    public static void main(String[] args) {
        Contatto contatto1 = new Contatto();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanti contatti vuoi inserire ? ");
        int n = sc.nextInt();
        
        contatto1.leggiContatto(n);
        contatto1.stampaContatto(n);
        
        sc.close();
    }
}
/*In programmazione orientata agli oggetti, "this" è una parola chiave utilizzata per fare riferimento all'
 * oggetto corrente su cui un metodo è chiamato. 
  È un riferimento all'istanza dell'oggetto attualmente in esecuzione, e 
  viene spesso utilizzato per distinguere tra variabili di istanza dell'oggetto e
  variabili locali o parametri con lo stesso nome.

Ecco alcune situazioni comuni in cui "this" viene utilizzato:
1)
Distinguere tra variabili di istanza e variabili locali: Se un metodo ha una variabile locale 
con lo stesso nome di una variabile di istanza, puoi utilizzare "this" per fare riferimento alla variabile di istanza. 
Ad esempio:


public class Persona {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome; // "this.nome" fa riferimento alla variabile di istanza "nome"
    }
}

2)
Passare l'istanza corrente: In alcuni casi, è necessario passare l'istanza corrente 
dell'oggetto a un altro metodo o costruttore. Puoi farlo utilizzando "this". Ad esempio:


public class Esempio {
    private int valore;

    public Esempio(int valore) {
        this.valore = valore; // Utilizzo di "this" per riferirsi all'istanza corrente
    }
}
3)
Chiamare un altro costruttore della stessa classe: "this" può essere utilizzato per richiamare un altro 
costruttore della stessa classe all'interno del costruttore corrente. Questo è noto come "chiamata al costruttore". 
Ad esempio:

public class Persona {
    private String nome;
    private int età;

    public Persona(String nome) {
        this(nome, 0);*/ // Chiamata al costruttore

