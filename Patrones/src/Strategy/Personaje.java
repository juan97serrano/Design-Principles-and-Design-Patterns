package Strategy;

public class Personaje {
	
	private ComportamientoHorizontal comportamientoHorizontal;
	private ComportamientoVertical comportamientoVertical;

	public Personaje() {
		
		comportamientoHorizontal = new Izquierda();
		comportamientoVertical = new Arriba();
		
	}

	public void setComportamientoHorizontal(ComportamientoHorizontal comportamientoHorizontal) {
		this.comportamientoHorizontal = comportamientoHorizontal;
	}

	public void setComportamientoVertical(ComportamientoVertical comportamientoVertical) {
		this.comportamientoVertical = comportamientoVertical;
	}
	
	
	public void Horizontal() {
		this.comportamientoHorizontal.Horizontal();
	}
	
	public void Vertical() {
		this.comportamientoVertical.Vertical();
	}
	
}
