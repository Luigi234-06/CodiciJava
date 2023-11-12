import java.util.Scanner;
 
 class luigi {

    static void caricavet(double v[], int n,Scanner sc){

            for(int i = 0 ; i < n ; i++){
                 v[i] = sc.nextDouble(); 
            }
    }

    static void stampavet(double v[], int n){
            for(int i = 0 ; i < n ; i++){
                System.out.print(v[i] + " "); 
            }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quanti numeri vuoi inserire ? ");
        int n = sc.nextInt();
        double vet[] = new double[n];
        
        caricavet(vet,n,sc);

        boolean ordinato = true;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                
                if (vet[i] <= vet[i + 1]) {
                    ordinato = false;
                    
                }
            } else {
                
                if (i < n - 1 && vet[i] >= vet[i + 1]) {
                    ordinato = false;
                    
                }
            }
        }

        if (ordinato == true) {
            System.out.println("Il vettore e' ordinato secondo il criterio specificato.");
        } else {
            System.out.println("Il vettore non e' ordinato secondo il criterio specificato.");

             for (int i = 0; i < n - 1; i++) {
                if ((i % 2 == 0 && vet[i] < vet[i + 1]) || (i % 2 != 0 && vet[i] > vet[i + 1])) {
                    
                    double temp = vet[i];
                    vet[i] = vet[i + 1];
                    vet[i + 1] = temp;
                
                }
            }
            System.out.println("Vettore ordinato : ");
            stampavet(vet,n);
        }

   
    }
}
