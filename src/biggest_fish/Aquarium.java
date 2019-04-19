package biggest_fish;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aquarium {
	
	List<FishHunter> hunters;
	List<FishVictim> victims;
	int fishHunters, fishVictims;
	
	public int getHunterWeith(int hunterNum){
		return hunters.get(hunterNum).getWeith();
	}
	
	public Aquarium(int fishHunters, int fishVictims) {
		hunters = new ArrayList<FishHunter>();
		victims = new ArrayList<FishVictim>();
		for (int i=0; i<fishHunters; i++){
			hunters.add(new FishHunter(new Random().nextInt(100)+1));
		}
		for (int i=0; i<fishVictims; i++){
			victims.add(new FishVictim(new Random().nextInt(100)+1));
		}
		this.fishHunters=fishHunters;
		this.fishVictims=fishVictims;
	}
	
	public int Run(){
		int hunterNum, victimNum, weith=0;
		while ((fishHunters!=0)&(fishVictims!=0)){
			hunterNum = new Random().nextInt(fishHunters);
			victimNum = new Random().nextInt(fishVictims);
			System.out.println("Hunter number "+hunterNum+" with weith "+hunters.get(hunterNum).getWeith()+
					" eats his victim with weith "+victims.get(victimNum).getWeith());
			hunters.get(hunterNum).eat(victims.get(victimNum));	
			victims.remove(victimNum);
			fishVictims--;
		}
		hunterNum=0;
		for (int i=0; i<fishHunters; i++) {
			if (hunters.get(i).getWeith()>weith) {
				weith=hunters.get(i).getWeith();
				hunterNum=i;
			}
		}
		return hunterNum;
	}
	
}
