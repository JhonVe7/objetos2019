package mundo;

public class TuLlave 
{// Atributos
	
	
	/** private String name;
    private int balance, transferValue, ticketValue, pendingValue;
    private int id, series;
    private boolean transbordo, swLastType;
    */
	private String name ; 
	private int	balance, transferValue, ticketValue, pendingValue;
	private int id, series;
	private boolean transbordo, swLastType;
	
	
	
 // Constructor
	
	/** public TuLlave(int id, String name, int series)
	    {  this.id = id;
	       this.name = name;
	       this.series = series;
	       this.transbordo = false;
	       this.swLastType = false;
	    }
	   */
	
	
    public TuLlave(int id, String name, int series){
    	
    	this.id = id;
    	this.name = name;
    	this.series = series;
    	this.transbordo = false;
    	this. swLastType = false;
    }
    
 // Metodos getters & setters
    
    public String getName(){return name;}
	public void setName(String name){this.name = name;}

	public int getBalance(){return balance;}
	public void setBalance(int balance){this.balance = balance;}

	public int getTransferValue(){return transferValue;}
	public void setTransferValue(int transferValue) {this.transferValue = transferValue;}

	public int getTichetValue(){return ticketValue;}
	public void setTichetValue(int tichetValue) {this.ticketValue = tichetValue;}

	public int getPendingValue(){return pendingValue;}

	public void setPendingValue(int pendingValue) {this.pendingValue = pendingValue;}

	public int getId(){return id;}
	public void setId(int id){this.id = id;}

	public int getSeries(){return series;}
	public void setSeries(int series){this.series = series;}

	public boolean isTransbordo(){return transbordo;}
	public void setTransbordo(boolean transbordo){this.transbordo = transbordo;}

	public boolean isSwlastType(){return swLastType;}
	public void setSwlastType(boolean swlastType){this.swLastType = swlastType;}

        
 // Metodos funcionales
    
    /**
     * value: Valor a recargar
     */ 
    public void recharge(int value){ 
    	this.balance += value;    
    }        
	/**
     * true: Payment in Transmilenio
     * false: Payment in Complementario o SITP 
     */
    public boolean pay(boolean type){
    	
    	if (type){	// Transmilenio
      	  
      	  //if (swLastType && swTransfer) swTransfer = false;
            
            if (transbordo){
          	  if (balance < transferValue){
          		  if (Math.abs(balance - transferValue) <= (2 * ticketValue)){
                       balance = balance - transferValue;                  
                    }
                    else{
                       return false;                  
                    }
                }
                else{     
                  balance = balance - transferValue;          
                }
                transbordo = false;
            }
            else{
              if (balance < ticketValue) { 
                   if (Math.abs(balance - ticketValue) <= (2 * ticketValue)) {
                      balance = balance - ticketValue;
                    }
                    else{ 
                      return false;
                    }
               }
               else{    
                 balance = balance - ticketValue;
               }
               transbordo = true;
            }
            swLastType = true;
        }
        else
        if (type){ 	// Transmilenio + Transmilenio 
           // No hay cobro /
        }
        else {      		// Complementario / SITP
           if (!transbordo){ 
              if (balance < ticketValue){  
                 if (Math.abs(balance - ticketValue) <= (2 * ticketValue)){
                       balance = balance - (ticketValue - transferValue);                  
                    }
                    else {
                       return false;
                    }
                }
                else{   
                   balance = balance - (ticketValue - transferValue);
                }
                transbordo = true;
            }
            else {
               transbordo = false;          
            }
            swLastType = false;
        }       
        return true;
    }
}   
    
