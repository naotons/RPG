package monsters;
import bases.Dice;
import bases.Monster;
public class Dragon extends Monster{

	public Dragon(String name, String wepon) {
		super(name,wepon);
		// TODO 自動生成されたコンストラクター・スタブ
		//HP 
		//super.setHp(super.setRandomValue(70,130));
		//Offense
		//super.setOffensive(super.setRandomValue(5,11));
		//HP 
		//super.setHp(super.setRandomValue(170,230));
		super.setHp(Dice.get(270,330));
		//Offense
		//super.setOffensive(super.setRandomValue(7,13));
		super.setOffensive(Dice.get(12,18));
	}

}
