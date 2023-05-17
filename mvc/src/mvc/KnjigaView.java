package mvc;

// ova klasa prikazuje podatke korisniku, njene metode ce da obradjuje i poziva klasa Controller

public class KnjigaView {
	
	public void prikaziKnjigu(String autor, String naziv, String isbn, double cena) {
		System.out.println("Autor: " + autor);
		System.out.println("Naziv: " + naziv);
		System.out.println("ISBN: " + isbn);
		System.out.println("Cena: " + cena);
	}
}
