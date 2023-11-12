//per un buon riuso delle classi(obiettivo OOP),gestire eventuali errori nelle classi e non all'interno del main.
package dambrosioesercizio0711234;

class TriangoloRettangolo {
	private double cateto1;
	private double cateto2;
	private double ipotenusa;
	
	//esercizio aggiuntivo: 
	public void setCateto1 (double c1) throws Exception {
	
		if (c1<0) {
			throw new Exception("Il cateto 1 non puo' essere minore di 0.");
		}
		cateto1=c1;	
		
	}
	
	public void setCateto2(double c2) throws Exception {
		if (c2<0) {
			throw new Exception("Il cateto 2 non puo' essere minore di 0.");
		}
		cateto2=c2;
	}
	
	public void setIpotenusa(double i) throws Exception {
		if (i<0) {
			throw new Exception("L'ipotenusa non puo' essere minore di 0.");
		}
		ipotenusa=i;
	}
	
	    public void calcola() {
	        try {
	            if (cateto1 != 0 && cateto2 != 0 && ipotenusa == 0) {
	                setIpotenusa(Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2));
	            } else if (cateto1 != 0 && ipotenusa != 0 && cateto2 == 0) {
	                setCateto2(Math.sqrt(ipotenusa * ipotenusa - cateto1 * cateto1));
	            } else if (cateto2 != 0 && ipotenusa != 0 && cateto1 == 0) {
	                setCateto1(Math.sqrt(ipotenusa * ipotenusa - cateto2 * cateto2));
	            } else if (cateto1 == 0 && cateto2 == 0 && ipotenusa == 0) {
	                System.out.println("Dati insufficienti per il calcolo");
	            }

	        } catch (Exception e) {
	            System.out.println("Non posso effettuare il calcolo.");
	        }
	    }

	    public double calcolaArea() {
	    	double areaPerimetro;
	    	areaPerimetro = (cateto1*cateto2)/2;
	        return areaPerimetro;
	    }

	    public double calcolaPerimetro() {
	    	double calcolaPerimetro;
	    	calcolaPerimetro = cateto1+cateto2+ipotenusa;
	        return calcolaPerimetro;
	    }
}
	