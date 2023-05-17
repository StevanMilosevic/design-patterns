package factory;

public class Auto extends Vozilo {
	
	private int ks;
	private int brTockova;
	private String naziv;
	
	public Auto(int ks, int brTockova, String naziv) {
		this.ks = ks;
		this.brTockova = brTockova;
		this.naziv = naziv;
	}
	@Override
	public int getKS() {
		return this.ks;
	}
	@Override
	public int getBrTockova() {
		return this.brTockova;
	}
	
	@Override
	public String getNaziv() {
		return this.naziv;
	}
}
