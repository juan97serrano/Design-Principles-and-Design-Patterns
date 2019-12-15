package Decorator;

public abstract class Cine {

	protected String descripcion = "Cine";
	
	public Cine() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getDescripcion() {
		
		return descripcion;
		
	}
	
	public abstract double precio();

}

