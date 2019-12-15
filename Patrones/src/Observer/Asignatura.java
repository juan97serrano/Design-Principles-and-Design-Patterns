package Observer;

import java.util.ArrayList;

public class Asignatura {
	
	private int dia;
	
	private ArrayList<Observer> alumnos;

	public Asignatura(int dia) {
		// TODO Auto-generated constructor stub
		this.dia = dia;
		
		alumnos = new ArrayList<Observer>();
		
	}

	public void setDia(int dia) {
		
		this.dia = dia;
		
		notifyObserver();

	}

	public int getDia() {
		
		return dia;
		
	}

	private void notifyObserver() {
		
		// TODO Auto-generated method stub
		for(Observer o : alumnos) {
			
			o.update(this.dia);
			
		}
		
	}
	public void addObserver(Observer o) {
		
		alumnos.add(o);
		
	}
	
	public void removeObserver(Observer o) {
		
		alumnos.remove(o);
		
	}

}
