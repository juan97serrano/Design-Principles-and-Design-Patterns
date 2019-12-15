package Adapter;

public class AdaptadorCombustible implements Repostar{

	private CocheElectrico cocheelectrico;
	
	public AdaptadorCombustible(CocheElectrico cocheelectrico) {
		// TODO Auto-generated constructor stub
		super();
		this.cocheelectrico = cocheelectrico;
	}

	@Override
	public void repostar() {
		// TODO Auto-generated method stub	
		cocheelectrico.Echufar();
	}

	
}
