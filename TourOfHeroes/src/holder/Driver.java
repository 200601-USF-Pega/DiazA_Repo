package holder;

public class Driver {

	public static void main(String[] args) {
		
		String[] specialMoves = {"heat vision", "flight", "invulnerability"};
		String[] specialMoves2 = {"flying"};
		
		Hero newHero = new Hero("Superman", specialMoves);
		Hero newHero2 = new Hero("Falcon", specialMoves2); 
		
		System.out.println(newHero);
		System.out.println(newHero2);
	}
	
}
