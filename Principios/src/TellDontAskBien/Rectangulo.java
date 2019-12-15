package TellDontAskBien;

public class Rectangulo {

	// variables
	private int base;
	private int altura;
	private int area;
	private int perimetro;
	
	public Rectangulo() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public float calcularArea(int base, int altura) {
		area = base * altura;
		return area;
	}
	
	public float calcularPerimetro(int base, int altura) {
		perimetro = 2 * base + 2 * altura;
		return perimetro;
	}

}
