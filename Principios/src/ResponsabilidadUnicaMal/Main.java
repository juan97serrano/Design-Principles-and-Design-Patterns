package ResponsabilidadUnicaMal;

public class Main {

	static int a;public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calcular calculo = new Calcular();
		
		int a = calculo.suma(5);
		int b = calculo.resta(5);
		
		System.out.println("El resultado de la suma es: "+a);
		System.out.println("El resultado de la suma es: "+b);
	}

}
