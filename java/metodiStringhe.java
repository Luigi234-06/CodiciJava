package stringhemetodiprove;

public class metodiStringhe {

	public static void main(String[] args) {
		String str = new String ("  Pollo");//qui uso il costruttore,un metodo che mi permette di 
		//creare l'oggetto della classe String.
		String newStr = new String ("");//stringa vuota
		
		for(int i=str.length()-1;i>=0;i--) {
			newStr+=str.charAt(i);//metodo che estrae il carattere in posizione i-esima del vettore di char.
		}
		System.out.println("Reverse String : " + newStr);
		
		System.out.println(str.equals("casa"));//metodo che confronta due stringhe se sono uguali,dando un risultato 
		//booleano(true=uguale,false=diverso).
		//casa è diverso da pollo quindi darà false,è case sensitive pollo != Pollo
		
		System.out.println(str.equalsIgnoreCase("Pollo"));//uguale al precedente solo che non è case sentive Pollo=pollo
		
		System.out.println(str.length());//lunghezza della stringa.
		
		System.out.println(str.indexOf("l"));//dice il carattere in che posizione dell'array si trova
		
		System.out.println(str.isEmpty());//dice se la stringa è vuota oppure no con risultato 
		//booleano(true=vuota,false=piena)
		
		System.out.println(str.toUpperCase());//stringa tutto in maiuscolo
		
		System.out.println(str.toLowerCase());//uguale al precedente solo che tutti i caratteri in minuscolo
		
		System.out.println(str.trim());//toglie gli spazi avanti e indietro ad una stringa(uno spazio vale come un carattere)
		
		System.out.println(str.replace('P', 'o'));//torna una stringa e sostituisce il carattere della stringa con 
		//uno nuovo(sostituisce la 'p' con la 'o')
		
	}
	/*	OUTPUT:
	 * Reverse String : olloP  
	 * false
	 * false
	 * 7
	 * 4
	 * false
  	 *   POLLO
  	 *   pollo
  	 * Pollo
  	 *   oollo
	 */
	

}
