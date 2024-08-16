package humans;
import bases.Dice;
import bases.Human;

public class Brave extends Human{

	public Brave(String name, String wepon) {
		super(name, wepon);
		//HP 
		//super.setHp(super.setRandomValue(170,230));
		super.setHp(Dice.get(170,231));
		//Offense
		//super.setOffensive(super.setRandomValue(7,13));
		super.setOffensive(Dice.get(7,14));
		
	}
}