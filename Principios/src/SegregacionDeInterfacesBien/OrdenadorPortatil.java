package SegregacionDeInterfacesBien;

public class OrdenadorPortatil implements CaracteristicasPortatil{

	public OrdenadorPortatil() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void MemoriaRam() {
		// TODO Auto-generated method stub
		System.out.println("El portatil tiene memoria RAM");
		
	}

	@Override
	public void Capacidad() {
		// TODO Auto-generated method stub
		System.out.println("El portatil tiene capacidad");
		
	}

	@Override
	public void Bateria() {
		// TODO Auto-generated method stub
		System.out.println("El portatil tiene bateria");
		
	}

	@Override
	public void Procesador() {
		// TODO Auto-generated method stub
		System.out.println("El portatil tiene procesador");
		
	}

}
