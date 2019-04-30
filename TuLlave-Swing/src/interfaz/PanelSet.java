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
public class PanelSet extends JPanel implements ActionListener 
{
 // Relaciones de la clase 		
    private Controlador ctrl;
    
 // Atributos de la clase     
    private JButton         btnRecharge, btnTicket, btnTransfer;
    private JTextField      txtRecharge, txtTicket, txtTransfer, txtBalance;
    private JLabel          lblRecharge, lblTicket, lblTransfer, lblBalance;
    
 // Constructor 
    public PanelSet(Controlador ctrl)
    {
    // ..............................................( T, L, B, R ).............................................
       setBorder( new CompoundBorder( new EmptyBorder( 0, 0, 0, 0 ), new TitledBorder( " Set values " ) ) );
       setLayout( null );
	
    // Integra el controlador
       this.ctrl = ctrl;

    // Instancia atributos de la clase   

    // Ticket value   
       lblTicket = new JLabel("Ticket:");
       lblTicket.setBounds( 10, 20, 70, 20 );       
       
       txtTicket = new JTextField("2400");
       txtTicket.setBounds( 10, 40, 70, 20 );       
             
       btnTicket = new JButton("T");              
       btnTicket.addActionListener(this);
       btnTicket.setBounds( 80, 40, 20, 19 );

    // Transfer  value   
       lblTransfer = new JLabel("Transfer:");
       lblTransfer.setBounds( 105, 20, 80, 25 );       
       
       txtTransfer = new JTextField("200");
       txtTransfer.setBounds( 105, 40, 70, 20 );       
       
       btnTransfer = new JButton("F");              
       btnTransfer.addActionListener(this);
       btnTransfer.setBounds(175, 40, 20, 19 );       
      
    // Recharge  value   
       lblRecharge = new JLabel("Recharge:");
       lblRecharge.setBounds( 200, 20, 70, 25 );       
       
       txtRecharge = new JTextField("30000");
       txtRecharge.setBounds( 200, 40, 70, 20 );       
       
       btnRecharge = new JButton("R");              
       btnRecharge.addActionListener(this);
       btnRecharge.setBounds( 270, 40, 20, 19 );       
       
    // Agrega los atributos al panel
       add(lblTicket); add(txtTicket); add(btnTicket); 
       add(lblTransfer); add(txtTransfer); add(btnTransfer);
       add(lblRecharge); add(txtRecharge); add(btnRecharge);  
    }   
    
    
    public void actionPerformed(ActionEvent e) 
    {if (e.getActionCommand().equals("T"))
     {   ctrl.ticketValue(Integer.parseInt(txtTicket.getText()));        
     }
     else
     if (e.getActionCommand().equals("F")) 
     {   ctrl.transferValue(Integer.parseInt(txtTransfer.getText()));              
     }
     else
     if (e.getActionCommand().equals("R"))
     {   ctrl.rechargeValue(Integer.parseInt(txtRecharge.getText()));              
     }    
    }
    
}
