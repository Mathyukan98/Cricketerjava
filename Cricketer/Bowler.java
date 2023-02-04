public class Bowler extends Cricketer{
	int runs;
	int wickets;
	int balls;
	
	public Bowler((String name,String birthday,double height,String country,int runs,int wickets,int balls)
	{
		super(name,birthday,height,country);
		this.runs=runs;
		this.wickets=wickets;
		this.balls=balls;
	}
	double over=balls/6.0;
	public double getBowlingAverage(){
		double BowlingAverage=runs/wickets;
		return BowlingAverage;
	}
	public double getBowlingEcnomyrate(){
		double BownlingeconomyRate=runs/overs;
		return BownlingeconomyRate;
	}
	public double getBowlingStrikerate(){
		
	}
	
	
	