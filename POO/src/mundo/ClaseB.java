package mundo;

public class ClaseB extends ClaseA implements InterfazA{

	
	public ClaseB(int x, int y) {
		super(x,y);
	}
	
	@Override
	public int ejemplo() {

		return 0;
	}

	@Override
	public void escribir(String txt) {
		System.out.println(txt);
	}
	
	
}
