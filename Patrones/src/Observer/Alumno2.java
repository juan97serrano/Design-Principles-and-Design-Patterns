package Observer;

public class Alumno2 implements Observer{

	public Alumno2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(int dia) {
		// TODO Auto-generated method stub
		System.out.println("Este es el alumno 2 y el día del examen es:" + dia);
	}

}
