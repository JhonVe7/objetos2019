package mundo;

public class ClaseC implements InterfazA {

	public ClaseC() {
		
	}
	
	
	
	@Override
	public int ejemplo() {
		
		return 100;
	}

	@Override
	public void escribir(String txt) {
		System.out.println("hola mundo: "+ txt);
	}

}
