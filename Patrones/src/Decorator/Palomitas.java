package Decorator;

public class Palomitas extends Extras {
	
	private Cine cine;
	
	public Palomitas(Cine cine) {
		// TODO Auto-generated constructor stub
		this.cine  = cine;
	}
	
	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return this.cine.getDescripcion() + ", Palomitas";
		
	}

	@Override
	public double precio() {
		// TODO Auto-generated method stub
		return cine.precio() + 3;
	}

}
