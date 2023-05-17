package singleton;

/* Ovo je jedan od najjednostavnijih dizajn paterna, on spada u creational pattern-e.
 * 
 * Ono što ovaj dizajn patern resava je kako da iz klase instaciramo jedan objekat i da to bude 
 * jedini objekat koji je kreiran iz te klase. Tj kako resiti problem pojave dve razlicite instance
 *  jedne iste klase, tj kako da napravimo sistem u kome nikako nije moguce da se pojave dva 
 *  razlicita objekta jedne klase.
 * Dakle, hocemo da omogucimo da se napravi jedna instanca ali necemo da dozvolimo instanciranje 
 * drugog objekta. Zelimo da onemogucimo da se uradi ovo: 
 * 
 * Klasa objekat = new Klasa() -> ali posle toga da ne mozemo da instaciramo sledeci recimo objekat2
 * Klasa objekat2 = new Klasa();
 * 
 * Prvi korak ka tome je da odradimo preko konstruktora i to tako što cemo reci da više nije javan
 * nego privatan! Tako više nece biti moguce instancirati objekat
 * 
 * Drugi korak je da instanciranje objekta vrsi metoda, ali posto nam je konstruktor privatan, to
 * ogranicenje zaobilazimo metodom koja nam je staticka, a sve staticko u sistemu moze da bude samo jedno.
 * 
 * Prednost ovog paterna je u tome sto dovodi do veoma male upotrebe memorije, a njegova upotreba je 
 * u kontroli pristupa bazi podataka ili soketu. */

public class Singleton {

	private static Singleton instance = null;
	
	// pravimo konstruktor privatnim kako ne bi mogao da se poziva i da se prave novi objekti
	private Singleton() {}

	// metoda koja pribavlja jedini raspoloziv objekat iz ove klase
	public static Singleton getInstance() {
		if(instance == null)
			instance = new Singleton();
		return instance;
	}
}
