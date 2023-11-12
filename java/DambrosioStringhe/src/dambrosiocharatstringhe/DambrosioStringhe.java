package dambrosiocharatstringhe;

import java.util.Scanner;

public class DambrosioStringhe {

    static String NuovaStringa(String stringa, boolean b) {
        String stringaPosPari = "";
        String stringaPosDispari = "";

        if (b) {
            for (int i = 0; i < stringa.length(); i += 2) {
                stringaPosPari += stringa.charAt(i);
            }
            return stringaPosPari;
        } else {
            for (int i = 1; i < stringa.length(); i += 2) {
                stringaPosDispari += stringa.charAt(i);
            }
            return stringaPosDispari;
        }
    }

    public static void main(String[] args) {
        Scanner scannerBoolean = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        try {
            System.out.println("Inserisci un valore booleano (true/false): ");
            Boolean b = scannerBoolean.nextBoolean();

            System.out.println("Inserisci una stringa: ");
            String stringa = scannerString.nextLine();

            if (stringa.isEmpty()) {
                System.out.println("La stringa inserita e' vuota.");
            } else {
                if (b) {
                    System.out.println("Nuova stringa creata con caratteri in posizione pari della stringa  " + stringa + " : " + NuovaStringa(stringa, b));
                } else {
                    System.out.println("Nuova stringa creata con caratteri in posizione dispari della stringa  " + stringa + " : " + NuovaStringa(stringa, b));
                }
            }
        } catch (Exception e) {
            System.out.println("Errore: Inserisci un valore booleano valido (true/false).");
        } finally {
            scannerBoolean.close();
            scannerString.close();
        }
    }
}



