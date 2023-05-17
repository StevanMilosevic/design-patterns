package decorater;

public class ObojeniOblikDecorater extends OblikDecorater{

	public ObojeniOblikDecorater(Oblik oblik) {
		super(oblik);
	}
	
	@Override
	public void nacrtaj() {
		oblik.nacrtaj();
		setRedBorder(oblik);
	}
	
	private void setRedBorder(Oblik oblik) {
		System.out.println("Ivica je crvene boje!");
	}
}
