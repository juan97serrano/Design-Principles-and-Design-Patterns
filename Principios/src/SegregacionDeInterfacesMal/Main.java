package SegregacionDeInterfacesMal;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OrdenadorPortatil portatil = new OrdenadorPortatil();
		OrdenadorSobremesa sobremesa = new OrdenadorSobremesa();
		
		portatil.Bateria();
		portatil.Capacidad();
		portatil.MemoriaRam();
		portatil.Procesador();
		
		sobremesa.Bateria();
		sobremesa.Capacidad();
		sobremesa.MemoriaRam();
		sobremesa.Procesador();
		
	}

}
