package Interfaz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class InterfazApp extends JFrame implements ActionListener{
	
	private PanelA PanelA;

	public InterfazApp() {
		
		PanelA = new PanelA();
		setResizable(false);
		setSize (400,400);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
	
	
	public static void main(String[] args) {
		
		InterfazApp frmMain = new InterfazApp();
		frmMain.setVisible(true);
		
	}

}
