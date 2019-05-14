package interfaz;
import mundo.*;
public class InterfazApp {
	
	
	public static void main(String[] args) {
		
		ClaseB ClaseB;
		ClaseB = new ClaseB(10,20);
		
		System.out.println(ClaseB.getX()+"\n" + ClaseB.getY());
		ClaseB.escribir("hola mundo");
		
		ClaseC ClaseC;
		ClaseC = new ClaseC();
		
		System.out.println(ClaseC.ejemplo());
		ClaseC.escribir("Interfaz");

	}

}
