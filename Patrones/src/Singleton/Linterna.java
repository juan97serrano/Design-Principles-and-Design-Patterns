package Singleton;

public class Linterna {
	
	private static Linterna singleton;
	private static int on = 0;
	
	private Linterna() {
		// TODO Auto-generated constructor stub
	}
	
	public void Encender() {
		if(on == 0) {
			on = 1;
			System.out.println("La linterna esta encendida");
		} else {
			
			System.out.println("La linterna ya esta encendida");
		}
		
	}
	public void Apagar() {
		
		if(on == 1) {
			on = 0;
			System.out.println("La linterna esta apagada");
		} else {
			
			System.out.println("La linterna ya esta apagada");
		}
			
	}
	
	public static Linterna getInstance() {
		// Si ya se ha instanciado la clase una vez nos devolvera siempre el mismo valor(el primero)
		if(singleton == null) {
			
			singleton = new Linterna();
		}
		return singleton;
		
	}
}
