package Decorator;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cine cine = new EntradaFamiliar();
		System.out.println(cine.getDescripcion() + ": " + cine.precio());
		
		Cine cine2 = new Chuches(new Bebida(new Palomitas(new EntradaBasica())));
		System.out.println(cine2.getDescripcion() + ": " + cine2.precio());
		
	}

}
