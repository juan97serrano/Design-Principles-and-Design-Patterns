package TellDontAskMal;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangulo a = new Rectangulo();
		
		int base = 2;
		int altura=3;
		int area = 0;
		
		
		a.setBase(base);
		a.setAltura(altura);
		
		area = a.getAltura()*a.getBase();
		
		System.out.println(area);
		
	}

}
