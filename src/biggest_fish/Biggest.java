package biggest_fish;

public class Biggest {
  static int biggest=0;
  public static void main(String[] args) {
    Aquarium aquarium = new Aquarium();
    aquarium.fill(10,20);
    aquarium.run();
    aquarium.getHunters();
  }
}