package opendata;

public class TestOpenData {

	public static void main(String[] args) {
		  Biblioteca[] biblioteche = BibliotecaDao.prelevaOpenData();

	        if (biblioteche != null) {
	            for (Biblioteca biblioteca : biblioteche) {
	                System.out.println(biblioteca);
	            }
	        }

	}

}
