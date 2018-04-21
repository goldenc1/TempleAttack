package model;
/*
 * 
 * 
 * 
 * 
 * */
import java.util.ArrayList;

public class Funds {
	
	private static int funds;
	
	public static void Funds(){
		
		
	}
	
	public static boolean Transaction(int cost) throws InsufficientFundsException{
		if (Validate(cost)){
			funds = funds-cost;
			return true;
		}
		else{
			throw new InsufficientFundsException("Funds Too Low");
			
		}
	}

	private static boolean Validate(int purchasePrice){
		//TODO make sure everything is updated, then check funds
		return false;
	}
	
	public int addFunds(int amount){
		return this.funds += amount;
	}
	
	
	
	
	
}
