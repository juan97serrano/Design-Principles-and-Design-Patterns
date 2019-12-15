package State;

public class PuertaAbierta implements EstadoPuerta{

	private Puerta puerta;
	
	public PuertaAbierta(Puerta puerta) {
		// TODO Auto-generated constructor stub
		this.puerta = puerta;
	}

	@Override
	public void botonOn() {
		System.out.println("Botón ON, puerta abierta");
		puerta.setEstadoActual(puerta.getPuertaAbierta());
		
	}

	@Override
	public void botonOff() {
		System.out.println("Botón OFF, puerta cerrada");
		puerta.setEstadoActual(puerta.getPuertaCerrada());
		
	}

}
