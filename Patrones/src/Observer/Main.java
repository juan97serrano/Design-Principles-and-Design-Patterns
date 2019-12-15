package Observer;

public class Main {

	public Main() {
		
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int dia = 4;
		
		Asignatura asignatura = new Asignatura(dia);
		
		asignatura.addObserver(new Alumno1());
		asignatura.addObserver(new Alumno2());
		asignatura.addObserver(new Alumno3());
		
		System.out.println("El día inicial del examen es: "+ asignatura.getDia());
		System.out.println("El profesor cambia el día del examen al día 7");
		System.out.println("Se avisa a los alumnos");
		asignatura.setDia(7);
		
	}

}
