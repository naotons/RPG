package bases;

public class Human extends Living {

	public Human(String name, String wepon) {
		super(name, wepon);
	}
	
	// attackメソッドのオーバーライド
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

		// 自分の攻撃力を1だけ減らす
		int nowMyOffensive = this.getOffensive();
		this.setOffensive(nowMyOffensive - 1);

		System.out.println(this.getName() + "は" + this.getWeapon() + "で攻撃！\n"+ target.getName() +"に" +damegePoint +"のダメージを与えた！！");
		System.out.println("しかし自分の攻撃力も１減少した。");
		// コンソールにステータスを表示
		//System.out.println(target.toString());

	}
}
