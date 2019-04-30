package controlador;

import interfaz.PanelBalance;
import mundo.*;

public class Controlador
{   
 // Objetos controlables de la interfaz 	
    private PanelBalance pnlBalance;
    
 // Objetos del mundo    
    private TuLlave tuLlave;
    
 // Constructor	
    public Controlador()
    { // Instanciar la clase principal del modelo
         
    }
	
 // Recibe las referencias de los objetos a controlar en la interfaz	
    public void conectar( PanelBalance pnlBalance )
    { this.pnlBalance = pnlBalance;
    }

 // -----------------------------------------------	
 // Implementación de los requerimientos de usuario	
 // -----------------------------------------------

    public void pay(boolean type)
    { 
    }   
    
    public void ticketValue(int ticketValue) 
    { 
    }
    
    public void transferValue(int transferValue) 
    { 
    }

    public void rechargeValue(int value) 
    { 
    }
            
}