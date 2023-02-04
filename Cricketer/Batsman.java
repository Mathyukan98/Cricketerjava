public class Batsman extends Cricketer{
	int run;
	int innings;
	int ballfaced;
	
	public Batsman(String name,String birthday,double height,String country,int run,int innings,int ballfaced)
	{
		super(name,birthday,height,country);
		this.run=run;
		this.innings=innings;
		this.ballfaced;
		
	}
	public double getBittingAverage(){
		double BattingAverage=run/innings;
		return BattingAverage;
	}
	public double getBittingStrikerate(){
		double BattingStrikeRate=100*runs/ballfaced;
		return BattingStrikeRate;
	}
	public boolean checkSuitabillty(){
		boolean x=false;
		if(getBittingStrikerate()>100)
		{
			x=ture;
		}
		else
		{
			x=false;
		}
		return x;
	}
	public int calculateHighest(int[] array)
	{
		int v=0;
		if(array[x]>v){
			v=array[x];
		}
	}
	return v;
}