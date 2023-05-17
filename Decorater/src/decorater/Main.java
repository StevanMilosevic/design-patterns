package decorater;

/* Decorater patern nam omogucava da dinamicki dodajemo funkcionalnosti i ponasanje objektu bez uticaja
 *  na ostale objekte iz iste klase. 
 *  
 *  Ovaj dizajn patern spada u structural pattern, posto obezbedjuje wrapper (omotac) za postojecu klasu. 
 *  Uz pomoc decorater klase, koja omotava originalnu klasu i obezbedjuje dodatnu funkcionalnost, cuvamo metode
 *  od te iste klase netaknutim, tako da nema potrebe za menjanjem klase i njenih metoda.  
 *  
 *  Decorater pattern klase se dosta koriste u Java IO paketu, u klasama kao sto su FileReader, BufferedReader itd 
 *  
 *  Sama procedura pravljenja i implementacije ovog paterna iygleda otprilike ovako:
 *  	- kreiramo interfejs
 *  	- kreiramo konkretnu klasu koja implementira dati interfejs
 *  	- kreiramo apstraktnu dekorater klasu koji implementira isti interfejs
 *  	- kreiramo konkretnu dekorater klasu koja nasledjuje apstraktnu 
 *  	- zatim se ova konkretna dekorater klasa koristi za potrebne izmene nad objektima  */

public class Main {

	public static void main(String[] args) {
		
		Oblik krug = new Krug();
		Oblik trougao = new Trougao();
		
		Oblik crveniKrug = new ObojeniOblikDecorater(new Krug());
		Oblik crveniTrougao = new ObojeniOblikDecorater(new Trougao());
		
		// poruke iz kruga i trougla
		krug.nacrtaj();
		trougao.nacrtaj();
		System.out.println("========");
		crveniKrug.nacrtaj();
		System.out.println("========");
		crveniTrougao.nacrtaj();
		
		
	}

}
