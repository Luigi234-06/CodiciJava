/*Creare una classe Portamonete in cui memorizzare quante monete da 50 cent 1 euro o 2 euro si
hanno. creare il metodo inserisci(double valore) che riceve il valore di una moneta e se è un valore
ammissibile aumenta il numero di monete di quel tipo, creare un altro metodo inserisci(double
valore,int n) che permette di inserire più monete di uno stesso tipo (n) in una volta sola. creare un
metoto denaro() che restituisce quanto denaro in totale si ha nel portamonete creare un metodo
denaropertipo() che scrive per a schermo quante monete di ogni taglio sono presenti. creare un
costruttore standard che porta tutte le monete a zero, creare un altro costruttore che riceve il
numero i monete da 50 cent 1 euro o 2 euro.*/

package es1adoggetti;

import java.util.Scanner;

public class Portamonete {
    int moneteDa50Cent=0;
    int moneteDa1Euro=0;
    int moneteDa2Euro=0;

    // Costruttore standard
   // public Portamonete() {
    //    moneteDa50Cent = 0;
    //    moneteDa1Euro = 0;
    //    moneteDa2Euro = 0;
   // }

    /* Costruttore che riceve il numero di monete da 50 cent, 1 euro e 2 euro
    public Portamonete(int num50Cent, int num1Euro, int num2Euro) {
        moneteDa50Cent = num50Cent;
        moneteDa1Euro = num1Euro;
        moneteDa2Euro = num2Euro;
    }*/

    // Metodo per inserire una moneta di valore specifico
    public void inserisci(double valore) {
        if (valore == 0.5) {
            moneteDa50Cent++;
        } else if (valore == 1) {
            moneteDa1Euro++;
        } else if (valore == 2) {
            moneteDa2Euro++;
        }
        else {
        	System.out.println("La moneta inserita non è ammissibile.");
        }
    }

    // Metodo per inserire più monete dello stesso tipo (n monete)
    public void inserisci(double valore, int n) {
        if (valore == 0.5) {
            moneteDa50Cent += n;
        } else if (valore == 1) {
            moneteDa1Euro += n;
        } else if (valore == 2) {
            moneteDa2Euro += n;
        }
        else {
        	System.out.println("La moneta inserita non è ammissibile.");
        }
    }

    // Metodo per calcolare il totale del denaro nel portamonete
    public double denaro() {
        return (moneteDa50Cent * 0.5) + (moneteDa1Euro * 1) + (moneteDa2Euro * 2);
    }

    // Metodo per visualizzare il numero di monete di ogni taglio
    public void denaroPerTipo() {
        System.out.println("Monete da 50 cent: " + moneteDa50Cent);
        System.out.println("Monete da 1 euro: " + moneteDa1Euro);
        System.out.println("Monete da 2 euro: " + moneteDa2Euro);
    }

    public static void main(String[] args) {
        // Esempio di utilizzo della classe Portamonete
    	Scanner sc = new Scanner(System.in);
    	
        Portamonete portamonete = new Portamonete();
        
        System.out.println("Inserisci il valore di una singola moneta : ");
        double moneta = sc.nextDouble();
        portamonete.inserisci(moneta); 
        
        System.out.println("Inserisci il valore di una singola moneta e quante volte lo vuoi inserire : ");
        double singolaMoneta=sc.nextDouble();
        int numeroMonete=sc.nextInt();
        portamonete.inserisci(singolaMoneta, numeroMonete); 
        
        portamonete.denaroPerTipo(); // Visualizza il numero di monete per tipo
        System.out.println("Denaro totale nel portamonete: " + portamonete.denaro() + " euro");
        
        sc.close();
    }
}

