package Observer;

public class Alumno1 implements Observer{

	public Alumno1() {
		// TODO Auto-generated constructor stub
		
		
	}

	@Override
	public void update(int dia) {
		// TODO Auto-generated method stub
		System.out.println("Este es el alumno 1 y el día del examen es:" + dia);
	}

}
