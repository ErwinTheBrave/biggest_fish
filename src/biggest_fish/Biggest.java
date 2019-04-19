package biggest_fish;

public class Biggest {
	static int biggest=0;
	public static void main(String[] args) {
		Aquarium aquarium = new Aquarium(10,10);
		biggest=aquarium.Run();
		System.out.println("The biggest hunter is ¹"+biggest+" and his weith is "+aquarium.getHunterWeith(biggest));
	}

}
