/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import controlador.Controlador;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author docentes
 */
public class PanelPay extends JPanel implements ActionListener 
{
 // Relaciones de la clase 		
    private Controlador ctrl;
    
 // Atributos de la clase     
    private JButton         btnPay;
    private JRadioButton    rbtPayZonal, rbtPaySITP;  
    private ButtonGroup     rbtPay; 
            
 // Constructor 
    public PanelPay(Controlador ctrl)
    {
    // ..............................................( T, L, B, R ).............................................
       setBorder( new CompoundBorder( new EmptyBorder( 0, 0, 0, 0 ), new TitledBorder( " Pay " ) ) );
       setLayout( null );
	
    // Integra el controlador
       this.ctrl = ctrl;

    // Instancia atributos de la clase   
       rbtPayZonal = new JRadioButton(" Zonal ", true);
       rbtPaySITP = new JRadioButton(" Complementary / SITP ", false);
       rbtPay = new ButtonGroup( );
       
       rbtPayZonal.addActionListener(this);
       rbtPaySITP.addActionListener(this);
               
       rbtPayZonal.setBounds( 10, 20, 80, 20 );
       rbtPaySITP.setBounds( 90, 20, 200, 20 );
              
       btnPay = new JButton("Pay");              
       btnPay.addActionListener(this);
       btnPay.setBounds( 450, 20, 70, 20 );       
       
    // Agrega los atributos al panel
       add(btnPay);  
       add( rbtPayZonal ); add( rbtPaySITP ); 
       rbtPay.add( rbtPayZonal ); rbtPay.add( rbtPaySITP );          
    }   
    
    
    public void actionPerformed(ActionEvent e) 
    {if (e.getActionCommand().equals("Pay"))
     {   ctrl.pay(rbtPayZonal.isSelected());            
     }
    /*
    else
     { if (rbtPayZonal.isSelected())
       {   chkLeaveStation.setState(true); 
           chkLeaveStation.setEnabled(true);
       }  
       else
       {  if (rbtPaySITP.isSelected())
          {   chkLeaveStation.setState(false);
              chkLeaveStation.setEnabled(false);
          }    
       }  
     }
     */
    }
    
}
