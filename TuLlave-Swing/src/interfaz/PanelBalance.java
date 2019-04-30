package interfaz;

import java.awt.Font;

import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author docentes
 */
public class PanelBalance extends JPanel 
{
 // Atributos de la clase     
    private JLabel lblValue;
    
 // Constructor 
    public PanelBalance()
    {
    // ..............................................( T, L, B, R ).............................................
       setBorder( new CompoundBorder( new EmptyBorder( 0, 0, 0, 0 ), new TitledBorder( " Balance " ) ) );
       setLayout( null );
	
    // Integra el controlador

    // Instancia atributos de la clase   
       Font font = new Font("Arial", Font.BOLD, 40);
       
       lblValue = new JLabel("");
       lblValue.setFont(font);
       lblValue.setHorizontalAlignment( JLabel.CENTER );
       lblValue.setBounds( 30, 15, 170, 50 );       
       
    // Agrega los atributos al panel
       add(lblValue);
    }
    
    public void setBalance(int value)
    { lblValue.setText(transform(value+""));        
    }
    
    private String transform(String dsp){
    	String trn=""; int tree=0, index = 0, decimal = dsp.length()-1;
		
	  while (index <= dsp.length()-1){
		  if (dsp.charAt(index) == '.')
			  break;
		  index++;
	  }
	  
	  if (index <= dsp.length()-1) {
		  decimal = index-1;
		  trn = dsp.substring(index);
	  }
	  
	  for (int i=decimal; i>=0; i--){
		
		if (tree < 2){
			trn = dsp.charAt(i) + trn; tree++; 
		}
	    else{
	    	
	    	if ((i > 0) && dsp.charAt(i-1) != '-' ) trn = "," + dsp.charAt(i) + trn;
	    	else  trn = dsp.charAt(i) + trn;
	    	tree=0;
	    }
		
	  }
	  return trn;	
	}
    
}
