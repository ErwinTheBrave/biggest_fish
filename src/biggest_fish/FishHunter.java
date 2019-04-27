package biggest_fish;

public class FishHunter extends Fish{
  private int victims;
  
  public FishHunter(int weight) {
    super(weight);
    victims=0;
  }

  public void eat(FishVictim fish){
    this.weight+=fish.getWeight();
    victims++;
  }

  public int getVictims() {
    return victims;
  }
}