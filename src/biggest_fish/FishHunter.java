package biggest_fish;

public class FishHunter extends Fish{
  private int victims;
  
  public FishHunter(int weith) {
    super(weith);
    victims=0;
  }

  public void eat(FishVictim fish){
    this.weith+=fish.getWeith();
    victims++;
  }

  public int getVictims() {
    return victims;
  }
}