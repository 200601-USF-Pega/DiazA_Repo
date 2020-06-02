package holder;

import com.revature.tourofheroes.models.Hero;
import com.revature.tourofheroes.exceptions.InvalidHealthValueException;

public class Driver {

	public static void main(String[] args)  {
		
		String[] specialMoves = {"heat vision", "flight", "invulnerability"};
		String[] specialMoves2 = {"flying"};
		
		Hero newHero;
		try {
			newHero = new Hero("Superman", specialMoves, 2, false);
			String[] specialMoves3 = newHero.getSpecialMove();
			System.out.println(specialMoves3[3]);
			System.out.println(newHero);
			
		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		} catch (InvalidHealthValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
			System.out.println("I tried so hard, and got so far!");
		}
		//try with resources - to read on
		Hero newHero2 = new Hero("Falcon", specialMoves2); 
		System.out.println(newHero2);
		
	}
	
}
