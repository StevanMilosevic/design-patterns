package mvc;

/* Klasa Controller je zaduzena za interakciju sa Model i View klasama. 
 * Ona služi kao posrednik između njih.  */

public class KnjigaController {
	private KnjigaModel knjiga;
	private KnjigaView view;
	
	
	KnjigaController(KnjigaModel knjiga, KnjigaView view){
		this.knjiga = knjiga;
		this.view = view;
	}


	public void setAutor(String autor) {
		knjiga.setAutor(autor);
	}
	
	public void setNaziv(String naziv) {
		knjiga.setNaziv(naziv);
	}
	
	public void setIsbn(String isbn) {
		knjiga.setIsbn(isbn);
	}
	public void setCena(double cena) {
		knjiga.setCena(cena);
	}
	
	public String getAutor() {
		return knjiga.getAutor();
	}
	public String getNaziv() {
		return knjiga.getNaziv();
	}
	public String getIsbn() {
		return knjiga.getIsbn();
	}
	public double getCena() {
		return knjiga.getCena();
	}
	public void updateView(){
		view.prikaziKnjigu(knjiga.getAutor(), knjiga.getNaziv(), knjiga.getIsbn(), knjiga.getCena());
	}
	
	
}
