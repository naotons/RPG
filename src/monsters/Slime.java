package monsters;
import bases.Dice;
import bases.Monster;
public class Slime extends Monster{

	public Slime(String name, String wepon) {
		super(name,wepon);
		// TODO 自動生成されたコンストラクター・スタブ
		//HP 
		///super.setHp(super.setRandomValue(70,130));
		//Offense
		//super.setOffensive(super.setRandomValue(5,11));
		//HP 
		//super.setHp(super.setRandomValue(170,230));
		super.setHp(Dice.get(70,130));
		//Offense
		//super.setOffensive(super.setRandomValue(7,13));
		super.setOffensive(Dice.get(5,11));
	}

}
