package Decorator;

public class Chuches extends Extras {
	
	private Cine cine;
	
	public Chuches(Cine cine) {
		// TODO Auto-generated constructor stub
		this.cine  = cine;
	}
	
	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return this.cine.getDescripcion() + ", Chuches";
		
	}

	@Override
	public double precio() {
		// TODO Auto-generated method stub
		return cine.precio() + 2;
	}

}
