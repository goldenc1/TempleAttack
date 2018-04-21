package model;
/*
 * 
 * 
 * 
 * 
 * */

public class Funds {
	
	private static Funds funds_instance = new Funds(); // for singleton pattern
	protected static int coins;
	protected final static int INITIAL_FUNDS = 100; //100 coins to start
	private Funds(){
		coins = INITIAL_FUNDS;
	}
	
	protected static boolean Transaction(int cost) throws InsufficientFundsException{
		if (Validate(cost)){
			coins = coins-cost;
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
	
	public int addFunds(int amount){  //
		return this.coins += amount;
	}
	
	
	 // static method to create instance of Singleton class
    public static Funds Singleton()
    {
        // To ensure only one instance is created
        if (funds_instance == null)
        {
        	funds_instance = new Funds();
        }
        return funds_instance;
    }
	
	
	
	
}
