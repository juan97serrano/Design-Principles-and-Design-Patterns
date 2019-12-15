package Singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Linterna L = Linterna.getInstance();
		
		L.Encender();
			
		Linterna L1 = Linterna.getInstance();
		L1.Encender();
		
	}

}
