package mvc;

/* Model je klasa koja sadrži podatke koji se mogu ucitati iz baze podataka, direktno iz programu 
 * kroz određenu metodu ili kroz unos korisnika.  */

public class KnjigaModel {
	private String autor;
	private String naziv;
	private String isbn;
	private double cena;
	
	KnjigaModel(String autor, String naziv, String isbn, double cena){
		this.autor = autor;
		this.naziv = naziv;
		this.isbn = isbn;
		this.cena = cena;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}
}
