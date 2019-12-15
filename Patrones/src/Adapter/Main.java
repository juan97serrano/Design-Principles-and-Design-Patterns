package Adapter;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CocheElectrico cochelectrico = new CocheElectrico();
		CocheAMotor moto = new CocheAMotor();
		MotoAMotor coche = new MotoAMotor();
		
		cochelectrico.Echufar();
		moto.repostar();
		coche.repostar();
	}

}
