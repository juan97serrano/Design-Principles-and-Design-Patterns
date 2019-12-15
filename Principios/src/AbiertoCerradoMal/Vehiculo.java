package AbiertoCerradoMal;

public class Vehiculo {

	String vehiculo;
	public Vehiculo(String vehiculo) {
		
		// TODO Auto-generated constructor stub	
		this.vehiculo = vehiculo;
		
	}
	public void Descripcion() {
		
		if (vehiculo == "Moto") {		
			
			System.out.println("Esto es una moto");
			
		}
		if (vehiculo == "Bici") {		
			
			System.out.println("Esto es una Bici");
		
		}
		
		if (vehiculo == "Coche") {		
		
		System.out.println("Esto es un Coche");
	
		}
	
		
	}

}
