package humans;
import bases.Dice;
import bases.Human;

public class Wizard extends Human{

	public Wizard(String name, String wepon) {
		super(name,wepon);
		// TODO 自動生成されたコンストラクター・スタブ
		//HP 
		//super.setHp(super.setRandomValue(120,180));
		//Offense
		//super.setOffensive(super.setRandomValue(12,18));
		//HP 
		//super.setHp(super.setRandomValue(170,230));
		super.setHp(Dice.get(120,181));
		//Offense
		//super.setOffensive(super.setRandomValue(7,13));
		super.setOffensive(Dice.get(12,19));
	
	}
}