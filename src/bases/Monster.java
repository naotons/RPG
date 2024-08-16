package bases;

public class Monster extends Living {

	public Monster(String name, String wepon) {
		super(name, wepon);
	}
	
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
        //Random rand = new Random();
        //int value = rand.nextInt(1, 11);
		int value = Dice.get(1, 11);
		int damegePoint = value * this.getOffensive();

		// 相手のHPをダメージ値だけ減らす
		int nowTargetHp = target.getHp();
		target.setHp(nowTargetHp - damegePoint);

		System.out.println(this.getName() + "は" + this.getWeapon() + "で攻撃！\n" + target.getName() + "に"+damegePoint +"のダメージを与えた！！");
		// コンソールにステータスを表示
		//System.out.println(target.getName() + "は" + damegePoint +"のダメージ！！");
		// コンソールにステータスを表示
		//System.out.println(target.toString());
	}
	
}
