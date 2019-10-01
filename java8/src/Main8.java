public class Main8 {
	public static void main(String[]args){
		Sword s = new Sword();
		s.name ="炎の剣";
		s.damage = 10;

		Hero h1=new Hero();
		System.out.println(h1.hp);
		System.out.println(h1.name);
		h1.sword = s;
		System.out.println("現在の武器は"+ h1.sword.name);

		Hero h2 = new Hero();
		h2.hp = 100;

		Tue t = new Tue();
		Tue.name="祈りの杖";
		t.damage = 3;

		Cleric c1 = new Cleric("クレサン", 80, 10);

		System.out.println("現在の武器は"+Tue.name);

		Wizard w =new Wizard();
		w.name="スガワラ";
		w.hp = 50;
		w.heal(h1); //ミナトを回復させる(HP:100→110)
		w.heal(h2); //アサカを回復させる(HP:100→110)

		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = '8';

		//冒険の始まり
		c1.selfAid();
		h1.slip();
		w.heal(h1);
		m1.run();
		m2.run();
		h1.run();
		c1.run();
	}
}