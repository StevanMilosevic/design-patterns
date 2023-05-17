package factory;

/* Factory pattern spada u creational, posto se bavi problemom kreiranja objekata. 
 * 
 * U Factory patern-u se ostavlja podklasama da "odluce" koji objekat koje klase ce da se instancira, iznad
 * njih se nalazi obicno apstraktna klasa ili interfejs.  */

public class Main {

	public static void main(String[] args) {
		Vozilo vozilo1 = VoziloFactory.getVozilo("auto", 160, 4, "Ford");
		Vozilo vozilo2 = VoziloFactory.getVozilo("Kamion", 560, 6, "MAN");
		Vozilo vozilo3 = VoziloFactory.getVozilo("Motor", 125, 2, "Jamaha");
		
		System.out.println(vozilo1 + "\n");
		System.out.println(vozilo2 + "\n");
		System.out.println(vozilo3);

	}
}