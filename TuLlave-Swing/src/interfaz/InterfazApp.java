package interfaz; 


import java.awt.*;
import javax.swing.*;
import controlador.*;
import win.Win;

public class InterfazApp extends JFrame
{ 
// Clases relacionadas
    private Controlador ctrl;
    private PanelPay pnlPay;
    private PanelSet pnlSet;
    private PanelBalance pnlBalance;

    
 // Constructor
    public InterfazApp( Controlador ctrl ) 
    { setTitle( "TuLlave" );   
      getContentPane( ).setLayout( null );
    
   // Integra el Controlador 
      this.ctrl = ctrl;
   	  
   // Instancia los paneles    
      pnlSet = new PanelSet(ctrl); 
      pnlSet.setBounds(0, 10, 300, 70);
      
      pnlBalance = new PanelBalance(); 
      pnlBalance.setBounds(300, 10, 232, 70);

      pnlPay = new PanelPay(ctrl);
      pnlPay.setBounds(0, 100, 532, 50);     

   // Organizar el panel principal 
      getContentPane( ).add( pnlSet);
      getContentPane( ).add( pnlBalance);
      getContentPane( ).add( pnlPay);
     
   // Conecata objetos a controlar   
      ctrl.conectar( pnlBalance );
      
      setSize( 540, 200 );      
      setResizable( false );
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      
   // Centrar ventana.
      Win.centrarVentana( this );      
    }    

//  Ejecución.		
    public static void main(String args[])
    { InterfazApp frmMain = new InterfazApp(new Controlador());
      frmMain.setVisible( true );	  
    }		
}