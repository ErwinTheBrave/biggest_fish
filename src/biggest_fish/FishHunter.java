package biggest_fish;

public class FishHunter extends Fish{

	public FishHunter(int weith) {
		super(weith);
	}
	
	public void eat(FishVictim fish){
		setWeith(weith+fish.getWeith());
	}
}