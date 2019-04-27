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
      System.out.println("Hunter number "+hunterNum+" wight weight "+
          hunters.get(hunterNum).getWeight()+" eats his victim wight weight "+
          victims.get(victimNum).getWeight());
      hunters.get(hunterNum).eat(victims.get(victimNum));	
      victims.remove(victimNum);
    }
  }

  public void getHunters() {
    int biggest=0;
    for (int i=0; i<hunters.size(); i++) {
      System.out.println("Weight of hunter ¹"+i+" is "+hunters.get(i).getWeight());
      if (hunters.get(i).getWeight()>hunters.get(biggest).getWeight()) {
        biggest=i;
      }
    }
    System.out.println("The biggest hunter is ¹"+biggest+" wight weight "+
        hunters.get(biggest).getWeight()+" and "+hunters.get(biggest).getVictims()+" fishes eaten");
  }
}