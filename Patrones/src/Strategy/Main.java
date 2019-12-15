package Strategy;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Personaje Personaje = new Personaje();
		
		Personaje.setComportamientoHorizontal(new Izquierda());
		
		Personaje.Horizontal();
		
		

	}

}
