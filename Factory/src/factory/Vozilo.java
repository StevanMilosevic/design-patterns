package factory;

public abstract class Vozilo {
	public abstract int getKS();
	public abstract int getBrTockova();
	public abstract String getNaziv();
	
	@Override
	public String toString() {
		return "Naziv: " + this.getNaziv() + "\nKonjskih snaga: " + this.getKS() + "\nBroj tockova: " + this.getBrTockova();
	}
}
