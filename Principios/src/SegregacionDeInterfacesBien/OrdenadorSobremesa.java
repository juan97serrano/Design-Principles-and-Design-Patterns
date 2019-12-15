package SegregacionDeInterfacesBien;

public class OrdenadorSobremesa implements CaracteristicasSobremesa{

	public OrdenadorSobremesa() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void MemoriaRam() {
		// TODO Auto-generated method stub
		System.out.println("El ordenador tiene memoria RAM");
		
	}

	@Override
	public void Capacidad() {
		// TODO Auto-generated method stub
		System.out.println("El ordenador tiene capacidad");
		
	}

	@Override
	public void Procesador() {
		// TODO Auto-generated method stub
		System.out.println("El ordenador tiene procesador");
		
	}


}
