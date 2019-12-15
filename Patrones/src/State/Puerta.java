package State;

public class Puerta {

	// variables
	private EstadoPuerta estadoActual;
		
	private EstadoPuerta abierta;
	private EstadoPuerta cerrada;
	
	// Constructor
	public Puerta () {
		
		this.cerrada = new PuertaCerrada(this);
		this.abierta = new PuertaAbierta(this);
		
		estadoActual = cerrada;
	}

	// Estado actual de la puerta
	public EstadoPuerta getEstadoActual() {
		
		return estadoActual;
		
	}
	// Actualizar el estado actual de la puerta
	public void setEstadoActual(EstadoPuerta estadoActual) {
		
		this.estadoActual = estadoActual;
		
	}

	// Acciones del usuario
	public void pulsarOn() {
		estadoActual.botonOn();
	}
	
	public void pulsarOff() {
		estadoActual.botonOff();
	}
	
	// Getters de los estados
	public EstadoPuerta getPuertaAbierta() {
		
		return abierta;
		
	}
	
	public EstadoPuerta getPuertaCerrada() {
		
		return cerrada;
		
	}
	
}
