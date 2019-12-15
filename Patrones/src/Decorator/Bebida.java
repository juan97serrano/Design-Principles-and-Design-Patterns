package Decorator;

public class Bebida extends Extras {
	
	private Cine cine;
	
	public Bebida(Cine cine) {
		// TODO Auto-generated constructor stub
		this.cine  = cine;
	}
	
	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return this.cine.getDescripcion() + ", Bebida";
		
	}
	
	@Override
	public double precio() {
		// TODO Auto-generated method stub
		return cine.precio() + 2;
	}

}
