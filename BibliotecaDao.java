package opendata;

import java.io.IOException;
import java.net.URL;
//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.net.URL;
import java.net.URLConnection;


public class BibliotecaDao {

    public static Biblioteca[] prelevaOpenData() {
        Biblioteca[] biblioteche = null;

        try {
            /*URL bibliotecaCsv = new URL(
                    "https://opendata.cittametropolitanaroma.it/sites/default/files/Biblioteche.csv");
            Scanner scanner = new Scanner(bibliotecaCsv.openStream());

            // Conta il numero totale di biblioteche nel file CSV
            int count = 0;
            while (scanner.hasNextLine()) {
                count++;
                scanner.nextLine();
            }

            // Inizializza l'array
            biblioteche = new Biblioteca[count];
            scanner.close();

            // Leggi i dati e popola l'array
            scanner = new Scanner(bibliotecaCsv.openStream());
            scanner.nextLine(); // Ignora l'intestazione
            int index = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

                String comune = parts[0];
                String denominazioni = parts[1];
                String indirizzo = parts[2];
                String numeroTelefono = parts[3];
                String fax = parts[4];
                String sitoWeb = parts[5];
                String email = parts[6];
                String ulterioriInformazioni = parts[7];

                Biblioteca biblioteca = new Biblioteca(comune, denominazioni, indirizzo, numeroTelefono, fax,
                        sitoWeb, email, ulterioriInformazioni);
                biblioteche[index++] = biblioteca;
            }

            scanner.close();
            */
        	
        	URL bibliotecaCsv = new URL(
                    "https://opendata.cittametropolitanaroma.it/sites/default/files/Biblioteche.csv");
            URLConnection connection = bibliotecaCsv.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            // Conta il numero totale di biblioteche nel file CSV
            int count = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                count++;
            }
            reader.close();

            // Inizializza l'array
            biblioteche = new Biblioteca[count];

            // Leggi i dati e popola l'array
            connection = bibliotecaCsv.openConnection();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            reader.readLine(); // Ignora l'intestazione
            int index = 0;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

                String comune = parts[0];
                String denominazioni = parts[1];
                String indirizzo = parts[2];
                String numeroTelefono = parts[3];
                String fax = parts[4];
                String sitoWeb = parts[5];
                String email = parts[6];
                String ulterioriInformazioni = parts[7];

                Biblioteca biblioteca = new Biblioteca(comune, denominazioni, indirizzo, numeroTelefono, fax,
                        sitoWeb, email, ulterioriInformazioni);
                biblioteche[index++] = biblioteca;
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return biblioteche;
    }
}

