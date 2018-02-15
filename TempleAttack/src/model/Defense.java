package model;

public abstract class Defense {
	

	
	
	private double location;
	private double attackStrength;
	private BARRIER type;
	private double healthPoints;


	public Defense( BARRIER type) {
		this.type = type;
		
		switch(type){
		
			case WALL:
				//TODO
				
			case TRAPDOOR:
				//TODO
				
			case SPIKES:
				//TODO
				
			case LANDMINE:
				//TODO
				
			case TRENCH:
				//TODO
				
			default:
				throw new RuntimeException("Defense Barrier Issue");
				
			
			}
		}
		
	}
	
	public double RenderEffect(Unit target){
		// TODO
		
		return 10.00;
	}
	
	

}
