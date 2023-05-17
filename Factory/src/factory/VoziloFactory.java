package factory;

// ovde se sve desava...ispitujemo na osnovu ulaznih podataka koja dete-klasa ce instancirati objekat

public class VoziloFactory {
	
	public static Vozilo getVozilo(String type, int ks, int brTockova, String naziv) {
		if("Auto".equalsIgnoreCase(type))
			return new Auto(ks, brTockova, naziv);
		else if("Motor".equalsIgnoreCase(type))
			return new Motor(ks, brTockova, naziv);
		else if("Kamion".equalsIgnoreCase(type))
			return new Kamion(ks, brTockova, naziv);
		
		return null;
	}
}
