package model;
/*
 * 
 * 
 * 
 * 
 * */
import java.util.ArrayList;

public class Funds {
	
	private int funds;
	
	public Funds(){
		
		
	}
	
	public boolean Transaction(int cost) throws InsufficientFundsException{
		if (Validate(cost)){
			this.funds = this.funds-cost;
			return true;
		}
		else{
			throw new InsufficientFundsException("Funds Too Low");
			
		}
	}

	private boolean Validate(int purchasePrice){
		//TODO make sure everything is updated, then check funds
		return false;
	}
	
	public int addFunds(int amount){
		return this.funds += amount;
	}
	
	
	
	
	
}
