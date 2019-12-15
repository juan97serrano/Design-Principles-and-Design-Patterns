package ResponsabilidadUnicaBien;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resta resta = new Resta();
		Suma suma = new Suma();
		
		System.out.println("El resultado de la resta es: "+resta.operacionResta(8));
		System.out.println("El resultado de la suma es: "+suma.operacionSuma(8));
	}

}
