package singleton;

public class Main {

	public static void main(String[] args) {
		// Ovo nece moci da se izvrsi
		//Singleton object = new Singleton();	//The constructor Singleton() is not visible

		// Ovako pribavljamo jedini raspolozivi objekat iz klase
		Singleton object = Singleton.getInstance();

		// ali kako da znamo da je u pitanju uvek isti objekat koji se instancira iz date klase?
		// ako je u pitanju isti objekat, onda ce uvek da se upucuje na isto mesto u heap memoriji
		
		// pravimo tri Singleton objekta
		Singleton object1 = Singleton.getInstance();
		Singleton object2 = Singleton.getInstance();
		Singleton object3 = Singleton.getInstance();
		
		System.out.println("Hash kod Singleton objekta 1 je: " + object1.hashCode());
		System.out.println("Hash kod Singleton objekta 2 je: " + object2.hashCode());
		System.out.println("Hash kod Singleton objekta 3 je: " + object3.hashCode());
		
		// tri obicna objekta
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		
		System.out.println("Hash kod obj1 je: " + obj1.hashCode());
		System.out.println("Hash kod obj2 je: " + obj2.hashCode());
		System.out.println("Hash kod obj3 je: " + obj3.hashCode());
		
		if(object1 == object2 && object2 == object3) {
			System.out.println("Sva tri Singleton objekta zauzimaju istu memorijsku adresu!");
		}else {
			System.out.println("Ova tri objekta ne upucuju na istu memorijsku adresu");
		
		}
	}
}