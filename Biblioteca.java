package opendata;

public class Biblioteca {
    private String comune;
    private String denominazioni;
    private String indirizzo;
    private String numeroTelefono;
    private String fax;
    private String sitoWeb;
    private String email;
    private String ulterioriInformazioni;

    public Biblioteca(String comune, String denominazioni, String indirizzo, String numeroTelefono, String fax,
            String sitoWeb, String email, String ulterioriInformazioni) {
        this.comune = comune;
        this.denominazioni = denominazioni;
        this.indirizzo = indirizzo;
        this.numeroTelefono = numeroTelefono;
        this.fax = fax;
        this.sitoWeb = sitoWeb;
        this.email = email;
        this.ulterioriInformazioni = ulterioriInformazioni;
    }

    // Aggiungi metodi getter/setter se necessario
    @Override
    public String toString() {
        return "Biblioteca [comune= " + comune + ", denominazioni= " + denominazioni + ", indirizzo= " + indirizzo
                + ", numeroTelefono= " + numeroTelefono + ", fax= " + fax + ", sitoWeb= " + sitoWeb + ", email= s" + email
                + ", ulterioriInformazioni= " + ulterioriInformazioni + "]";
    }
}

