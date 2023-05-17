package mvc;

/* Ideja MVC dizajna je da odvoji logiku aplikacije od interfejsa koji se obraca korisniku, kao sto
 * mu ime kaze, ovaj dizajn patern ima tri dela:
 * 
 * MODEL - predstavlja biznis deo aplikacije, ovde idu podaci kojima se manipulise
 * VIEW - prezentacija
 * CONTROLLER - logika programa 
 * 
 * Ono kako MVC arhitektura radi na webu recimo je da ce korisnikov browser da posalje zahtev 
 * CONTROLLER-u koji zatim poziva MODEL	i pribavlja podatke koji su mu potrebni. U sledecem koraku
 * se ti podaci salju VIEW delu aplikacije, odakle se salje korisniku nazad. 
 * 
 * Deljenje aplikacije na tri zasebna dela ima svojih prednosti:
 * 	- vise developera moze paralelno da radi na razvoju aplikacije
 *	- skalabilnost aplikacije
 *	- delovi aplikacije manje zavise jedan od drugog, laksi su za odrzavanje
 *	- testiranje aplikacije je lakse, kao i njeno prosirenje 
 **/ 

public class Main {
	public static void main(String[] args) {
		// u modelu se nalaze podaci
		KnjigaModel knjiga = new KnjigaModel("Matterhorn", "Karl Marlantes", "120654811-00", 1200.0);
		
		KnjigaView view = new KnjigaView();
		
		// kontroler je zaduzen za manipulaciju podacima i njihovo prikazivanje
		KnjigaController controller = new KnjigaController(knjiga, view);
		
		controller.updateView();
		
		// radimo update jednog podatka (menjamo cenu knjizi), metoda je iz klase Kontroler
		controller.setCena(1000.0);
		
		controller.updateView();
	}
}
