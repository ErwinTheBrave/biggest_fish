package biggest_fish;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aquarium {
  List<FishHunter> hunters;
  List<FishVictim> victims;

  public Aquarium() {
    hunters = new ArrayList<FishHunter>();
    victims = new ArrayList<FishVictim>();
  }
	
  public void fill(int fishHunters, int fishVictims) {
    for (int i=0; i<fishHunters; i++){
      hunters.add(new FishHunter(new Random().nextInt(100)+1));
    }
    for (int i=0; i<fishVictims; i++){
      victims.add(new FishVictim(new Random().nextInt(100)+1));
    }
  }

  public void run(){
    int hunterNum;
    int victimNum;
    while ((hunters.size()>0)&(victims.size()>0)){
      hunterNum = new Random().nextInt(hunters.size());
      victimNum = new Random().nextInt(victims.size());
      System.out.println("Hunter number "+hunterNum+" with weith "+
          hunters.get(hunterNum).getWeith()+" eats his victim with weith "+
          victims.get(victimNum).getWeith());
      hunters.get(hunterNum).eat(victims.get(victimNum));	
      victims.remove(victimNum);
    }
  }

  public void getHunters() {
    int biggest=0;
    for (int i=0; i<hunters.size(); i++) {
      System.out.println("Weith of hunter ¹"+i+" is "+hunters.get(i).getWeith());
      if (hunters.get(i).getWeith()>hunters.get(biggest).getWeith()) {
        biggest=i;
      }
    }
    System.out.println("The biggest hunter is ¹"+biggest+" with weith "+
        hunters.get(biggest).getWeith()+" and "+hunters.get(biggest).getVictims()+" fishes eaten");
  }
}