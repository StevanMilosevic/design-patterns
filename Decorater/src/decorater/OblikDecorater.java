package decorater;

public abstract class OblikDecorater implements Oblik {

	protected Oblik oblik;
	
	public OblikDecorater(Oblik oblik) {
		this.oblik = oblik;
	}
	
	public void nacrtaj() {
		oblik.nacrtaj();
	}
}
